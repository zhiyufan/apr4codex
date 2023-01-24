package com.codex;

import java.util.*;

public class Solution {
    public static int countVowelSubstrings(String word) {
        
        int count = 0;
        for (int i = 0; i < word.length(); i++) {
            for (int j = i; j < word.length(); j++) {
                String sub = word.substring(i, j + 1);
                if (containsVowels1(sub)) {
                    count++;
                }
            }
        }
        return count;
    }

    private static boolean containsVowels1(String word) {
        int[] a = new int[5];
        for (char c : word.toCharArray()) {
            if (c == 'a') {
                a[0] = 1;
            }
            if (c == 'e') {
                a[1] = 1;
            }
            if (c == 'i') {
                a[2] = 1;
            }
            if (c == 'o') {
                a[3] = 1;
            }
            if (c == 'u') {
                a[4] = 1;
            }
        }
        int count=0;
        for(int i=0;i<a.length;i++) {
            if(a[i]==1)
                count++;
        }
        if(count==5)
            return true;
        else
            return false;
    
}