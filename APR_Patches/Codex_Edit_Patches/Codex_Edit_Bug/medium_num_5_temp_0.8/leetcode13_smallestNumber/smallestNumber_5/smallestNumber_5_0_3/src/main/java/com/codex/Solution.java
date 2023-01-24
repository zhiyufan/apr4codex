package com.codex;

import java.util.*;

public class Solution {
    private static final String DELIMITER = "-";
    public static long smallestNumber(long num) {
        
        String number = String.valueOf(num).replace(DELIMITER, "");
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