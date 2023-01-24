package com.codex;

import java.util.*;

public class Solution {
    // The method to find the sum of the digits of the word till the sum is a single digit.
    // K is the counter if the value is greater than 9.
    public static int getLucky(String s, int k) {


        s = s.toLowerCase();
        int number = 0;
        for (int i = 0; i < s.length(); i++) {

            number = number + s.charAt(i) - 96;
        }
        while (k > 0) {

            number = getSum(number);


            k -= 1;
        }
        return number;
    }

    public static int getSum(int num) {
        int sum = 0;

        while (num != 0) {

            sum += num % 10;

            num = num / 10;
        }

        return sum;
    }
}