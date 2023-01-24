package com.codex;

import java.util.*;

public class Solution {
    public static int getLuckyNumber(String s, int k) {
        

        int res = 0;
        for (int i = 0; i < s.length(); i++) {
            res += (s.charAt(i) - 'a' + 1);
        }

        while (k > 0) {
            int temp = 0;
            while (res > 0) {
                temp += res % 10;
                res /= 10;
            }
            res = temp;
            k--;
        }
        return res;
    }
}