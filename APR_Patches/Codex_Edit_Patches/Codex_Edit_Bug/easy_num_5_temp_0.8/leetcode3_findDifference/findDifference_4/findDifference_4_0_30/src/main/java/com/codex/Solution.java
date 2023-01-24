package com.codex;

import java.util.*;

public class Solution {
 public static List<List<Integer>> getDivisors(int n) {
        List<List<Integer>> ans = new ArrayList<>(); // to store all the dividers.
        List<Integer> curr = new ArrayList<>();  // to store current dividers.
        helper(ans, curr, n);
        return ans;   
    }

    private static void helper(List<List<Integer>> ans, List<Integer> curr, int n) {
        for (int i = 1; i * i <= n; i++) {
            if (n % i != 0) {
                continue;
            }
            curr.add(i);
            if (i == Math.sqrt(n)) {
                ans.add(new ArrayList<>(curr));    // IMPORTANT: 
                                                   // if i == Math.sqrt(n), current dividers are dividers.
            } else {
                helper(ans, curr, n / i);    // continue to find more dividers.
            }
            curr.remove(curr.size() - 1);
        }
    }
}