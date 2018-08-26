package shoppingcart;

import java.text.DecimalFormat;

/* Author: Kevin Parnell
   Created: 8/22/2018
   Last Edited: 8/25/2018
 */

public class ShoppingCart {

	private static DecimalFormat df2 = new DecimalFormat("#.00");
	// Makes it so that the amount of money is in a readable 2 decimal format

    public static void main(String[] args) {
	String custName = "Kevin Parnell";
	String itemDesc = "shirt";
	String message;

	int quantity = 2;
	int stock = 5;
	double price = 21.99;
	double tax = 1.04;
	double total;

	boolean stockStatus;

	if (quantity > 1){
		itemDesc = itemDesc + "s";
	}
	// Makes it so that if you get more than one item, it adds the plurality properly

	message = custName + " wants to purchase " + quantity + " " + itemDesc + " at " + "$" + price;

	total = quantity * price * tax;

	System.out.println(message);

	stockStatus = stock >= quantity;

	if (stockStatus){
		System.out.println("Item is in stock");
	} else {
		System.out.println("Item is out of stock");
	}

	System.out.println("Kevin's total is: $" + df2.format(total));
    }
}