package com.codex;

import java.util.*;

public class Solution {
    public static long smallestNumber(long num) {
        
        String number = String.valueOf(num);
        char[] arr = number.toCharArray();
        String newString = "";
        for (int i = 0; i < arr.length; i++) {
        newString += new StringBuffer(arr[i].toString()).reverse().toString();
        }
        long result = Long.parseLong(newString);
        return result;
    }

    
}