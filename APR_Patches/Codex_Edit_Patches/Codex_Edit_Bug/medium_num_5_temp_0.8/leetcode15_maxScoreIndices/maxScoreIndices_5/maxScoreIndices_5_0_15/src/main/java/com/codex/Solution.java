package com.codex;

import java.util.*;

public class Solution {
import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] nums = new int[scanner.nextInt()];
        for (int i = 0; i < nums.length; i++) {
            nums[i] = scanner.nextInt();
        }
        printArray(maxScoreIndices(nums));
    }

    public static void printArray(int[] array) {
        System.out.print("[");
        for (int i = 0; i < array.length; i++) {
            if (i == 0) {
                System.out.print(array[i]);
            } else {
                System.out.print(", " + array[i]);
            }
        }
        System.out.println("]");
    }

    public static int[] maxScoreIndices(int[] nums) {
        
        int maxScore = 0;
        List<Integer> resultList = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            int zeroLeft = getNumberOfZeros(nums, 0, i - 1);
            int oneRight = getNumberOfOnes(nums, i, nums.length - 1);
            if (zeroLeft + oneRight > maxScore) {
                maxScore = zeroLeft + oneRight;
                result.clear();
                result.add(i);
            } else if (zeroLeft + oneRight == maxScore) {
                result.add(i);
            }
        }

        return result;
    }

    private static int getNumberOfOnes(int[] nums, int left, int right) {
        int result = 0;
        for (int i = left; i <= right; i++) {
            if (nums[i] == 1) {
                result++;
            }
        }
        return result;
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