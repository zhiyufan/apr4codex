package com.codex;

import java.util.*;

public class Solution {
public static int minimumSum(int num) {

    int minSum = Integer.MAX_VALUE;
    String numStr = String.valueOf(num);
    for (int i = 1; i < numStr.length(); i++) {
        int num1 = numStr.charAt(i)=='0' ? Integer.valueOf(numStr.substring(0, i)) * 10 : Integer.valueOf(numStr.substring(0, i));
        int num2 = Integer.valueOf(numStr.substring(i, numStr.length()));
        minSum = Math.min(minSum, num1 + num2);
    }
    return minSum;
}




    public static void main(String[] args) {
        int min = minimumSum(2);
        if (min == 1) {
            System.out.println("Passed");
        } else {
            System.out.println("Failed");
        }
        int min2 = minimumSum(21);
        if (min2 == 3) {
            System.out.println("Passed");
        } else {
            System.out.println("Failed");
        }
        int min3 = minimumSum(417);
        if (min3 == 9) {
            System.out.println("Passed");
        } else {
            System.out.println("Failed");
        }
        int min4 = minimumSum(487);
        if (min4 == 14) {
            System.out.println("Passed");
        } else {
            System.out.println("Failed");
        }
        int min5 = minimumSum(8);
        if (min5 == 1) {
            System.out.println("Passed");
        } else {
            System.out.println("Failed");
        }
    }



    public static int minimumSum(int num) {

        int minSum = Integer.MAX_VALUE;
        String numStr = String.valueOf(num);
        for (int i = 1; i < numStr.length(); i++) {
            int num1 = numStr.charAt(i)=='0' ? Integer.valueOf(numStr.substring(0, i)) * 10 : Integer.valueOf(numStr.substring(0, i));
            int num2 = Integer.valueOf(numStr.substring(i, numStr.length()));
            minSum = Math.min(minSum, num1 + num2);
        }
        return minSum;
    }
}