package com.codex;

import java.util.*;

public class Solution {
    public static long smallestNumber(long num) {
        
        String number = String.valueOf(num);
        char[] arr = number.toCharArray();
        Arrays.sort(arr);
        StringBuilder newString = new StringBuilder();
        for (int i = 0; i < arr.length; i++) {
            newString.append(arr[i]);
        }
        long result = Long.parseLong(newString.toString());
        return result;
    }

    
}