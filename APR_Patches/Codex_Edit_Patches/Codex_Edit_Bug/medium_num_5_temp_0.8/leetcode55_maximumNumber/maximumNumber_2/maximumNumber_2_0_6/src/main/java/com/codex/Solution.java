package com.codex;

import java.util.*;

public class Solution {
    public static String maximumNumber(String num, int[] change) {
        
        int n = change.length;
        int[] count = new int[n];
        for (char c : num.toCharArray()) count[c - '0']++;
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < n; i++)
            for (int j = 0; j < count[i]; j++)
                sb.append(i);
        return sb.reverse().toString();

    }

    
}