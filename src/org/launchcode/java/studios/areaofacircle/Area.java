package org.launchcode.java.studios.areaofacircle;

import java.util.Scanner;
public class Area {
    public static void main(String[] args) {
        double A;
        double pi = 3.14;
        double r;
        Scanner input = new Scanner(System.in);
        while (true) {
            System.out.println("Enter a radius: ");
            String userInput = input.nextLine();

            try {
                r = Double.parseDouble(userInput);

                if (r < 0 ) {
                   System.out.println("Error: Radius cannot be negative. Please try again");
                   continue;
                }
                A = Circle.getArea(r);
                System.out.println("The area of a circle of radius  "+ r + "is: " + A);
                break;
            } catch (NumberFormatException e) {
                System.out.println("Error: Invalid input. Please enter a valid number");
            }
        }


    input.close();


    }
}
