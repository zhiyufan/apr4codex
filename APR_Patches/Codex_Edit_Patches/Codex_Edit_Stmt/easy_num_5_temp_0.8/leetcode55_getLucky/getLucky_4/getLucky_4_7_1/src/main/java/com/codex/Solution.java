package com.codex;

import java.util.*;

public class Solution {
    public static int getLucky(String s, int k) {

        int ans = 0;
        for (int i = 0; i < s.length(); i++) {
            ans += (s.charAt(i) - 'a' + 1);
        }

        int temp = ans;
        while (k > 0) {
            temp = getSingleDigitSum(ans);
            if (temp == ans) {
                break;
            }
            ans = temp;
            k--;
        }
        return ans;
    }

    private static int getSingleDigitSum(int n) {
        int ans = 0;
        while (n > 0) {
            ans += n % 10;
            n /= 10;
        }
        return ans;
    }
    
    public static int getLucky(String s, int k) {
        

        int ans = 0;
        for (int i = 0; i < s.length(); i++) {
            ans += (s.charAt(i) - 'a' + 1);
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