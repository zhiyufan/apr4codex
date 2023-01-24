package com.codex;

import java.util.*;

public class Solution {
    public static int getLucky(String s, int k) {
        

        int result = 0;
        for (int i = 0; i < s.length(); i++) {
            result += (s.charAt(i) - 'a' + 1);
        }
        for (int i = 0; i < k; i++) {
            int temp1 = 0;
            while (result > 0) {
                temp1 += result % 10;
                result /= 10;
            }
            result = temp1;
        }
        return result;
    }

    
}