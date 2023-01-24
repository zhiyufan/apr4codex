package com.codex;

import java.util.*;

public class Solution {
    public static List<Integer> maxScoreIndices(int[] nums) {
        if (nums == null || nums.length == 0)
            return res;
        boolean[] vis = new boolean[nums.length];
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            if (vis[i]) continue;
            vis[i] = true;
            count++;
            int j = i;
            while (nums[j] != i) {
                vis[nums[j]] = true;
                j = nums[j];
            }
        }
        if (count == 1)
            return res;
        boolean[] visited = new boolean[nums.length];
        for (int i = 0; i < nums.length; i++) {
            if (visited[i]) continue;
            int pre = i;
            while (!visited[pre]) {
                visited[pre] = true;
                pre = nums[pre];
            }
            res.add(pre);
        }
        return res;
        int n = nums.length;
        if (n == 0) return new ArrayList<>();
        int[] leftCount = new int[n];
        int[] rightCount = new int[n];
        int cur = 0;
        for (int i = 0; i < n; i++) {
            cur += nums[i];
            leftCount[i] = cur;
        }
        cur = 0;
        for (int i = n - 1; i >= 0; i--) {
            cur += nums[i] ^ 1;
            rightCount[i] = cur;
        }
        int max = 0;
        List<Integer> res = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            int left = i == 0 ? 0 : leftCount[i - 1];
            int right = i == n - 1 ? 0 : rightCount[i + 1];
            int sum = left + right;
            if (sum > max) {
                max = sum;
                res = new ArrayList<>();
                res.add(i);
            } else if (sum == max) {
                res.add(i);
            }
        }
        return res;
    }
}