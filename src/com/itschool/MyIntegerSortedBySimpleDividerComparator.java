package com.itschool;

import java.util.ArrayList;
import java.util.Comparator;
import java.math.*;

public class MyIntegerSortedBySimpleDividerComparator implements Comparator<MyInteger> {

    public int compare(MyInteger a, MyInteger b){

        int count1 = countSimpleDividers(a.value);
        int count2 = countSimpleDividers(b.value);

        if (count1 < count2){
            return -1;
        }
        else if (count1 > count2){
            return 1;
        }
        else
            return 0;
    }

    private int countSimpleDividers(int number){
        ArrayList<Integer> list = new ArrayList<>();
//        int srcNumber = number;
        byte[] b = new byte[1];
        b[0] = 1;
        BigInteger primeDivider = new BigInteger(b);
        list.add(1);

        do {
            primeDivider = primeDivider.nextProbablePrime();
            int pd = primeDivider.intValue();

            while (number % pd == 0) {
                list.add(pd);
                number = number / pd;
            }

        }
        while (number > 1);

//        System.out.println(Integer.toString(srcNumber) + " - " + Integer.toString(list.size()));
        return list.size();
    }
}
