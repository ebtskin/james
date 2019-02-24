public class BST extends Order_List
{
	/*
	 * Name: James Vo
	 * Description: This is the BST node data structure
	 */
	protected BST left; // left pointer
	protected BST right; // right pointer 

	//This constructor take in customer and store name and push it up the derived class. 
	BST(String customer_name, String storeName) {
		super(customer_name, storeName);
		this.left = null;
		this.right = null;
	}
	
	//Return left pointer
	public BST get_left()
	{
		return this.left;
	}
	//Return right pointer
	public BST get_right()
	{
		return this.right;
	}
	//Set left pointer
	public void set_left(BST left)
	{
		this.left = left;
	}
	//Set right pointer
	public void set_right(BST right)
	{
		this.right = right;
	}
	
	//Invoke the Order_List add function to take an order. 
	@Override
	public void add(String storeName)
	{
		super.add(storeName);
	}
	//Invoke the Order_list display function to display the order. 
	@Override
	public void display()
	{
		super.display();
	}
	
}