package com.codex;

import java.util.*;

public class Solution {
public class Solution {
    public int lengthOfLongestSubstring(String s) {
        if (s == null || s.length() == 0) return 0;
        int curLen = 0;
        int maxLen = 0;
        HashMap<Character, Integer> map = new HashMap<Character, Integer>();
        int n = s.length();
        for (int i = 0; i < n; i++) {
            if (!map.containsKey(s.charAt(i))) {
                map.put(s.charAt(i), i);
                curLen ++;
            } else {
                curLen = Math.min(curLen + 1, i - map.get(s.charAt(i)));
                map.put(s.charAt(i), i);
            }
            maxLen = Math.max(curLen, maxLen);
        }
        return maxLen;
    }// end of method
}
}