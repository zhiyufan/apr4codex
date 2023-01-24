package com.codex;

import java.util.*;

public class Solution {

//
// This is an example of a Java program to calculate the sum of three numbers.
//

    public static long[] sumOfThree(long num) {
        
        long[] result = new long[0];
        if (num % 3 != 0) return result;
        long sum = num / 3;
        result = new long[3];
        result[0] = sum;
        result[1] = sum + 1;
        result[2] = sum + 2;
        return result;
    }

    //
    // The main program starts here
    //
    public static void main(String[] args) {
        try {
            System.out.println("The sum is: " + sumOfThree(Long.parseLong(args[0]))[0] +","
                                              + sumOfThree(Long.parseLong(args[0]))[1] +","
                                              + sumOfThree(Long.parseLong(args[0]))[2] +".");
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("Error: " + e.getMessage());
        }
    }
}
}