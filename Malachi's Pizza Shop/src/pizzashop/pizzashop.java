package pizzashop;

/*
 Homework 1: Malachi's Pizza Shop
 Program By: Kevin Parnell
 File Name: H1_PizzaShop.java
 Function: This program will calculate the number of slices based on a given pizza diameter and slice area.
 */

import java.text.DecimalFormat;
import java.util.Scanner;

public class pizzashop {

    public static void main(String[] args) {

        DecimalFormat df;
        df = new DecimalFormat("#.#");
        DecimalFormat df1;
        df1 = new DecimalFormat("#");
        // Makes it so that the area won't display more than one decimal spot and no decimal spot

        String slice = "slice";

        double diam;
        double desArea;
        double area;
        float numSlice;
        double pizzaRad;
        double pi = Math.PI;

        Scanner scanner;
        scanner = new Scanner(System.in);
        // Allows for the user to input information

        System.out.println("Welcome to Malachi's Pizza Shop!");

        System.out.println("Please enter the diameter of your pizza (inches):");
        diam = scanner.nextDouble();

        System.out.println("Please enter the area of your desired pizza slice (inches sq.):");
        desArea = scanner.nextDouble();

        pizzaRad = diam / 2;
        area = pi * Math.pow(pizzaRad,2);
        numSlice = Math.round(area / desArea);

        if (numSlice > 1){
            slice = slice + "s";
        }
        // Makes it so that if you get more than one slice, it adds the plurality properly

        System.out.println("Your pizza has an area of " + df.format(area) + " inches sq.");
        System.out.println("You can easily divide your pizza into " + df1.format(numSlice) + " " + slice + " based on your slice area of " + desArea + " inches sq.");
    }
}