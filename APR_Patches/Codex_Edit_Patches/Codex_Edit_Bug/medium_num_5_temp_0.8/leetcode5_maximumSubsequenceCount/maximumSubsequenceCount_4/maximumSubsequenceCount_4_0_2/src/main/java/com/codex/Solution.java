package com.codex;

import java.util.*;

public class Solution {
   public static long maximumSubsequenceCount(String text, String pattern) {
        
        int[] a = new int[26];
        long res = 0;
        int[] b = new int[26];
        for(int i=0;i<26;i++)
            a[i] = 0;
        for(int i=0;i<26;i++)
            b[i]=0;
        for(int i=0;i<text.length();i++)
            a[text.charAt(i)-'a']++;
        for(int i=0;i<pattern.length();i++)
            b[pattern.charAt(i)-'a']++;
        for(int i=0;i<26;i++){
            res+=Math.min(a[i],b[i]);
        }

        for (int i = 0; i < text.length(); i++) {
            a[text.charAt(i) - 'a']++;
        }
        for (int i = 0; i < pattern.length(); i++) {
            b[pattern.charAt(i) - 'a']++;
        }
        for (int i = 0; i < 26; i++) {
            res += Math.min(a[i], b[i]);
        }
        return res;
    }

    
}