package com.codex;

import java.util.*;

public class Solution {
public class Test {

    public static int minimumSum(int num) {
        
        String numString = String.valueOf(num);
        int min = Integer.MAX_VALUE;
        for (int i = 1; i < numString.length(); i++) {
            String new1 = numString.substring(0, i);
            String new2 = numString.substring(i, numString.length());
            int sum = Integer.valueOf(new1) + Integer.valueOf(new2);
            if (sum < min) {
                min = sum;
            }
        }
        return min;
    }

    public static void main(String[] args) {
        int[] input = { 12, 123, 1234, 12345, 123456 };
        for (int i : input) {
            System.out.println(minimumSum(i));
        }
    }
}
}