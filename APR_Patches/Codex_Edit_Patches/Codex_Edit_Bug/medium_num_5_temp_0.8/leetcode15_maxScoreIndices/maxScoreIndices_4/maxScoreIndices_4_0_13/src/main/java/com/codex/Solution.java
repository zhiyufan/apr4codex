package com.codex;

import java.util.*;

public class Solution {
    public static List<Integer> maxScoreIndices(int[] a) {
        int max = Integer.MIN_VALUE;
        List<Integer> res = new ArrayList<>();
        for (int i = 0; i < a.length - 1; i++) {
            int[] left = Arrays.copyOfRange(a, 0, i + 1);
            int[] right = Arrays.copyOfRange(a, i + 1, a.length);
            int score = 0;
            for (int n : left) {
                if (n == 0) {
                    score++;
                }
            }
            for (int n : right) {
                if (n == 1) {
                    score++;
                }
            }
            if (score > max) {
                max = score;
                res.clear();
                res.add(i);
            } else if (score == max) {
                res.add(i);
            }
        }
        return res;
    }    
}