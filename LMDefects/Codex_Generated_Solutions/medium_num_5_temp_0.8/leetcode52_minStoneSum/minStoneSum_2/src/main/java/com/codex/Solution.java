package com.codex;

import java.util.*;

public class Solution {
    public static int minStoneSum(int[] piles, int k) {
        /** You are given a 0-indexed integer array piles, where piles[i] represents the number of stones in the ith pile, and an integer k. You should apply the following operation exactly k times:
         * Choose any piles[i] and remove floor(piles[i] / 2) stones from it.
         * Notice that you can apply the operation on the same pile more than once.
         * Return the minimum possible total number of stones remaining after applying the k operations.
         * floor(x) is the greatest integer that is smaller than or equal to x (i.e., rounds x down).
         */
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

    }