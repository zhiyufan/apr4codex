package com.codex;

import java.util.*;

public class Solution {

    class Result {
        int min, max;
        
        public Result(int min, int max) {
            this.min = min;
            this.max = max;
        }
    }

    public static Result findMinMax(int[] arr) {
        int min, max;
        if (arr.length <= 1) {
            min = arr[0];
            max = arr[0];
        } else {
            if (arr[0] < arr[1]) {
                min = arr[0];
                max = arr[1];
            } else {
                min = arr[1];
                max = arr[0];
            }
        }
        int i = 0;
        while (i < arr.length - 2) {
            if (arr[i] < arr[i + 1]) {
                if (arr[i + 1] > max) {
                    max = arr[i + 1];
                }
                if (arr[i] < min) {
                    min = arr[i];
                }
            } else {
                if (arr[i] > max) {
                    max = arr[i];
                }
                if (arr[i + 1] < min) {
                    min = arr[i + 1];
                }
            }
            i += 2;
        }
        return new Result(min, max);
    }

    public static List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        
        Map<Integer, Integer> map = new HashMap<>();
        for (int n1 : nums1) {
            map.put(n1, 1);
        }
        for (int n2 : nums2) {
            if (map.containsKey(n2)) {
                map.remove(n2);
            } else {
                map.put(n2, 1);
            }
        }
        List<List<Integer>> result = new ArrayList<>();
        result.add(new ArrayList<>());
        result.add(new ArrayList<>());
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (entry.getValue() == 1) {
                result.get(0).add(entry.getKey());
            } else {
                result.get(1).add(entry.getKey());
            }
        }
        return result;
    }
}