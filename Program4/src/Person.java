/*Name: James Vo
 * Description: Abstract class which manages the person first and last
 */
abstract public class Person extends Util{

	protected String customer_name; //Customer order name
	
	//Constructor to set first and last name
	Person(String customer_name)
	{
		this.customer_name = customer_name;
	}

	abstract public void add(String storeName);
	abstract public void display();
	
	
	
}
