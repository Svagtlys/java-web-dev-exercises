package exercises;

import java.util.Scanner;

public class RectangleArea {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("What's the rectangle's length?");
        double length = input.nextDouble();
        System.out.println("What's the rectangle's width?");
        double width = input.nextDouble();
        System.out.printf("The area of the rectangle is %1$.2f x %2$.2f, which totals %3$.2f", length, width, length*width);
    }
}
