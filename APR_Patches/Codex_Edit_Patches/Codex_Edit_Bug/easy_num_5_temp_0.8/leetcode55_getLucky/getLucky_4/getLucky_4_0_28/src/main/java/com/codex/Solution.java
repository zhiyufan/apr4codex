package com.codex;

import java.util.*;

public class Solution {
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
        
        int result = 0;
        if (ans == 1 || ans == 7) {
            result = 0;
        } else if (ans == 4 || ans == 9) {
            result = 6;
        } else if (ans == 2 || ans == 3 || ans == 5) {
            result = 5;
        } else if (ans == 6 || ans == 8) {
            result = 4;
        }
        
        return result;
    }
            k--;
        }
        return ans;
    }
}