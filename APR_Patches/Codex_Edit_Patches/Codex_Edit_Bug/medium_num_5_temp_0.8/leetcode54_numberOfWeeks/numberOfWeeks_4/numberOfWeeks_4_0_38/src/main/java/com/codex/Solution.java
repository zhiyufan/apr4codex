package com.codex;

import java.util.*;

public class Solution {
    public static long numberOfWeeks(int[] milestones) {
        
        List<List<Integer>> list = new ArrayList<>();
        for (int i = 0; i < milestones.length; i++) {
            list.add(new ArrayList<>());
        }
        for (int i = 0; i < milestones.length; i++) {
            for (int j = i + 1; j < milestones.length; j++) {
                if (milestones[j] % milestones[i] == 0) {
                    list.get(i).add(j);
                }
            }
        }
        long[] dp = new long[milestones.length];
        for (int i = 0; i < dp.length; i++) {
            dp[i] = milestones[i];
        }
        for (int i = 0; i < milestones.length; i++) {
            for (int j = i + 1; j < milestones.length; j++) {
                for(int k : list.get(i)) {
                    if(k == j) {
                        continue;
                    }
                    dp[j] = Math.max(dp[j], dp[i] + milestones[j]);
                }
            }
        }
        long max = Long.MIN_VALUE;
        for (int i = 0; i < dp.length; i++) {
            max = Math.max(max, dp[i]);
        }
        return (max - 1) / 7 + 1;
    }




public class Solution {
    public int maxProduct(String[] words) {
        if(words == null || words.length == 0) {
            return 0;
        }
        
        int[] value = new int[words.length];
        for(int i = 0; i < words.length; i++) {
            String temp = words[i];
            value[i] = 0;
            for(int j = 0; j < temp.length(); j++) {
                value[i] |= 1 << (temp.charAt(j) - 'a');
            }
        }
        
        int maxProduct = 0;
        for(int i = 0; i < words.length; i++) {
            for(int j = i + 1; j < words.length; j++) {
                if((value[i] & value[j]) == 0 && (words[i].length() * words[j].length() > maxProduct)) {
                    maxProduct = words[i].length() * words[j].length();
                }
            }
        }
        return maxProduct;
    }
}
}