package com.codex;

import java.util.*;

public class Solution {
    public static int getLucky(String s, int k) {
        

        int ans = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) - 'a' >= 0 && s.charAt(i) - 'a' < 26) {
                ans += (s.charAt(i) - 'a' + 1);
            } else if (s.charAt(i) - 'A' >= 0 && s.charAt(i) - 'A' < 26) {
                ans += (s.charAt(i) - 'A' + 1);
            }
        }

        while (k > 0) {
            int temp = 0;
            while (ans > 0) {
                temp += ans % 10;
                ans /= 10;
            }
            ans = temp;
            k--;
        }
        return ans;
    }
}