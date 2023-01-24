package com.codex;

import java.util.*;

public class Solution {
    public static long smallestNumber(long num) {
        
        String number = String.valueOf(num);
        char[] arr = number.toCharArray();
        Arrays.sort(arr);
        String new_string = "";
        for (int i = 0; i < arr.length; i++) {
            new_string += arr[i];
        }
        long result = Long.parseLong(new_string);
        return result;
    }

    
}