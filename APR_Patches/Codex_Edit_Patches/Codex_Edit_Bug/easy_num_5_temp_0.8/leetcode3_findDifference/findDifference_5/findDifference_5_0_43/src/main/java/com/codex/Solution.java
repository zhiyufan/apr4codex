package com.codex;

import java.util.*;

public class Solution {

    // 2d dp
    public boolean wordBreak(String s, List<String> wordDict) {
        // dp[i] 表示s.substring(0, i) 中的字符串可以由wordDict 构成
        boolean[] dp = new boolean[s.length() + 1];
        // 初始化第零位为true 表示空字符串
        dp[0] = true;

        // i表示字符串的长度
        for (int i = 1; i <= s.length(); i++) {
            // j 表示前i个字符串中从后向前数第一个为true 的位置
            // 如果某个前缀可以构成，第i位就可以由wordDict中的元素构成
            for (int j = i - 1; j >= 0; j--) {
                if (dp[j]) {
                    String sub = s.substring(j, i);
                    if (wordDict.contains(sub)) {
                        dp[i] = true;
                        break;
                    }
                }
            }
        }
        for (int n2 : nums2) {
            if (map.containsKey(n2)) {
                map.remove(n2);
            } else {
                map.put(n2, 1);
            }
        }
        List<List<Integer>> result = new ArrayList<>();
        result.add(new ArrayList<>());
        result.add(new ArrayList<>());
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (entry.getValue() == 1) {
                result.get(0).add(entry.getKey());
            } else {
                result.get(1).add(entry.getKey());
            }
        }
        return result;
    }

    
}