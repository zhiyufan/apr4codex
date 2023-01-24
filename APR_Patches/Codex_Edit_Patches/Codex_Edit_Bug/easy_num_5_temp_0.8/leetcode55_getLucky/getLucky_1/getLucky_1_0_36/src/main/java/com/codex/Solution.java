package com.codex;

import java.util.*;

public class Solution {
    public static int getLucky(String s, int k) {
       int num = 0, temp = 0;
        for (int i = 0; i < s.length(); i++) {
            num += (s.charAt(i) - 'a' + 1);
        }

        int result = 0;
        for (int i = 0; i < s.length(); i++) {
            temp = num;
            for (int j = 0; j < k; j++) {
                result = 0;
                while (temp > 0) {
                    result += temp % 10;
                    temp /= 10;
                }
                temp = result;
            }
            result = temp;
        }
        return result;
    }

    
}