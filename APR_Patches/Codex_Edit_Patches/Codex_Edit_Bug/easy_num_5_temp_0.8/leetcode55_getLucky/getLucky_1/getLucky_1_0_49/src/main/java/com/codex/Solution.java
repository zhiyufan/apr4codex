package com.codex;

import java.util.*;

public class Solution {
    public static int getLucky(String s, int k) {
        

        int result = 0;
        for (int i = 0; i < s.length(); i++) {
            result += (s.charAt(i) - 'a' + 1);
        }
        int temp = 0;
        while (result > 0) {
            temp += result % 10;
            result /= 10;
            if (result == 0) {
                k--;
                result = temp;
                temp = 0;
            }
            result = temp;
        }
        return result;
    }

    
}