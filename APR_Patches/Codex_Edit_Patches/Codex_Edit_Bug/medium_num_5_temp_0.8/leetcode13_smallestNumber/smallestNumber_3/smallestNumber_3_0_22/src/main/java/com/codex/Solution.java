package com.codex;

import java.util.*;

public class Solution {
    public static long smallestNumber(long num) {

        // corner case 
        if (num < 10)
            return num;

        StringBuilder sb = new StringBuilder();
        while (num != 0) {
            sb.append(num % 10);
            num /= 10;
        }
        String reversed = sb.reverse().toString();
        return Long.parseLong(reversed);
    }
}