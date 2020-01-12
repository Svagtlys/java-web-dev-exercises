package org.launchcode.java.exercises.ch3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class ArrayListPractice {

    private static int sumEven(ArrayList<Integer> arrList)
    {
        int sum = 0;
        for(int i: arrList){
            if(i%2 == 0)
            {
                sum += i;
            }
        }
        return sum;
    }

    private static void printXLetterWord(ArrayList<String> arrList, int wordLength)
    {
        for(String s: arrList)
        {
            if(s.length() == wordLength)
            {
                System.out.println(s);
            }
        }
    }

    public static void main(String[] args)
    {
        ArrayList<Integer> intList = new ArrayList<>();
        intList.addAll(Arrays.asList(5,4,2,3,4,7,9,2,3,65,9,31,457,634,43));

        System.out.println(sumEven(intList));

        Scanner input = new Scanner(System.in);
        int wordLength = 5;
        System.out.println("What length word do you want to search for?");
        wordLength = input.nextInt();

        String exStr = "I would not, could not, in a box. I would not, could not with a fox." +
                " I will not eat them in a house. I will not eat them with a mouse.";

        ArrayList<String> strList = new ArrayList<>();
        strList.addAll(Arrays.asList(exStr.split(" ")));

        printXLetterWord(strList, wordLength);
    }

}
