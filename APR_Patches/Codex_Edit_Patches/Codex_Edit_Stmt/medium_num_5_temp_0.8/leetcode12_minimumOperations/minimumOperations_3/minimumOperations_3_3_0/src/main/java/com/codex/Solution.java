package com.codex;

import java.util.*;

public class Solution {
class Solution {
    public int minOperations(String[] logs) {
        int ret = 0;
        for (String s : logs) {
            if (s.equals("../")) {
               ret = Math.max(ret - 1, 0);
            } else if (s.equals("./")) {
                
            } else {
                ret++;
            }
            
        }
        return Math.min(dp[len-1][0], dp[len-1][1]);
    }

    
}