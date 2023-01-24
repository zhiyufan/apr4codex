package com.codex;

import java.util.*;

public class Solution {
import java.util.*;

public class Main {

    public static int solve(int[] A, int index) {
        int sum = 0;
        int totalSum = 0;
        int[] lefts = new int[A.length];
        int[] rights = new int[A.length];

        for (int i = 0; i < A.length; i++) {
            totalSum += A[i];
            lefts[i] = totalSum;
        }

        totalSum = 0;

        for (int i = A.length - 1; i >= 0; i--) {
            totalSum += A[i];
            rights[i] = totalSum;
        }

        for (int i = 0; i <= A.length - 1; i++) {
            if (lefts[i] == rights[i]) {
                sum = lefts[i];
                index = i;
                break;
            }
        }

        return sum;
    }

    public static void main(String[] args) {
        int index = 0;
        int[] A = new int[]{-7, 1, 5, 2, -4, 3, 0};
        int solve = solve(A, index);
        System.out.println(index);
    }

    private static int getNumberOfZeros(int[] nums, int left, int right) {
        int result = 0;
        for (int i = left; i <= right; i++) {
            if (nums[i] == 0) {
                result++;
            }
        }
        return result;
    }

    
}