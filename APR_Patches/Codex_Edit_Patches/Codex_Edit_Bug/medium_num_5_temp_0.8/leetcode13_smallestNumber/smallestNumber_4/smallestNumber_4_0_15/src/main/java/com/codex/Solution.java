package com.codex;

import java.util.*;

public class Solution {
    public static long smallestNumber(long num) {
        
        String s = String.valueOf(num);
        char[] c = s.toCharArray();
        Arrays.sort(c);
        String newS = new String(c);
        return Long.parseLong(newS);
    }

    
}