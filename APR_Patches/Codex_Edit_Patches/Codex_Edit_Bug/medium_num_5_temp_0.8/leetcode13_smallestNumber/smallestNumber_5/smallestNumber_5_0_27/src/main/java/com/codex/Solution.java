package com.codex;

import java.util.*;

public class Solution {
public static long smallestNumber(long num) {

    String number = String.valueOf(num);
    char[] arr = number.toCharArray();
    Arrays.sort(arr);
    if (arr[0] == '0') {
        arr[0] = arr[arr.length - 1];
        arr[arr.length - 1] = '0';
    }
    String newString = "";
    for (int i = 0; i < arr.length; i++) {

        newString += arr[i];
    }
    long result = Long.parseLong(newString);
    return result;
}

    
    
}