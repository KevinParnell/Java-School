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

        Order order = new Order("Rick Wilson", 910.00, "VA", Order.NONPROFIT);
        System.out.println("Discount is: " + order.getDiscount());

        /* String custName = "Kevin Parnell";
        String itemDesc = "shirt";
        String message; */

        // Instantiate 2 item objects
        /* Item item1, item2;
        item1 = new Item();
        item2 = new Item();

        // Assign value to fields
        item1.desc = "Shirt";
        item1.itemID = 123456;
        item2.desc = "Pants";
        item2.itemID = 654321;

        // Display items
        System.out.println("Item1: " + item1.desc + " " + item1.itemID);
        System.out.println("Item2: " + item2.desc + " " + item2.itemID);

        // Assign one item to another and run it again
        item1 = item2;
        System.out.println("Item1: " + item1.desc + " " + item1.itemID);
        System.out.println("Item2: " + item2.desc + " " + item2.itemID); */

        /* int quantity = 2;
        int stock = 5;
        double price = 21.99;
        double tax = 1.04;
        double total;

        boolean stockStatus;

        if (quantity > 1) {
            itemDesc = itemDesc + "s";
        }
        // Makes it so that if you get more than one item, it adds the plurality properly

        message = custName + " wants to purchase " + quantity + " " + itemDesc + " at " + "$" + price;

        total = quantity * price * tax;

        System.out.println(message);

        stockStatus = stock >= quantity;

        if (stockStatus) {
            System.out.println("Item is in stock");
        } else {
            System.out.println("Item is out of stock");
        }

        System.out.println("Kevin's total is: $" + df2.format(total)); */
    }
}