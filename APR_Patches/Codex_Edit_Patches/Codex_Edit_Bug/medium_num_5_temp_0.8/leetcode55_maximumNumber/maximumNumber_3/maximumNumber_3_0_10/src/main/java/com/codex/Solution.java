package com.codex;

import java.util.*;

public class Solution {
  public static String maximumNumber(String num, int[] change) {
        
        int[] count = new int[10];
        int res = 0;
        int sum = 0;
        for(int i = 0; i < num.length(); i++) {
            count[Integer.parseInt(String.valueOf(num.charAt(i)))]++;
            sum += change[Integer.parseInt(String.valueOf(num.charAt(i)))];
        }
        if(change[0] == 0) res = 1;
        while(sum != 0) {
            res++;
            sum >>= 1;
        }
        int[] ans = new int[10];
        for(int i = 9; i > 0; i--) {
            while(count[i] > 0) {
                ans[i]++;
                count[change[i]]--;
            }
        }
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < res; i++) {
            sb.append('0');
        }
        for(int i = 0; i < ans.length - 1; i++) {
            while(ans[i]-- > 0) {
                sb.append(i);
            }
        }
        return sb.toString();
    }

    
}