package com.codex;

import java.util.*;

public class Solution {
public class Solution {
    /**
    * @param sums: an array
    * @param k: an integer
    * @return: the max sum of subarray
    */
    public int maxSubarray(int[] sums, int k) {
        // Write your code here
        int n = sums.length;
        int[] A = new int[n + 1];
        for (int i = 1; i <= n; i++) {
		    A[i] = A[i - 1] + sums[i - 1];
        }
        int res = 0;
        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {
                if (j - i + 1 >= k) {
                    res = Math.max(A[j + 1] - A[i], res);
                }
            }
        }
        return res;
    }
}
}