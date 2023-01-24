package com.codex;

import java.util.*;

public class Solution {
 public class Main {
    public static void main(String[] args) {
        int[] arr = new int[]{0, 2, 3, 3, 5, 2, 0, 7};
        int key = 2;

        if (arr == null || arr.length == 0) {
            return;
        }

        int maxCount = Integer.MIN_VALUE;
        int maxNum = Integer.MIN_VALUE;
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] == key && arr[i + 1] != key) {
                int count = map.getOrDefault(arr[i + 1], 0) + 1;
                map.put(arr[i + 1], count);
                if (count > maxCount) {
                    maxNum = arr[i + 1];
                    maxCount = count;
                } 
            }
        }

        return maxNum;
    }
}
}