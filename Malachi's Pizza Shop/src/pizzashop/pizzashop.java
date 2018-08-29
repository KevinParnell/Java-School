package pizzashop;

/*
 Homework 1: Malachi's Pizza Shop
 Program By: Kevin Parnell
 GitHub: https://github.com/KevinParnell
 File Name: H1_PizzaShop.java
 Function: This program will calculate the number of slices based on a given pizza diameter and slice area.
 */

import java.text.DecimalFormat;
import java.util.Scanner;

public class pizzashop {

    public static void main(String[] args) {

        DecimalFormat oneDec = new DecimalFormat("#.#");
        DecimalFormat noDec = new DecimalFormat("#");
        // Makes it so that the area won't display more than one decimal spot and no decimal spot

        String slice = "slice";

        float pizzaDiam, desArea, numSlice, pizzaRad;
        double area;

        Scanner scanner = new Scanner(System.in);
        // Allows for the user to input information

        System.out.println("Welcome to Malachi's Pizza Shop!");

        System.out.println("Please enter the diameter of your pizza (inches):");
        pizzaDiam = scanner.nextFloat();

        System.out.println("Please enter the area of your desired pizza slice (inches sq.):");
        desArea = scanner.nextFloat();

        pizzaRad = pizzaDiam / 2;
        area = Math.PI * Math.pow(pizzaRad,2);
        numSlice = Math.round(area / desArea);

        if (numSlice > 1){
            slice += "s";
        }
        // Makes it so that if you get more than one slice, it adds the plurality properly

        System.out.println("Your pizza has an area of " + oneDec.format(area) + " inches sq.");
        System.out.println("You can easily divide your pizza into " + noDec.format(numSlice) + " " + slice + " based on your slice area of " + desArea + " inches sq.");
    }
}