package com.codex;

import java.util.*;

public class Solution {
    public static String maximumNumber(String num, int[] change) {
        StringBuilder sb = new StringBuilder(num);
        for (int i = 0; i < num.length(); i++) {
            int digit = num.charAt(i) - '0';
            sb.setCharAt(i, (char)(change[digit] + '0'));
        }
        return sb.toString();
    }
public static int getSeries(int k) {
        if (k < 3) {
            return 0;
        }
        int z = (k / 3) + (k % 3 > 0 ? 1 : 0)- 1;
        return (z * (z + 1)) / 2;
    }


    
}