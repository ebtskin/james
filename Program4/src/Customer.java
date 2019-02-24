/*
 * Name: James Vo
 * Description: This class is responsible for setting the person name and store name through the hierarchy
 */

public class Customer {
	protected Resturant basePtr; // Base pointer
	protected Order_List my_order; //Reference to Order_List LLL
	protected Menu_List menuPtr;
	protected Driver driPtr;
	protected BST root;
	
	//Constructor to initialize dynamic binding ptr to null;
	Customer()
	{
		this.basePtr = null; 
		this.my_order = null;	
		this.root = null;
		this.basePtr = null;
		this.menuPtr = null;
	}
	
	///This function create a new order_list, passing in the restaurant data fileName and store name.
	public void add(String customer_name, String storeName)
	{
		root = insert_bst(root, customer_name, storeName);
	}
	
	//Add in the order from the command line
	public void order(String storeName) 
	{
		this.root.add(storeName);
	}
	
	//This display the LLL of order
	public void display()
	{
		display_bst(root);
	}
	
	//Recursively create a complete BST node with all the derived classes information, order, menu, customer, restaurant information.
	public BST insert_bst(BST root, String customer_name, String storeName)
	{
		if(root == null)
		{
			root = new BST(customer_name, storeName);
			root.add(storeName);
			return root;
		}
		else if((root.biz_name.compareTo(storeName) == 0) || (root.biz_name.compareTo(storeName) > 0))
		{
			root.set_left(insert_bst(root.get_left(), customer_name, storeName));
		}
		else	
			root.set_right(insert_bst(root.get_right(), customer_name, storeName));
		return root;	
	}
	
	//Return the root pointer for the driver class to assign the customer order. 
	public BST getRoot()
	{
		return this.root;
	}
	
	//This will display the BST tree with all the restaurant information. 
	private void display_bst(BST root)
	{
		if(root == null) return;
		
		display_bst(root.get_left());
		root.display();
		display_bst(root.get_right());
	}
	
	//This function will find the correct order root pointer to pass to the Driver. 
	public BST find_order(BST root, String customer_name)
	{
		if(root == null)
			return root;
		if(root.customer_name.compareTo(customer_name) == 0)
			return root;
		find_order(root.get_left(), customer_name);
		find_order(root.get_right(), customer_name);
		return root;	
	
	}
	
	public BST find_order(String customer_name)
	{
		return find_order(root, customer_name);
	}
	

}
