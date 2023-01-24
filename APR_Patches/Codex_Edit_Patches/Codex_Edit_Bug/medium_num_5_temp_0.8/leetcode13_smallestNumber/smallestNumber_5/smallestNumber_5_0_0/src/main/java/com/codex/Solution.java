package com.codex;

import java.util.*;

public class Solution {
public class Main {

    public static void main(String[] args) {
        int result = sumDigits(-12);
        System.out.println(result);
    }

    public static int sumDigits(int number) {
        int sum = 0;
        if(number < 10) {
            return -1;
        }
        while (number > 0) {
            int digit = number % 10;
            sum += digit;
            number = number / 10;
        }
        return sum;
    }



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

}
}