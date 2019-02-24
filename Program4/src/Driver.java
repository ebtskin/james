import java.io.*;
import java.util.Scanner;
public class Driver extends Util
{
	protected Vertex[] vertex_list; //Create the vertex of restaurant name
	protected int max; //Max vertex size for testing purpose
	protected Customer custPtr;
	protected String fileName;
	protected Scanner in; 
	
	//Constructor to pass up the Vertex store name and driver info
	Driver() 
	{ 
		this.max = 10; //For testing purpose
		this. custPtr = null;
		this.fileName = "driverly.txt";
		this.vertex_list = new Vertex[max]; //For testing I'm just setting a max size of restaurant 
		
		for(int i = 0; i < 10; ++i) //Set all the vertex to null;
			vertex_list[i] = null;
		
	}
	
	//This function will select the nearest driver that's not busy from the restaurant adjacency LLL. 
	public void select_driver(String storeName, String customer_name, BST ptr)
	{
		for(int i = 0; i < max; ++i)
		{
				if(vertex_list[i] == null)
					return;
			
				else if(vertex_list[i].biz_name.compareTo(storeName) == 0)
				{
				helper(vertex_list[i].head, i, ptr);
				}
		}
		
	}
	
	public void helper(Vertex_LLL vHead, int i, BST ptr)
	{
		if (vHead == null)
			return;
		
		else if(vertex_list[i].head.not_busy == false)
		{
			vertex_list[i].head.setBST(ptr);
			vertex_list[i].head.display();
			return;
		}
		helper(vHead.getNext(), ++i, ptr);
		
	}
	//This function will either add a new restaurant and driver or only a driver if the restaurant already exist. 
	public void add(String driver_name, String storeName, String miles_from)
	{
		
		for (int i = 0; i < 10; ++i)
		{
			if(vertex_list[i] == null)
			{
				vertex_list[i] = new Vertex(driver_name, storeName, miles_from);
				return;
			}
			else
			{
				if(vertex_list[i].biz_name.compareTo(storeName) == 0)
				{
					vertex_list[i].add_vertex_node(driver_name, miles_from);
					return;
				}
			}
		}
		System.out.println("List is full!");
	}

	//Display the Vertex and adjacency graph
	public void display()
	{
		for (int i = 0; i < 10; ++i)
		{
			if(vertex_list[i] == null) 
				return;
			
			if(vertex_list[i].head != null)
			{
				vertex_list[i].display();
			}
		}
	}
	
	public void input_driver()
	{
		String driver_name;  //temp to hold item description from external file
		String biz_name;	  //temp to hold item number from external file
		String miles_from;	//temp ETA
		
		System.out.println("I'm in the add file in");
		//Open the fileName
		if(open_file() == true)
		{
		// Read in file
			while(in.hasNext())
			{
				biz_name = in.next();
				driver_name = in.next();	
				miles_from = in.next();
		
				add(driver_name, biz_name, miles_from); // call the add function to create a new vertex and add to adjacency list.

			}
		}
		in.close();
	}
	
	public boolean open_file()
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
}