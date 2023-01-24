package com.codex;

import java.util.*;

public class Solution {
    public static String maximumNumber(String num, int[] change) {
        
        int[] count = new int[10];
        for(int i = 0; i < num.length(); i++) {
            count[Integer.parseInt(String.valueOf(num.charAt(i)))]++;
        }
        int[] ans = new int[10];
        for(int i = 9; i >= 0; i--) {
            while(count[i] > 0) {
                ans[i]++;
                count[change[i]]--; // count[change[i]]--;
            }
        }
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < ans.length; i++) {
            while(ans[i]-- > 0) sb.append(i);
        }
        return sb.toString();
    }

    
}