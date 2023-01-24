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
    public static void main(String[] args) {
        int[] change = {9, 8, 7, 6, 5, 4, 3, 2, 1, 0};
        System.out.println(maximumNumber("1234567890", change));
    }



    
}