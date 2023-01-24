package com.codex;

import java.util.*;

public class Solution {
    public static String findDifferentBinaryString(String[] nums) {
        
        if (nums == null || nums.length == 0) {
            return "";
        }
        int[] row = new int[nums[0].length()];
        int[] col = new int[nums[0].length()];

        for (String num : nums) {
            for (int i = 0; i < num.length(); i++) {
                if (num.charAt(i) == '0') {
                    row[i] += 1;
                } else {
                    col[i] += 1;
                }
            }
        }

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < nums[0].length(); i++) {
            if (row[i] > col[i]) {
                sb.append('0');
            } else {
                sb.append('1');
            }
        }
        return sb.toString();
    }

    public class Solution {
        /**
         * @param numbers: Give an array numbers of n integer
         * @return: Find all unique triplets in the array which gives the sum of zero.
         */
        public List<List<Integer>> threeSum(int[] nums) {
            // write your code here
            List<List<Integer>> result = new ArrayList<>();
            if (nums == null || nums.length < 3) {
                return result;
            }
            
            Arrays.sort(nums);
            for (int i = 0; i < nums.length; i++) {
                if (nums[i] > 0) {
                    break;
                }
                if (i > 0 && nums[i] == nums[i - 1]) {
                    continue;
                }
                int target = -nums[i];
                int start = i + 1, end = nums.length - 1;
                while (start < end) {
                    if (nums[start] + nums[end] == target) {
                        List<Integer> item = new ArrayList<>();
                        item.add(nums[i]);
                        item.add(nums[start]);
                        item.add(nums[end]);
                        result.add(item);
                        start++;
                        end--;
                        while (start <= end && nums[start] == nums[start - 1]) {
                            start++;
                        }
                        while (end >= start && nums[end] == nums[end + 1]) {
                            end--;
                        }
                    } else if (nums[start] + nums[end] < target) {
                        start++;
                    } else {
                        end--;
                    }
                }
            }
            return result;
        }
    }
}