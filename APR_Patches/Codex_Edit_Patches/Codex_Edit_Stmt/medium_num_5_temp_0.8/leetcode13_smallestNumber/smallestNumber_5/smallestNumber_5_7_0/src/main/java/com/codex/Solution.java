package com.codex;

import java.util.*;

public class Solution {
    public static long smallestNumber(long num) {
        
        String[] str = String.valueOf(num).split("");
        Arrays.sort(str);
        StringBuilder sb = new StringBuilder();
        for (String s : str) {
            sb.append(s);
        }
        return Long.parseLong(sb.toString());
    }

    
}