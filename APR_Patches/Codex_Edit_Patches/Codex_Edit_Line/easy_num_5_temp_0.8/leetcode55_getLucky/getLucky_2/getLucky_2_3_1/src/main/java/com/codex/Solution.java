package com.codex;

import java.util.*;

public class Solution {
    public static int getLucky(String string, int num) {
        

        string = string.toLowerCase();
        int number = 0;
        for (int i = 0; i < string.length(); i++) {
            number = number + string.charAt(i) - 96;
        }
        while (num > 0) {
            int sum = 0;
            while (number != 0) {
                sum = sum + number % 10;
                number = number / 10;
            }
            number = sum;
            num--;
        }
        return number;
    }

    
}