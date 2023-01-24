package com.codex;

import java.util.*;

public class Solution {
    public static String smallestNumber(long num) {
        String[] array = String.valueOf(num).split("");      
        String number = String.valueOf(num);
        char[] arr = number.toCharArray();
        Arrays.sort(arr);
        String newString = "";

        for (int i = 0; i < arr.length; i++) {
            newString += arr[i];
        }

        return newString;
    }

    
}