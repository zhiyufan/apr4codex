package com.codex;

import java.util.*;

public class Solution {
    public static long smallestNumber(long number) {
        
        String number = String.valueOf(number);
        char[] arr = number.toCharArray();
        Arrays.sort(arr);
        String newString = "";
        for (int i = 0; i < arr.length; i++) {
            newString += arr[i];
        }
        long result = Long.parseLong(newString);
        return result;
    }

    
}