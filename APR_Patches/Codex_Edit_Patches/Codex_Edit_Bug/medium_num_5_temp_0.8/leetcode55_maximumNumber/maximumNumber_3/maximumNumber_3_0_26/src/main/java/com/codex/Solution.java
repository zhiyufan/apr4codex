package com.codex;

import java.util.*;

public class Solution {
    public static String maximumNumber(String num, int[] change) {
        
        int n = num.length();
        StringBuilder sb = new StringBuilder(n);
        
        for(int i = 0; i < change.length; i++) {
            for(int j = 0; j < change[i]; j++) {
                sb.append(i);
            }
        }
        
        int len = sb.length();
        int i = 0, j = n - 1;
        while(i < len && j >= 0) {
            if(sb.charAt(i) < num.charAt(j)) break;
            if(sb.charAt(i) > num.charAt(j)) {
                int k = j - 1;
                while(k >= 0 && num.charAt(k) == num.charAt(j)) {
                    k--;
                }
                if(k >= 0 && num.charAt(k) < num.charAt(j)) {
                    swap(sb, k, j);
                    return sb.toString();
                }
            }
            i++;
            j--;
        }
        Collections.sort(sb);
        return sb.toString();
    }

    private static void swap(StringBuilder sb, int i, int j) {
        char c = sb.charAt(i);
        sb.setCharAt(i, sb.charAt(j));
        sb.setCharAt(j, c);
    }
}