package com.codex;

import java.util.*;

public class Solution {
    public static int countSubstringsWithOnlyOneDistinctLetter(String S) {

        int n = S.length();
        int ans = 0;
        for (int i = 0; i < n; i++) {
            int remain = n - i;
            char thisChar = S.charAt(i);
            for (int j = 1; j <= remain; j++) {
                String next = S.substring(i, i + j);
                int count = 0;
                for (int k = 0; k < next.length(); k++) {
                    if (next.charAt(k) == thisChar) {
                        count++;
                    }
                }
                if (next.length() == count) {
                    ans++;
                }
            }
        }
        return ans;
    }
    
/*
public static String makeFancyString(String s) {
        

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            char thisChar = s.charAt(i);
            if (i == 0) {
                sb.append(thisChar);
            } else {
                char lastChar = sb.charAt(sb.length() - 1);
                char lastLastChar = sb.length() >= 2 ? sb.charAt(sb.length() - 2) : ' ';
                if (lastChar != thisChar && lastLastChar != thisChar) {
                    sb.append(thisChar);
                }
            }
        }
 */
        return sb.toString();
    }

    
}