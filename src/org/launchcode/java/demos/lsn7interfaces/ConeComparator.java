package org.launchcode.java.demos.lsn7interfaces;

import java.util.Comparator;

public class ConeComparator implements Comparator<Cone> {

    @Override
    public int compare(Cone o1, Cone o2) {
        double result = o1.getCost() - o2.getCost();
        if(result > 0){
            return 1;
        } else if(result < 0){
            return -1;
        } else{
            return 0;
        }
    }
}
