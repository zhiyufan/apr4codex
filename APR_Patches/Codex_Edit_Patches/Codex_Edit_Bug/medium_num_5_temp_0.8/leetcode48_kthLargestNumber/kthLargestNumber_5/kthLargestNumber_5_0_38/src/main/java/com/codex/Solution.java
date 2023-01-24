package com.codex;

import java.util.*;

public class Solution {
        public static String kthLargestNumber(String[] nums, int k) {
            if (nums == null || nums.length == 0) {
                return null;
            }
            Arrays.sort(nums, (a, b) -> {
                int lenA = a.length();
                int lenB = b.length();
                int i = 0;
                while (i < lenA || i < lenB) {
                    if (i < lenA && i < lenB) {
                        if (a.charAt(i) < b.charAt(i)) {
                            return 1;
                        } else if (a.charAt(i) > b.charAt(i)) {
                            return -1;
                        } else {
                            i++;
                        }
                    } else {
                        if (i < lenA) {
                            if (a.charAt(i) < a.charAt(0)) {
                                return -1;
                            } else if (a.charAt(i) > a.charAt(0)) {
                                return 1;
                            } else {
                                i++;
                            }
                        } else {
                            if (b.charAt(i) < b.charAt(0)) {
                                return 1;
                            } else if (b.charAt(i) > b.charAt(0)) {
                                return -1;
                            } else {
                                i++;
                            }
                        }
                    }
                }
                return 0;
            });
            if (k > nums.length) {
                return null;
            }
            return nums[nums.length - k];
        }
}