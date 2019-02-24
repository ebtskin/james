public class Vertex
{
	/*
	 * Name: This class build the Vertex of restaurant name
	 */
	
	protected Vertex_LLL head; //head pointer
	protected boolean visted; // flag visited
	protected String biz_name; //business name
	
	//Constructor with parameter to set store name and to create a new adjacency LLL node;
	Vertex(String driver_name, String storeName, String distance)
	{
		this.biz_name = storeName; //Set the Vertex business name
		this.head = add(head, driver_name, distance); //Create a new adjacency list node with the driver information
		
	}
	
	//If restaurant name already exist, this will create a new node
	public void add_vertex_node(String driver_name, String distance)
	{
		this.head = add(head, driver_name, distance); //Create a new adjacency list node with the driver information
	}

	//Recursively add to the adjacency linear linked list
	public Vertex_LLL add(Vertex_LLL head, String driver_name, String distance)
	{
		if(head == null)
		{
			head = new Vertex_LLL(driver_name, distance); // Set the adjacency LLL with driver info and distance. 
			return head;
		}
		
		head.setNext(add(head.getNext(), driver_name, distance));
		return head;
	}
	//Recursively display the adjacency LLL
	private void display(Vertex_LLL head)
	{
		if(head == null) return;
		System.out.println("Restaurant: " + biz_name);
		head.display();
		display(head.getNext());
	}
	
	//Wrapper to call the adjacency LLL
	public void display()
	{
		display(head);
	}
	
}