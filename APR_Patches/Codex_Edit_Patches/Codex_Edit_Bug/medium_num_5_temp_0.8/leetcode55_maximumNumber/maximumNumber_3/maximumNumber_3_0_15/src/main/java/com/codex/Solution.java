package com.codex;

import java.util.*;

public class Solution {
	public static String maximumNumber(String num, int[] change) {
        
        int[] count = new int[10];
        int[] index = new int[10];
        for(int i = 0; i < num.length(); i++) {
            int j = Integer.parseInt(String.valueOf(num.charAt(i)));
            count[j]++;
            index[j] = i;
        }
        int[] ans = new int[10];
        for(int i = 0; i < 10; i++) {
            while(count[i] > 0) {
                ans[i]++;
                count[change[i]]--;
            }
        }
        for(int i = 0; i < 10; i++) {
            if(change[i] == -1) {
                ans[i] = count[i];
            }
        }
        StringBuilder sb = new StringBuilder();
        while(true) {
            boolean flag = true;
            for(int i = 0; i < 10; i++) {
                if(ans[i] > 0) {
                    sb.append(i);
                    ans[i]--;
                    flag = false;
                    break;
                }
            }
            if(flag) break;
        }
        return sb.toString();
    }

    
}