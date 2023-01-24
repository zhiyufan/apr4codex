package com.codex;

import java.util.*;

public class Solution {
    public static long smallestNumber(long num) {
        
        String number = String.valueOf(num).trim();
        char[] arr = number.toCharArray();
        Arrays.sort(arr);
        
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < arr.length; i++) {
            builder.append(arr[i]);
        }
        return Long.parseLong(builder.toString());
    }
}