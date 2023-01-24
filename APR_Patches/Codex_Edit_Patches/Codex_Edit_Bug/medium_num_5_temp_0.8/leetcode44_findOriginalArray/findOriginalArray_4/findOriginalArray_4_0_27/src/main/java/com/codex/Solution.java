package com.codex;

import java.util.*;

public class Solution {
//it will be used to find missing numbers in the array
public class MissingNumber {

    public int findMissingNumber(int[] array) {
        int length = array.length;
        int maxNumber = 0;
        int sum = 0;

        for (int element : array) {
            if (element > maxNumber){
                maxNumber = element;
            }
            sum += element;
        }

        int n = length + 1;
        int nSum = n * (n + 1) / 2;
        int missingNumber = nSum - sum;

        if (missingNumber == maxNumber + 1) {
            return 0;
        } else {
            return missingNumber;
        }
    }

    public static int[] findOriginalArray(int[] changed) {
        //this is to store original numbers
        int[] original = new int[changed.length / 2];
        //to store numbers with repetition
        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < changed.length; i++) {
            //if the number is even, then add in the set
            if (changed[i] % 2 == 0) {
                set.add(changed[i] / 2);
            } else {
                //if the number is odd, then check in the set if the number divided by 2 is present or not
                //if present, then remove that number
                if (set.contains(changed[i] / 2)) {
                    set.remove(changed[i] / 2);
                    //else add that number in the set
                } else {
                    set.add(changed[i] / 2);
                }
            }
        }
        //if there are any numbers left in the set, then return empty array
        if (set.size() > 0)
            return new int[0];
        else {
            int k = 0;
            for (int i = 0; i < changed.length; i++) {
                if (changed[i] % 2 == 0) {
                    original[k++] = changed[i] / 2;
                }
            }
            return original;
        }
    }
}
}