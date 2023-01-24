package com.codex;

import java.util.*;

public class Solution {
    public static List<Integer> maxScoreIndices(int[] nums) {
    
        int n = nums.length;
        if (n == 0) return new ArrayList<>();
        int leftCount = 0, rightCount = n;
        for (; leftCount < n; leftCount++) {
            if (nums[leftCount] == 1) break;
        }
        for (; rightCount > leftCount; rightCount--) {
            if (nums[rightCount] == 0) break;
        }
        List<Integer> res = new ArrayList<>();
        int left = 0, right = leftCount;
        int max = leftCount;
        if (leftCount == rightCount) {
            res.add(leftCount);
        }
        while (right < rightCount) {
            while (left < rightCount && nums[left] == 0) {
                left++;
            }
            while (right < rightCount && nums[right] == 1) {
                right++;
            }
            if (leftCount - left + right - rightCount > max) {
                max = leftCount - left + right - rightCount;
                res = new ArrayList<>();
                res.add(left);
                res.add(right);
            } else if (leftCount - left + right - rightCount == max) {
                res.add(left);
                res.add(right);
            }
            left++;
            right++;
        }
        return res;
    }
    
    
    public static List<Integer> maxScoreIndices1 (int[] nums) {
        
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