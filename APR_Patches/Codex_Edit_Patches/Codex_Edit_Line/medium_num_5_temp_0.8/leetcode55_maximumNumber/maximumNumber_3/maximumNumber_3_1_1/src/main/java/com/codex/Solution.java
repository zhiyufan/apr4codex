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
                count[change[i]]--;
            }
        }
        StringBuilder sb = new StringBuilder();
        int flag = 1;
        for(int i = 0; i < ans.length; i++) {
            while(ans[i]-- > 0 ) {
                if(flag == 1 && i == 0 && sb.length() == 0) continue;
                else {
                    if(sb.length() > 0) flag = 0;
                    sb.append(i);
                }
            }
        }
        return sb.toString();
    }

    
}