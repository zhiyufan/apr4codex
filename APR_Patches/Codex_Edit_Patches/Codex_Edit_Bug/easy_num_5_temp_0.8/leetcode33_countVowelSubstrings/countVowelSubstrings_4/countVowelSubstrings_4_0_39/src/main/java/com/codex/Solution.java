package com.codex;

import java.util.*;

public class Solution {
    public static int countVowelSubstrings(String word) {
        
        int count = 0;
        for (int i = 0; i < word.length(); i++) {
            for (int j = i; j < word.length(); j++) {
                String sub = word.substring(i, j + 1);
                if (containsVowels(sub)) {
                    count++;
                }
            }
        }
        return count;
    }

    private static boolean containsVowels(String word) {
        boolean a = false, e = false, i = false, o = false, u = false;
        for (char c : word.toCharArray()) {
            if (c == 'a') {
                a = true;
            }
            if (c == 'e') {
                e = true;
            }
            if (c == 'i') {
                i = true;
            }
            if (c == 'o') {
                o = true;
            }
            if (c == 'u') {
                u = true;
            }
        }
        return a && e && i && o && u;
    
    public int solution(int[] A) {
        int[] leftSums = new int[A.length];
        int[] rightSums = new int[A.length];
        
        leftSums[0] = 0;
        rightSums[A.length - 1] = 0;
        
        for (int i = 1; i < A.length; i++) {
            leftSums[i] = leftSums[i - 1] + A[i - 1];
        }
        for (int i = A.length - 2; i >= 0; i--) {
            rightSums[i] = rightSums[i + 1] + A[i + 1];
        }
        
        for (int i = 0; i < A.length; i++) {
            if (leftSums[i] == rightSums[i]) {
                return i;
            }
        }
        return -1;
    }
    }

    
}