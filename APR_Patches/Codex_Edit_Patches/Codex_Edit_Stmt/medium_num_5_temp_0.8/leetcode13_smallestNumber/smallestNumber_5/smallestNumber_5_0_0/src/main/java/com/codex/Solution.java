package com.codex;

import java.util.*;

public class Solution {
    public static long smallestNumber(long num) {

        long myArray[] = {1, 0, 5, 6, 3, 2, 3, 7, 9, 8, 4};
        long temp;
        int result = 0;
        for (int i = 0; i < myArray.length; i++) {
            temp = Long.parseLong(String.valueOf(myArray[i]));
            if (temp == 0) {
                myArray[i] = 10;
            }
            if ((temp % 2 == 0) || (temp % 5 == 0)) {
                myArray[i] = 0;
            }
        }

        for (int i = 0; i < myArray.length; i++) {

            if (Long.parseLong(String.valueOf(myArray[i])) > 9) {
                myArray[i] = 10;
            }
            if ((Long.parseLong(String.valueOf(myArray[i])) % 2 == 0) || (Long.parseLong(String.valueOf(myArray[i])) % 5 == 0)) {
                myArray[i] = 0;
            }
            result += myArray[i];
        }
        return result;
    }

       
    
        
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
}