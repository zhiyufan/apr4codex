package com.codex;

import java.util.*;

public class Solution {
public class Solution {
    public int[] countSteppingNumbers(int low, int high) {
        long mod = 1000000007;
        List<Long> res = new ArrayList<>();
        if (low == 0) res.add((long) 0);
        for (long i = 1; i < 10; i++) dfs(res, mod, i, low, high);
        int[] ans = new int[res.size()];
        int k = 0;
        for (long num : res) ans[k++] = (int) num;
        return ans;
    }
    
    private void dfs(List<Long> nums, long mod, long cur, long low, long high) {
        if (cur > high) return;
        if (cur >= low) nums.add(cur);
        int last = (int)(cur % 10);
        if (last > 0) dfs(nums, mod, cur * 10 + last - 1, low, high);
        if (last < 9) dfs(nums, mod, cur * 10 + last + 1, low, high);
    }
}

public int numSubseq(int[] nums, int target) {
        Arrays.sort(nums);
        int n = nums.length;
        long[] pow = new long[n];
        pow[0] = 1;
        for (int i = 1; i < n; i++) {
            pow[i] = (pow[i - 1] << 1) % 1000000007;
        }
        int l = 0, r = n - 1;
        long res = 0;
        while (l <= r) {
            if (nums[l] + nums[r] > target) {
                r--;
            } else {
                res += pow[r - l] % 1000000007;
                l++;
            }
        }
        return (int) res % 1000000007;
    }
}