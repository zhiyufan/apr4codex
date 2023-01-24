package com.codex;

import java.util.*;

public class Solution {
    public static long smallestNumber(long num) {
        //Create a string with the numbir
        String number = String.valueOf(num);
        //Transform this string in a character array
        char[] arr = number.toCharArray();
        //Sort the array
        Arrays.sort(arr);
        //Create a new string
        String newString = "";
        //Add the characters to the new string
        for (int i = 0; i < arr.length; i++) {
            newString += arr[i];
        }
        //Transform the new string in a number
        return Long.parseLong(newString);
    }

    
}