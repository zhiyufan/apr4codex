package com.codex;

import java.util.*;

public class Solution {
    public static int getLucky(String s, int k) {
        

        int result = 0;
        for (int i = 0; i < str.length(); i++) {
            result += (s.charAt(i) - 'a' + 1);
        }
        for (int i = 0; i < k; i++) {
            int tmp = 0;
            while (result > 0) {
                tmp += result % 10;
                result /= 10;
            }
            result = tmp;
        }
        return result;
    }
}