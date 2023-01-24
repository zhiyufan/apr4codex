package com.codex;

import java.util.*;

public class Solution {
    public static boolean divideArray(int[] nums) {
        /** You are given an integer array nums consisting of 2 * n integers.
         * You need to divide nums into n pairs such that:
         * Each element belongs to exactly one pair.
         * The elements present in a pair are equal.
         * Return true if nums can be divided into n pairs, otherwise return false.
         */
        Arrays.sort(nums);
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == nums[i + 1]) {
                count++;
                i++;
            }
        }
        if (count == nums.length / 2) return true;
        return false;
    }

    /**
     * When John was a little kid he didn't have much to do. There was no internet, no Facebook, and no programs to
     * hack on. So he did the only thing he could... he evaluated the beauty of strings in a quest to discover the
     * most beautiful string in the world.
     * Given a string s, little Johnny defined the beauty of the string as the sum of the beauty of the letters in it.
     * The beauty of each letter is an integer between 1 and 26, inclusive, and no two letters have the same beauty.
     * Johnny doesn't care about whether letters are uppercase or lowercase, so that doesn't affect the beauty of a
     * letter. (Uppercase 'F' is}