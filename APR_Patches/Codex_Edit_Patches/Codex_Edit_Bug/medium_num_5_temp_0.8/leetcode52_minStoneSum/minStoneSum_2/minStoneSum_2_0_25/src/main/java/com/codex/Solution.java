package com.codex;

import java.util.*;

public class Solution {
    // Time complexity: O(nlogn)
    public static int minStoneSum(int[] piles, int k) {
        
        int left = 0;
        int right = 0;
        for (int pile : piles) {
            right += pile;
            left = Math.max(left, pile);
        }

        while (left < right) {
            int mid = left + (right - left) / 2;
            int count = 0;
            for (int pile : piles) {
                count += (pile - 1) / mid + 1;
            }
            if (count <= k) {
                right = mid;
            } else {
                left = mid + 1;
            }
        }

        return left;
    }

    // Time complexity: O(nlog(sumOfPiles))
    public static int lastStoneWeight(int[] stones) {
        int left = 0;
        int right = 0;
        for (int stone : stones) {
            right += stone;
            left = Math.max(left, stone);
        }

        while (left < right) {
            int mid = left + (right - left) / 2;
            int count = 0;
            for (int stone : stones) {
                count += stone / mid;
            }
            if (count < 2) {
                right = mid;
            } else {
                left = mid + 1;
            }
        }

        return left;
    }

    // Time complexity: O(logn)
    public static int splitArray(int[] nums, int m) {
        int left = 0;
        int right = 0;
        for (int num : nums) {
            right += num;
            left = Math.max(left, num);
        }

        while (left < right) {
            int mid = left + (right - left) / 2;
            int count = 0;
            int currSum = 0;
            for (int num : nums) {
                if (currSum + num > mid) {
                    count++;
                    currSum = num;
                } else {
                    currSum += num;
                }
            }
            count++;
            
            if (count <= m) {
                right = mid;
            } else {
                left = mid + 1;
            }
        }

        return left;
    }
}