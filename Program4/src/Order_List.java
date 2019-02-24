/*Name: James Vo
 * Description: This class manage the linear linked list of order
 */

public class Order_List extends Menu_List {
	
	protected Order_LLL head; // LLL head
	protected Order_LLL tail; // LLL tail 
	protected String fileName;
	
	//Constructor to set head and tail to null and to initiate the hierarchy constructor with parameter to set
	Order_List(String customer_name, String storeName)
	{
		super(customer_name, storeName);
		fileName = "data.txt";
		super.add(fileName);
		super.display();
		this.head = null;
		this.tail = null;
	}
	
	//Add wrapper function to call the add node
	@Override
	public void add(String storeName)
	{
		head = lll(head, storeName);
	}
	//Recursively add a node to the end of the LLL
	public Order_LLL lll (Order_LLL head, String storeName)
	{
		if(head == null)
		{
			head = new Order_LLL(storeName);
			tail = head;
			return head;
		}
		
		head.setNext(lll(head.getNext(), storeName));
		return head;
			
	}
	
	//Recursively display the LLL
	protected void display(Order_LLL head)
	{
		Order_LLL current = head;	
		
		if(current == null)
			return;
		head.display();
		display(head.getNext());
	}
	
	//Display the Order LLL
	@Override
	public void display()
	{
		display(head);
	}

}
