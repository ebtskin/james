import java.io.*;
import java.util.*;

/*Name: James Vo
 * Description: This class is responsible for managing the DLL of Menus
 */
public class Menu_List extends Resturant {
	
	protected Items_DLL head; //head pointer to DLL
	protected Items_DLL tail;
	protected Scanner in; //in variable to read from file
	protected Menu_List menuPtr;
	protected String fileName;

	
	//Constructor with parameter filename to invoke read_menu function and storeName to set in the derived Restaurant class
	Menu_List(String customer_name, String storeName)
	{
		super(customer_name, storeName); 
		fileName = "data.txt"; // for testing purpose
		this.tail = null;
		this.head = null;
	}
	
	public boolean open_file(String fileName)
	{
		try 
		{
			in = new Scanner(new File(fileName));
			return true;
		}
		catch(Exception e)
		{
			System.out.println("File not found!");
			return false;
		}		
	}
	
	//This read an external menu from input fileName and add it in a DLL
	@Override
	public void add(String fileName)
	{
		String item_desc;  //temp to hold item description from external file
		String item_num;	  //temp to hold item number from external file
		
		//Open the fileName
		if(open_file(fileName) == true)
		{
		// Read in file
		while(in.hasNext())
		{
			item_num = in.next();
			item_desc = in.next();			
		
			Items_DLL temp = new Items_DLL(item_num, item_desc); //This invoke the Items_DLL to create an object with item number and description
		
			if(head == null)
			{
				head = temp;
				tail = head;
			}
			else
			{
				temp.setPrevious(tail);
				tail.setNext(temp);
				tail = temp;
			}
		}
		
		}
		in.close();
	}
	
	//Display the menu DLL
	@Override
	public void display()
	{
		Items_DLL current = this.head;
		
		while(current != null)
		{
			current.display();
			current = current.getNext();
		}
	}
	
	
}
