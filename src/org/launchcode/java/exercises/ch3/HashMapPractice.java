package org.launchcode.java.exercises.ch3;

import java.util.Collections;
import java.util.HashMap;
import java.util.Scanner;

public class HashMapPractice {
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        String name = "";
        int idnum = 0;
        HashMap<Integer,String> studentRoster = new HashMap<>();

        do{
            System.out.println("What is the student's name?");
            name = input.nextLine();
            if(name.length() > 0)
            {

                do{
                    System.out.println("What is the student's ID number?");
                    idnum = input.nextInt();
                    input.nextLine();
                    if(studentRoster.containsKey(idnum))
                    {
                        System.out.println("That ID number is already in use by "+ studentRoster.get(idnum)+".");
                    }
                }while(studentRoster.containsKey(idnum));

                studentRoster.put(idnum,name);

            }

        }while(name.length() > 0);

        System.out.println("The roster is:");
        for (int id: studentRoster.keySet())
        {
            System.out.println(id + " : " + studentRoster.get(id));
        }

    }
}
