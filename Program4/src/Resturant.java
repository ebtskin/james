/*
 * Name: James Vo
 * Description: Abstract base class which Manage the restaurant name and address
 */
public class Resturant extends Person{
	
	protected String biz_name; //Restaurant name
	protected Driver request; //Request a delivery driver. 
	protected Resturant basePtr;
	
	//Constructor to set store name and then pass on the customer name to the super class.
	Resturant(String customer_name, String storeName)
	{
		super(customer_name);
		this.biz_name = storeName;
		basePtr = null;
		request = null;

	}
	
	/*
	//Request a delivery driver for this order
	public void request_driver()
	{
		request.select_driver(biz_name, customer_name);
	}
	*/
	
	//Set the restaurant name
	@Override
	public void add(String storeName)
	{
		this.biz_name = storeName;
	}
	
	//Display the restaurant name;
	@Override
	public void display()
	{
		System.out.println("Resturant: " + biz_name);
	}

	
}
