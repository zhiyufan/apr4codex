package com.codex;

import java.util.*;

public class Solution {
 class Solution {
  public int lengthLongestPath(String input) {
        if (input == null || input.length() == 0) {
        int len = input.length();
        int[] max = new int[len];
        // max[i] = the longest path ends at ith entry
        
        int level = 0;
        int curLen = 0;
        int maxLen = 0;
        boolean isFile = false;
        
        for (int i=0; i<len; i++) {
            char c = input.charAt(i);
            if (c == '\n') {
                if (isFile) {
                    maxLen = Math.max(maxLen, curLen);
                } else {
                    // if it's not a file, consider the parent path
                    max[level] = curLen;
                    if (level > 0) {
                        curLen = max[level-1] + curLen + 1;
                    } else {
                        curLen++;
                    }
                    maxLen = Math.max(maxLen, curLen);
                }
                level = 0;
                curLen = 0;
                isFile = false;
            } else if (c == '\t') {
                level++;
            } else if (c == '.') {
                isFile = true;
                curLen++;
            } else {
                curLen++;
            }
        }
        
        if (isFile) {
            maxLen = Math.max(maxLen, curLen);
        }
        
        return maxLen;
    }
}
            return 0;
        }

    
}