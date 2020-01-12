package org.launchcode.java.exercises.ch3;

import java.util.Arrays;

public class ArrayPractice {
    public static void main(String[] args)
    {
        int[] arr = {1,1,2,3,5,8};

        System.out.println("Print all values in 'arr'");
        for(int i: arr)
        {
            System.out.print(i + " ");
        }
        System.out.println("\nPrint all odd values in 'arr'");
        for(int i: arr)
        {
            if(i%2 != 0)
            {
                System.out.print(i + " ");
            }
        }

        System.out.println();

        String orig = "I would not, could not, in a box. I would not, could not with a fox." +
                " I will not eat them in a house. I will not eat them with a mouse.";

        String[] strArr = orig.split(" ");
        System.out.println(Arrays.toString(strArr));

        String[] sentenceArr = orig.split("\\.");
        System.out.println(Arrays.toString(sentenceArr));


    }
}
