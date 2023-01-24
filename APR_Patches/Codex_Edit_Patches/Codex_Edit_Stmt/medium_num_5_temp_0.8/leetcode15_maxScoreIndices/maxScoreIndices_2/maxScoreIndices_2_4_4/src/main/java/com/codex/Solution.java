package com.codex;

import java.util.*;

public class Solution {
    class Pair {
        int left;
        int right;
        public Pair(int left, int right) {
            this.left = left;
            this.right = right;
        }
        public String toString() {
            return "(" + left + ", " + right + ")";
        }
    }
    // 1 0 1 0 1 1 
    // 0 0 1 0 1 1
    // 0 0 0 1 1 1
    // 0 0 1 0 2 1
    // 0 0 1 1 1 1
    // 0 0 1 1 3 1
    // 0 1 1 1 2 1
    // 0 1 1 1 4 1
    // 1 0 1 1 3 1
    // 1 0 1 1 5 1
    // 1 0 2 1 4 1
    // 3 1 2 1 3 1
    public static List<Integer> maxScoreIndices(int[] nums) {
        
        int n = nums.length; // n = 6
        if (n == 0) return new ArrayList<>(); // n = 0,  res = []
        int[] leftCount = new int[n]; // leftCount = [0, 0, 0, 0, 0, 0]
        int[] rightCount = new int[n]; // rightCount = [0, 0, 0, 0, 0, 0]
        
        int cur = 0; // cur = 0
        for (int i = 0; i < n; i++) { // i = 0 -> 5
            cur += nums[i]; // cur = 1; cur = 1; cur = 2; cur = 2; cur = 3; cur = 4;
            leftCount[i] = cur; // leftCount = [0, 1, 1, 2, 2, 3]
        }
        cur = 0; // cur = 0
        for (int i = n - 1; i >= 0; i--) { // i = 5, 4, 3, 2, 1, 0
            cur += nums[i] ^ 1; // cur = 1; cur = 1; cur = 2; cur = 3; cur = 3; cur = 3;
            rightCount[i] = cur; // rightCount = [1, 1, 2, 3, 3, 3]
        }
        int max = 0; // max = 0
        List<Integer> res = new ArrayList<>(); // res = []
        
        //  0  1  2  3  4  5
        // [3, 1, 2, 1, 3, 1]
        // [1, 1, 2, 3, 3, 3]
        // leftCount = [0, 1, 1, 2, 2, 3]
        // rightCount = [1, 1, 2, 3, 3, 3]
        
        List<Pair> index = new ArrayList<>();
        for (int i = 0; i < n; i++) { // i = 0 -> 5
            int left = i == 0 ? 0 : leftCount[i - 1]; // left = 0, 1, 1, 2, 2, 3
            int right = i == n - 1 ? 0 : rightCount[i + 1]; // right = 1, 1, 2, 3, 3, 3
            int sum = left + right; // sum = 1, 2, 3, 5, 5, 6
            if (sum > max) {
                max = sum; // max = 1, 2, 3, 5, 5, 6
                res = new ArrayList<>(); // res = [], [0], [1], [1, 2], [1, 2], [1, 2, 5]
                res.add(i); // res = [0], [1], [1, 2], [1, 2], [1, 2, 5]
            } else if (sum == max) {
                res.add(i);
            }
        }
        return res;
    }

    
}