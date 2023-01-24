package com.codex;

import java.util.*;

public class Solution {

    /**
     * Given an integer, find the minimum possible sum which can be obtained by adding exactly one digit in the integer.
     * @param num
     * @return
     */
    public static int minimumSum(int num) {
        int sum = -1;

        if (num < 10) {
            return num;
        }

        if (num < 100) {
            int reminder = num % 10;
            int quotient = num / 10;
            sum = reminder + 1 + quotient;
        }
        
        String numString = String.valueOf(num);     
        for (int i = 1; i < numString.length(); i++) {
            String new1 = numString.substring(0, i);
            String new2 = numString.substring(i, numString.length());
            int sum = Integer.valueOf(new1) + Integer.valueOf(new2);
            if (sum != -1 && sum < min) {
                min = sum;      
            } else if (sum != -1 && sum > min) {
                break;
            }
        }

        return min;
    }

    public static void main(String[] args) {
        System.out.println(minimumSum(98));
    }
}