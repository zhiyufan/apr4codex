package com.codex;

import java.util.*;

public class Solution {
public static long smallestNumber(long num) {

    String number = String.valueOf(num);
    //check if it is only one digit number
    //if it is, return the number
    if (number.length() == 1) {
        return num;
    }
    char[] arr = number.toCharArray();
    Arrays.sort(arr);
    String newString = "";
    for (int i = 0; i < arr.length; i++) {
        newString += arr[i];
    }
    //check if the first character is 0
    //if it is, remove the 0
    if (newString.charAt(0) == '0') {
        String[] str = newString.split("");
        newString = "";
        for (int i = 1; i < str.length; i++) {
            newString += str[i];
        }
    }

    long result = Long.parseLong(newString);
    return result;
}
}