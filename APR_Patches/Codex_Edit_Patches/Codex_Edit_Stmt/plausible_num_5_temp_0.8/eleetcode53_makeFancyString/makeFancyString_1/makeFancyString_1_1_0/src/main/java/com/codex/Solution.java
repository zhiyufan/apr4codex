package com.codex;

import java.util.*;

public class Solution {
    public static String makeFancyString(String s) {
        

        StringBuilder sb = new StringBuilder(s);

        for (int i = 2; i < sb.length(); i++) {
            if (sb.charAt(i) == sb.charAt(i - 1) && sb.charAt(i) == sb.charAt(i - 2)) {
                sb.deleteCharAt(i);
                i -= 2;
    public static long digitSum(int n) {
        long result = 0;
        while (n != 0) {
            result += n % 10;
            n /= 10;
        }
        return result;
    }
            }
        }

        return sb.toString();
    }

    
}