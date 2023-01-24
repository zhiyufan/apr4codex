package com.codex;

import java.util.*;

public class Solution {
class MaximumNumber {
    
    public static int maximumNumber(String num, int[] change) {
        
        StringBuilder sb = new StringBuilder(num);
        for (int i = 0; i < num.length(); i++) {
            int digit = num.charAt(i) - '0';
            sb.setCharAt(i, (char)(change[digit] + '0'));
        }
        
        return Integer.parseInt(sb.toString());
    }

  

        int[] change = new int[10];
        for (int i = 0; i < 10; i++) {
            change[i] = i;
        }
        change[0] = 1;
        change[6] = 9;
        change[9] = 6;
        System.out.println(maximumNumber("123", change));
}
}