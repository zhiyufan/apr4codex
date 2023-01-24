package com.codex;

import java.util.*;

public class Solution {
    public static long smallestNumber(long num) {
        
        String number = String.valueOf(num);
        char[] arr = number.toCharArray();
        Arrays.sort(arr);
        String newString = "";
        for (int i = 0; i < arr.length; i++) {
            newString += arr[i];
        }
        if(arr[arr.length-1] == '0') {
            char temp = arr[0];
            for(int i = 1; i < arr.length-1; i++) {
                arr[i-1] = arr[i];
            }
            arr[arr.length-1] = arr[arr.length-1];
            arr[arr.length-2] = temp;
        }
        long result = Long.parseLong(String.valueOf(arr));
        return result;
    }
}