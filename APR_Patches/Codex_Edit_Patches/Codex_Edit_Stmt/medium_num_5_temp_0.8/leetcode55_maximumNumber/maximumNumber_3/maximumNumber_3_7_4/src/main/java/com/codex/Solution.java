package com.codex;

import java.util.*;

public class Solution {
    public static String maximumNumber(String num, int[] change) {
        
        int[] count = new int[num.length() + 1];
        for(int i = 0; i < num.length(); i++) {
            count[i] = Integer.parseInt(String.valueOf(num.charAt(i)));
        }
        int[] ans = count;
        for(int i = 9; i >= 0; i--) {
            for(int j = 0; j < count[i]; j++) {
                ans[i + j]++;
                count[change[i]]--;
            }
        }
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < ans.length; i++) {        
            if(ans[i] > 9) {
                sb.append(i).append(ans[i] - 10);
            } else {
                while(ans[i]-- > 0) sb.append(i);
            }    
        }
        return sb.toString();
    }

    
}