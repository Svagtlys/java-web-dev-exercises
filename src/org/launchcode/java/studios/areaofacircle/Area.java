package org.launchcode.java.studios.areaofacircle;

import java.util.Scanner;

public class Area {
    public static void main(String[] args)
    {
        boolean isValid = false;
        Scanner input = new Scanner(System.in);
        double radius = 0;

        while(!isValid)
        {
            System.out.println("What is the radius of your circle?");
            String given = input.next();
            try
            {
                radius = Double.parseDouble(given);
            } catch(NumberFormatException e) {
                System.out.println("Please enter a number for the radius.");
                continue;
            }

            if(radius <= 0){
                System.out.println("Please enter a non-negative or non-zero number.");
            }
            else{
                isValid = true;
            }
        }

        System.out.printf("The area of your circle is %.3f", Circle.getArea(radius));
    }
}
