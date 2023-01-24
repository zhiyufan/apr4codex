package com.codex;

import java.util.*;

public class Solution {
    public static long smallestNumber(long number) {
        
        long small = number % 10;
        long result = 0;
        while(number > 0) {
            long num = number % 10;
            if(small > num) {
                small = num;
            }
            result = result * 10 + num;
            number = number / 10;
        }
        long result = Long.parseLong(newString);
        return result;
    }

    
}