package com.codex;

import java.util.*;

public class Solution {
    public static int countElements(int[] nums) {
        
        int count = 0;
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if(map.containsKey(nums[i])) {
                map.put(nums[i], map.get(nums[i]) + 1);
            } else {
                map.put(nums[i], 1);
            }
        }
        for (int i = 0; i < nums.length; i++) {
            if(map.containsKey(nums[i] + 1)) {
                count += 1;
            }
        }
        return count;
    }

   
public static int countDigitOne(int n) {
        int count = 0;
        for(long i = 1; i <= n; i = i * 10) {
            long divide = i * 10;
            count += (n / divide) * i + Math.min(Math.max(n % divide - i + 1, 0), i);
        }
        return count;
    }


public static int kthSmallest(int[][] matrix, int k) {
        int n = matrix.length;
        int left = matrix[0][0];
        int right = matrix[n - 1][n - 1];
        while(left < right) {
            int mid = left + (right - left) / 2;
            int count = 0;
            int  j = n - 1;
            for(int i = 0; i < n; i++) {
                while(j >= 0 && matrix[i][j] > mid) j--;
                count += (j + 1);
            }
            if(count < k) left = mid + 1;
            else right = mid;
        }
        return left;
    }
}