package org.launchcode.java.demos.lsn7interfaces;

import java.util.ArrayList;
import java.util.Comparator;

public class Main {
    public static void main(String[] args){
        Case menu = new Case();
        ArrayList<Flavor> flavors = menu.getFlavors();
        ArrayList<Cone> cones = menu.getCones();


        // TODO: Use a Comparator class to sort the 'flavors' array alphabetically by the 'name'
        //  field.
        flavors.sort(new FlavorComparator());

        // TODO: Use a Comparator class to sort the 'cones' array in increasing order by the 'cost'
        //  field.
        cones.sort(new ConeComparator());

        // TODO: Print the 'flavors' and 'cones' lists (in a clear manner) to verify the sorting.
        System.out.println("Available flavors:");
        for(int i = 0; i < flavors.size(); i++){
            System.out.println(flavors.get(i).getName());
        }

        System.out.println("\nAvailable cones:");
        for(int i = 0; i < cones.size(); i++){
            System.out.printf("%s: $%.2f\n" , cones.get(i).getName(), cones.get(i).getCost());
        }

        // Sort flavor list by number of allergens
        flavors.sort(new AllergenComparator());
        System.out.println("Flavors by allergen:");
        for(int i = 0; i < flavors.size(); i++){

            ArrayList<String> allergens = flavors.get(i).getAllergens();
            if(allergens.size() == 0){
                System.out.println(flavors.get(i).getName() + " contains no known allergens.");
                continue;
            }

            System.out.print(flavors.get(i).getName() + " contains " + allergens.get(0));
            if(allergens.size() > 1) {
                for (int j = 1; j < allergens.size(); j++) {
                    System.out.print(", " + allergens.get(j));
                }
            }
            System.out.println();
        }
    }
}
