package com.codex;

import java.util.*;

public class Solution {
    public static int[] maxSubsequence(int[] nums, int k) {
        
        int n = nums.length;

        if(n < k){
            return new int[0];
        }

        int[] prefixSum = new int[n + 1];
        for(int i = 1; i <= n; ++i){
            prefixSum[i] = prefixSum[i - 1] + nums[i - 1];
        }

        int[] dp = new int[k + 1];
        int[] index = new int[k + 1];

        for(int i = 1; i <= k; ++i){
            int last = index[i - 1];
            while(last < i - 1 && dp[i - 1] - prefixSum[last] >= prefixSum[i] - prefixSum[last + 1]){
                last++;
            }
            dp[i] = Math.max(dp[i - 1], prefixSum[i] - prefixSum[last]);
            index[i] = last;
        }
        int[] ans = new int[k];
        int start = index[k];
        for(int i = k - 1; i >= 0; --i){
            while(start < k && prefixSum[k] - prefixSum[start] > dp[k] - prefixSum[start + 1]){
                start++;
            }
            ans[i] = k - start;
            k = start;
        }

        return ans;



public int[] maxSubsequence(int[] nums, int k) {
        int n = nums.length;
        int[] prefixSum = new int[n + 1];
        
        for(int i = 1; i <= n; ++i){
            prefixSum[i] = prefixSum[i - 1] + nums[i - 1];
        }

        int[] maxSum = new int[k + 1], maxIndex = new int[k + 1];

        for(int i = 1; i <= k; ++i){
            int p = maxIndex[i - 1];
            while(p < i - 1 && maxSum[i - 1] - prefixSum[p] >= prefixSum[i] - prefixSum[p + 1]){
                p++;
            }
            maxSum[i] = Math.max(maxSum[i - 1], prefixSum[i] - prefixSum[p]);
            maxIndex[i] = p;
        }
        int[] ans = new int[k];
        int last = maxIndex[k];
        // System.out.printf("max:%d, %d %d\n", maxSum[k], prefixSum[k], prefixSum[last]);
        for(int i = k - 1; i >= 0; --i){
            while(last < k && prefixSum[k] - prefixSum[last] > maxSum[k] - prefixSum[last + 1]){
                last++;
            }
            k = last;
            ans[i] = k - last + 1;
            last++;
        }
        return ans;
    }


import java.util.*;

public class Solution {
    private int lowBit(int x){
        return x & (-x);
    }
    private int getSum(int[] sum, int pos){
        int ans = 0;
        while(pos > 0){
            ans += sum[pos];
            pos -= lowBit(pos);
        }
        return ans;
    }
    private void update(int[] sum, int pos){
        while(pos < sum.length){
            sum[pos]++;
            pos += lowBit(pos);
        }
    }

    public List<List<Integer>> countSmaller(int[] nums) {
        int n = nums.length;
        int[] copy = Arrays.copyOf(nums, n);
        Arrays.sort(copy);
        HashMap<Integer, Integer> map = new HashMap<>();
        int[] index = new int[n];
        int c = 0;
        for(int i = 0; i < n; ++i){
            if(!map.containsKey(copy[i])){
                map.put(copy[i], ++c);
            }
        }
        for(int i = 0; i < n; ++i){
            int t = map.get(nums[i]);
            index[i] = t;
        }
        int[] sum = new int[n + 1];
        List<List<Integer>> ans = new ArrayList<>();
        for(int i = n - 1; i >= 0; --i){
            ans.add(0, Arrays.asList(nums[i], getSum(sum, index[i] - 1)));
            update(sum, index[i]);
        }
        return ans;
    }
}




    }
}