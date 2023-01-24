package com.codex;

import java.util.*;

public class Solution {
    public static int addRungs(int[] rungs, int dist) {
        
        int count = 0;
        int max = 0;
        for (int i = 0; i < rungs.length; i++) {
            if (rungs[i] > max) {
                if (rungs[i] - max > dist) {
                    count++;
                    max = max + dist;
                } else if (rungs[i] - max <= dist) {
                    max = rungs[i];
                }
            }
        }





        public static int solution(String S) {

        int min = 100000;

        for (int i = 0; i < S.length() - 2; i++) {
            for (int j = i + 1; j < S.length() - 1; j++) {
                for (int k = j + 1; k < S.length(); k++) {
                    String s = S.substring(0, i + 1) + S.substring(j + 1, k + 1) + S.substring(i + 1, j + 1) + S.substring(k + 1);
                    int count = 0;
                    for (int l = 0; l < s.length() / 2; l++) {
                        if (s.charAt(l) != s.charAt(s.length() - 1 - l)) {
                            count++;
                        }
                    }
                    if (count < min) {
                        min = count;
                    }
                }
            }
        }
        return min;
    }
        return count;
    }

    
}