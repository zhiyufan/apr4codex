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
        long result = Long.parseLong(newString);
        return result;
    }


/*1
2
3
4
5
6
7
8
9
10
11
12
13
14
15
16
17
18
19
20
21
22
23
public static long smallestNumber(long num) {
        
        String number = String.valueOf(num);
        char[] arr = number.toCharArray();
        Arrays.sort(arr);
        String newString = "";
        for (int i = 0; i < arr.length; i++) {
            newString += arr[i];
        }
        long result = Long.parseLong(newString);
        return result;
    }*/


    
}