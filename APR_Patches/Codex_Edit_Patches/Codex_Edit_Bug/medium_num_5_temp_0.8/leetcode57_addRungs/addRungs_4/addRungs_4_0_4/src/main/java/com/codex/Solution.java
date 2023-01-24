package com.codex;

import java.util.*;

public class Solution {
public class Solution {
    public static int addRungs(int[] rungs, int dist) {
        
        int rungsAdded = 0;
        int currReach = rungs[0] + dist;
        for (int i = 1; i < rungs.length; i++) {
            if (rungs[i] > currReach) {
                rungsAdded++;
                currReach = rungs[i] + dist;
            }
        }
        return rungsAdded;
    }
    public static void main(String args[]) {
    	int[] a = {4,6,3,7,6,6,9};
    	System.out.println(solution(a));
    	
    }

    public static int solution(int[] A) {
        if (A.length == 0) {
            return -1;
        }
        int maxSum = findSum(A, 0, A.length - 1);
        int secondSum = 0;
        int maxPos = 0;
        int maxNeg = 0;
        int sum = 0;
        for (int i = 1; i < A.length; i++) {
            sum = findSum(A, 0, i - 1);
            if (sum > maxPos) {
                maxPos = sum;
            }
            sum = findSum(A, i+1, A.length - 1);
            if (sum > maxNeg) {
                maxNeg = sum;
            }
            if (maxPos + maxNeg > secondSum) {
                secondSum = maxPos + maxNeg;
            }
        }
        return maxSum > secondSum ? maxSum : secondSum;
    }
    
    public static int findSum(int[] a, int start, int end) {
        int sum = 0;
        for (int i = start; i <= end; i++) {
            sum = sum + a[i];
        }
        return sum;
    }
}
    
}