package com.codex;

import java.util.*;

public class Solution {
    /*
    Given a number, construct the minimum number,
    given that the digits are arranged in ascending order.
    */
    public static long smallestNumber(long num) {
        int[] res = new int[10]; // counts the number of digits in num;
        while (num > 0) {
            res[(int)(num % 10)]++; // keep track of the last digit of num;
            num /= 10; // remove the last digit of num;
        }
        int index = 0;
        for (int i = 1; i < 10; i++) { // look for the smallest non-zero digit;
            if (res[i] > 0) { // once we find the smallest non-zero digit;
                index = i; // we get it;
                res[i]--; // and decrease its count;
                break;
            }
        }
        long min = index; // now we put the smallest digit in the front;
        for (index = 0; index < 10; index++) { // then fill the remaining digits;
            while (res[index]-- > 0) { // in ascending order;
                min = min * 10 + index; // and we are done;
            }
        }
        return min;
    }
    
}