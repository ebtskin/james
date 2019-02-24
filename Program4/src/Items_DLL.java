/*Name: James Vo
 * Description: Manages the DLL of restaurant menus. 
 */
public class Items_DLL extends Util {
	
	protected String item_num; // order number
	protected String item_desc; // order description
	protected Items_DLL next; // DLL next
	protected Items_DLL previous; // DLL previous
	
	//Constructor to set order number and description
	Items_DLL(String item_num, String item_desc)
	{
		this.item_num = item_num;
		this.item_desc = item_desc;
		this.next = null;
		this.previous = null;
	}
	
	//Return the previous pointer
	public Items_DLL getPrevious()
	{
		return this.previous;
	}
	//Return the next pointer
	public Items_DLL getNext()
	{
		return this.next;
	}
	//Set the next pointer with a Items_DLL pointer
	public void setNext(Items_DLL next)
	{
		this.next = next;
	}
	//Set the previous pointer with a Items_DLL pointer
	public void setPrevious(Items_DLL previous)
	{
		this.previous = previous;
	}
	//Display the individual menu item
	public void display()
	{
		System.out.println(item_num + " " + item_desc);
	}

}
