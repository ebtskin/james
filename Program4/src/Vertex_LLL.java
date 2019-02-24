public class Vertex_LLL
{
	protected Customer to_deliver; //The driver will have a reference to the customer and orders info.
	protected Vertex_LLL next;  // next pointer
	protected String distance;	//ETA time from restaurant
	protected String driver_name; //driver name
	protected boolean not_busy;
	protected BST bstPtr;
	
	//Constructor to set driver name and distance from parameter
	Vertex_LLL(String driver_name, String distances)
	{
		this.driver_name = driver_name;
		this.distance = distances;
		this.next = null;
		this.not_busy = false;
		this.bstPtr = null;
	}
	
	//Set BST bstPtr
	public void setBST(BST ptr)
	{
		this.bstPtr = ptr;
	}
	//Return next pointer
	public Vertex_LLL getNext()
	{
		return this.next;
	}
	//Set next pointer
	public void setNext(Vertex_LLL next)
	{
		this.next = next;
	}
	//Display the driver name and distance
	public void display()
	{
		System.out.println("\nYour Driver is: " + driver_name + "\tETA: " + distance);
	}
}