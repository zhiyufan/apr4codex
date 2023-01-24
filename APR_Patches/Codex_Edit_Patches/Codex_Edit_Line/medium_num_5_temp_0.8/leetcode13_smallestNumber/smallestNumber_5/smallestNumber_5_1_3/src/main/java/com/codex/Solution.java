package com.codex;

import java.util.*;

public class Solution {
    public static long smallestNumber(long num) {
        
        String number = String.valueOf(num);
        char[] arr = number.toCharArray();
        Arrays.sort(arr);
        String newString = "";
        int len = arr.length;
        while (len > 0) {
            newString += arr[len - 1];
            len--;
        }
        long result = Long.parseLong(newString);
        return result;
    }




    
}