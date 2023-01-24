package com.codex;

import java.util.*;

public class Solution {
 public static String maximumNumber(String num, int[] change) {
        
        int[] count = new int[10];
        
        int len = num.length();
        while(len-- > 0) {
            count[num.charAt(len) - '0']++; // count the number of times each digit appears in the number
        }
        int[] ans = new int[10];
        for(int i = 9; i >= 0; i--) {
            while(count[i] > 0) {
                ans[i]++;
                count[change[i]]--;
            }
        }
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < ans.length; i++) {
            while(ans[i]-- > 0) sb.append(i);
        }
        return sb.toString();
    }

    
}