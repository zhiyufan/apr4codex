package com.codex;

import java.util.*;

public class Solution {
   public static int getLucky(String s, int k) {
        int temp = 0;
        for (int i = 0; i < s.length(); i++) {
            temp += (s.charAt(i) - 'a' + 1);
        }

        while (k > 0) {
            while (temp > 0) {
                ans += temp % 10;
                temp /= 10;
            }
            k--;
        }
        return ans;
    }
}