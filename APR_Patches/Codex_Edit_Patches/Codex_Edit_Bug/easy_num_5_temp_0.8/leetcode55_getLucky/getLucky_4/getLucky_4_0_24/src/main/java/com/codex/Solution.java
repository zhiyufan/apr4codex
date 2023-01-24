package com.codex;

import java.util.*;

public class Solution {
    public static int getLucky(String s, int k) {
        int[] count = new int[26];

        for (int i = 0; i < s.length(); i++) {
            count[s.charAt(i) - 'a']++;
        }

        int min = 26;
        for (int c : count) {
            min = Math.min(min, c);
        }

        for (int i = 0; i < 26; i++) {
            count[i] -= min;
        }


        int ans = 0;
        for (int i = 0; i < 26; i++) {
            ans += count[i] * (i + 1);
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