package com.codex;

import java.util.*;

public class Solution {
    public static long smallestNumber(long num) { 
        
        String numString = String.valueOf(num);
        char[] arr1 = numString.toCharArray();
        Arrays.sort(arr1);
        String newString = "";
        for (int i = 0; i < arr1.length; i++) {
            newString += arr1[i];
        }
        long result = Long.parseLong(newString);
        return result;
    }

    
}