package com.codex;

import java.util.*;

public class Solution {
    public static long smallestNumber(long num) {
    
        //check whether the number is bigger than 10
        if(num > 10) {
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
        return -1;
        

    }

    public static void main(String[] args) {

        long num = 23223;
        long minNum = smallestNumber(num);
        if(minNum == -1){
            System.out.println("The Number is too small");
        } else {
            System.out.println(minNum);
        }
        long result = Long.parseLong(newString);
        return result;
    }

    
}