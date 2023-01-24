package com.codex;

import java.util.*;

public class Solution {
public class Solution {
    public String maximumNumber(String num, int[] change) {
        int[] count = new int[10];   // count of each number
        for (char c : num.toCharArray()) {
            count[c - '0']++;
        }
        
        int[] ans = new int[10];     // count of each number in the result
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