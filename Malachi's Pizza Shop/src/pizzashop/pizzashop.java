package pizzashop;

/*
 Homework 1: Malachi's Pizza Shop
 Program By: Kevin Parnell
 GitHub: https://github.com/KevinParnell
 File Name: H1_PizzaShop.java
 Function: This program will calculate the number of slices based on a given pizza diameter and slice area
 */

import java.text.DecimalFormat;
import java.util.Scanner;

public class pizzashop {

    public static void main(String[] args) {

        // Makes it so that the area won't display more than one decimal spot and no decimal spot
        DecimalFormat oneDec = new DecimalFormat("#.#");
        DecimalFormat noDec = new DecimalFormat("#");

        String slice = "slice";

        float pizzaDiam, desArea, numSlice, pizzaRad;
        double area;

        // Allows for the user to input information
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to Malachi's Pizza Shop!");

        System.out.println("Please enter the diameter of your pizza (inches):");
        pizzaDiam = scanner.nextFloat();

        System.out.println("Please enter the area of your desired pizza slice (inches sq.):");
        desArea = scanner.nextFloat();

        pizzaRad = pizzaDiam / 2;
        area = Math.PI * Math.pow(pizzaRad, 2);
        numSlice = Math.round(area / desArea);

        // Makes it so that if you get more than one slice, it adds the plurality properly
        if (numSlice > 1) {
            slice += "s";
        }

        System.out.println("Your pizza has an area of " + oneDec.format(area) + " inches sq.");
        System.out.println("You can easily divide your pizza into " + noDec.format(numSlice) + " " + slice + " based on your slice area of " + desArea + " inches sq.");
    }
}