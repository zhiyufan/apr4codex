package com.codex;

import java.util.*;

public class Solution {
    public int minTimeToType(String word) {
        

        if (word == null || word.length() == 0) {
                return 0;
        }

        
        int result = 0;
        int length = word.length();
        int cur = 0;

        for (int i = 0; i < length; i++) {
            int next = word.charAt(i) - 'a';
            result += Math.min(Math.abs(next - cur), 26 - Math.abs(next - cur));
            cur = next;
        }

        return result;
    }

    
}