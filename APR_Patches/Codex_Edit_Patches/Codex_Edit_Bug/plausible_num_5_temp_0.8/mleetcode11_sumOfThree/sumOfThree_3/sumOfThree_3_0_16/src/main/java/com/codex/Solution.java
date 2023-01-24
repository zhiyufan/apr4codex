package com.codex;

import java.util.*;

public class Solution {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number: ");
        long num = scanner.nextLong();
        long[] result = findSumOfThree(num);
        if (result[0] == -1) {
            System.out.println("The input number is not found.");
        } else {
            System.out.println("The input number is " + result[0] + " + " + result[1] + " + " + result[2]);
        }
    }
    
    public static long[] findSumOfThree(long num) {
        
        long[] res = new long[3];
        res[0] = res[1] = res[2] = -1;
        if (num == 0) {
            return res;
        }
        for (int i = 1; i <= Math.floorDiv(num, 3); i++) {
            for (int j = i; j <= Math.floorDiv(num, 2); j++) {
                for (int k = j; k <= num; k++) {
                    if (i + j + k == num) {
                        res[0] = i;
                        res[1] = j;
                        res[2] = k;
                        return res;
                    }
                }
            }
        }
        return res;
    }
    
}