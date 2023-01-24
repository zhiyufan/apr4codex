package com.codex;

import java.util.*;

public class Solution {
    public static int getLucky(String s, int k) {
        

        int result = 0;
        for (int i = 0; i < s.length(); i++) {
        int num = result;
            result += (s.charAt(i) - 'a' + 1);
        }
        for (int i = 0; i < k; i++) {
            int temp = 0;
            while (num > 0) {
                temp += num % 10;
                num /= 10;
            }
            result = temp;
        }
        return result;
    }

    
}