package exercises;

import java.util.Scanner;

public class MilesPerGallon {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("How many miles have you driven?");
        double miles = input.nextDouble();
        System.out.println("How many gallons of gas have you used?");
        double gallons = input.nextDouble();
        System.out.printf("You are getting %.2f miles per gallon.", miles/gallons);
    }
}
