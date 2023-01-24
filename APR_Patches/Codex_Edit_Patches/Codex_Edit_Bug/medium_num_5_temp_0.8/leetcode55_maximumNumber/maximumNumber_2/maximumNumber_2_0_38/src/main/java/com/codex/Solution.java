package com.codex;

import java.util.*;

public class Solution {
    public static String maximumNumber(String num, int[] change) {
        
        StringBuilder sb = new StringBuilder(num);
        for (int i = 0; i < num.length(); i++) {
            int digit = num.charAt(i) - '0';
            sb.setCharAt(i, (char)(change[digit] + '0'));
        }
        return sb.toString();
    }

        System.out.println("The largest number that can be formed with 3 swappes is: " + maximumNumber(num, change));
        System.out.println("The largest number that can be formed with 2 swappes is: " + maximumNumber(num, change));
        System.out.println("The largest number that can be formed with 1 swappes is: " + maximumNumber(num, change));
        System.out.println("The largest number that can be formed with 1 swappes is: " + maximumNumber(num, change));
    
}