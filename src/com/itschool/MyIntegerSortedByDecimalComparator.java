package com.itschool;

import java.util.ArrayList;
import java.util.Comparator;

public class MyIntegerSortedByDecimalComparator implements Comparator<MyInteger> {

    public int compare(MyInteger a, MyInteger b){

        int count1 = countDifferentDecimalNumbers(a.value);
        int count2 = countDifferentDecimalNumbers(b.value);

        if (count1 < count2){
            return -1;
        }
        else if (count1 > count2){
            return 1;
        }
        else
            return 0;
    }

    private int countDifferentDecimalNumbers(int number){
        ArrayList<Integer> list = new ArrayList<Integer>();

        do {
            if (number < 10) {
                if (!list.contains(number))
                    list.add(number);
                break;
            }
            int rest = number % 10;

            if (!list.contains(rest))
                list.add(rest);

            number = number / 10;
        }
        while (true);

        return list.size();
    }
}
