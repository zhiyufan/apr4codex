package com.codex;

import java.util.*;

public class Solution {
    public List<List<Integer>> threeSum(int[] num) {
        List<List<Integer>> res = new ArrayList<>();
        Arrays.sort(num);
        int i = 0;
        while (i < num.length - 2) {
            int j = i + 1;
            int k = num.length - 1;
            while (j < k) {
                int sum = num[i] + num[j] + num[k];
                if (sum == 0) {
                    List<Integer> r = new ArrayList<>();
                    r.add(num[i]);
                    r.add(num[j]);
                    r.add(num[k]);
                    res.add(r);
                    j++;
                    k--;
                    while (j < k && num[j] == num[j - 1]) {
                        j++;
                    }
                    while (j < k && num[k] == num[k + 1]) {
                        k--;
                    }
                } else if (sum > 0) {
                    k--;
                } else {
                    j++;
                }
            }
            i++;
            while (i < num.length - 2 && num[i] == num[i - 1]) {
                i++;
            }
        }
        return res;
    }
}