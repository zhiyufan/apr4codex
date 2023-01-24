package com.codex;

import java.util.*;

public class Solution {
    public static int getLucky(int n, int k) {
        

        int ans = 0;
        for (int i = 0; i < n.length(); i++) {
            ans += (n.charAt(i) - 'a' + 1);
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