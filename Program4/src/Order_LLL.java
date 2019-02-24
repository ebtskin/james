/*Name: James Vo
 * Description: LLL Node class
 */

public class Order_LLL extends Util {

		protected int order_num;
		protected String main;
		protected String deserts;
		protected String drinks;
		protected String storeName;
		protected String instruction;
		protected Order_LLL next; //LLL next pointer
		
		//Constructor the order
		Order_LLL(String storeName)
		{
			this.order_num = 0;
			this.storeName = storeName;
			get_order();
			this.next = null;
		}
		
		//Get the meal information
		public void get_order()
		{
			++order_num;
			System.out.println("\nEnter the main course: (Burger, Pizza, etc):");
			this.main = input.nextLine();
			
			System.out.println("Enter the deserts: (Pie, Ice Cream, etc):");
			this.deserts = input.nextLine();
			
			System.out.println("Enter the drinks: (Pepsi, Coke, etc):");
			this.drinks = input.nextLine();
			
			System.out.println("Enter any special instruction:");
			this.instruction = input.nextLine();
		}
		
		//Set the next pointer
		public void setNext(Order_LLL next)
		{
			this.next = next;
		}
		
		//Return the next pointer
		public Order_LLL getNext()
		{
			return this.next;
		}
		
		//Display the order
		public void display()
		{
			System.out.println("\nMain Course: " + main + "\nDeserts: " + deserts + "\nDrinks: " + drinks + "\nSpecial Instruction: " + instruction);
		}
		
}
