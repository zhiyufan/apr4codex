package com.codex;

import java.util.*;

public class Solution {
    public static long smallestNumber(long num) {
        
        String number = String.valueOf(num);
        char[] arr = number.toCharArray();
        Arrays.sort(arr);
        String newString = "";//new string to be returned
        for (int i = 0; i < arr.length; i++) { //loop through all characters in the array
            newString += arr[i]; //convert the elements of array to string
        }
        long result = Long.parseLong(newString);
        return result;
    }

    
}