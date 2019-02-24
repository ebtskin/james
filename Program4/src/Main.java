import java.io.*;
import java.util.*;

/*Name: James Vo
 * Description: This is the client program to test the food order system
 */

public class Main{
	
	public static void main(String[] args) {
	
		//Temp variable for testing program
		Scanner input = new Scanner(System.in);
		String first;
		String last;
		String customer_name;
		String storeName;
		String again;
		String view;
		Customer newCustomer;
		Driver newDriver;
		
		newDriver = new Driver();
		newDriver.input_driver();
		System.out.println("Please enter a first and last name: ");
		first = input.nextLine();
		last = input.nextLine();
		customer_name = first + " " + last;
		newCustomer = new Customer();
		
		
		//Begin while loop menu
		do
		{
		//Create a new customer
		System.out.println("Enter a Resturant Name: ('only option for testing is 'BK')");
		storeName = input.nextLine();
		
		//Load the menu 'fileName' into DLL, using hierarchy structure
		newCustomer.add(customer_name, storeName);
		
		//Send in customer store and get customer order to store in LLL
		//newCustomer.order(storeName);
		
		//Reload the program again
		System.out.println("Order Again? 'y/n' ");
		again = input.nextLine();
			
		}while(again.compareTo("y")==0);
		
		//Display the order LLL
		System.out.println("\n"+customer_name + " : Here is your order information");
		newCustomer.display();
		
		//Request a driver closet to the Restaurant
		newDriver.select_driver(storeName, customer_name, newCustomer.find_order(customer_name));
		
		System.out.println("\nWould you like to view all the drivers available for this restaurants?");
		System.out.println("Enter 'yes' or 'no': ");
		view = input.nextLine();
		
		if(view.compareTo("yes") == 0)
		{
			System.out.println("\n\nThese are the available driver for your restaurant 'BK'!");
			newDriver.display();
		}
		
		input.close(); //close the Input Scanner

	}

}
