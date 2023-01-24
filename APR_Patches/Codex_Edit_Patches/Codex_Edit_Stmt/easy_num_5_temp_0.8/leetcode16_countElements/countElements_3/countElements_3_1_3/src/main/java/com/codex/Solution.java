package com.codex;

import java.util.*;

public class Solution {
    public static int countElements(int[] nums) {
        if (nums.length > 1) {

            int count = 0;
            for (int i = 0; i < nums.length; i++) {
                for (int j = 0; j < nums.length; j++) {
                    if (nums[i] < nums[j] && nums[i] + 1 == nums[j]) {
                        count++;
                    }
                }
            }
            return count;
        }else {
            return 0;
        }
    }

    public static int countElementsSorted(int[] nums) {
        Arrays.sort(nums);
        int count = 0;
        boolean exist = false;
        for (int i = 0; i < nums.length; i++) {
            if (!exist) {
                if (nums[i + 1] - nums[i] == 1) {
                    exist = true;
                    count += 1;
                }
            } else {
                exist = false;
            }
        }

//        for (int i = 0; i < nums.length; i++) {
//            for (int j = 0; j < nums.length; j++) {
//                if (nums[i] < nums[j] && nums[i] + 1 == nums[j]) {
//                    count++;
//                }
//            }
//        }
        return count;
    }

    public static int countElementsHash(int[] nums) {
        Map<Integer, Integer> presences = new HashMap();
        Arrays.sort(nums);
        for (int i = 0; i < nums.length; i++) {
            presences.putIfAbsent(nums[i], 0);
            presences.put(nums[i], presences.get(nums[i]) + 1);
        }

        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            if (presences.containsKey(nums[i] + 1)) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        int[] arr = {1, 1, 3, 3};
        System.out.println(countElementsHash(arr));
    }
}