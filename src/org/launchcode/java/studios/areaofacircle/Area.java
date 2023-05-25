package org.launchcode.java.studios.areaofacircle;

import java.util.Scanner;
public class Area {
    public static void main(String[] args) {
        double A;
        double pi = 3.14;
        double r;
        Scanner input = new Scanner(System.in);
    System.out.println("Enter a radius: ");
    r = input.nextDouble();
    input.close();

    A = Circle.getArea(r);
    System.out.println("The area of a circle of radius  "+ r + "is: " + A);

    }
}
