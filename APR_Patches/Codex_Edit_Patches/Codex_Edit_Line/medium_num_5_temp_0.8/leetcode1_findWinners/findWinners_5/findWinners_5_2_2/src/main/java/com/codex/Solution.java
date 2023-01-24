package com.codex;

import java.util.*;

public class Solution {
    public static List<List<Integer>> findWinners(int[][] matches) {
        

        List<List<Integer>> res = new ArrayList<>();
        HashMap<Integer, Integer> hashMap = new HashMap<>();
        for (int[] match : matches) {
            hashMap.put(match[0], hashMap.getOrDefault(match[0], 0) + 1);
            hashMap.put(match[1], hashMap.getOrDefault(match[1], 0) + 1);
        }

        List<Integer> list0 = new ArrayList<>();
        List<Integer> list1 = new ArrayList<>();

        for (int key : hashMap.keySet()) {
            if (hashMap.get(key) == 0) {
                list0.add(key);
            }
            else if (hashMap.get(key) == 1) {
                list1.add(key);
            }
        }
        Collections.sort(list0);
        Collections.sort(list1);
        res.add(list0);
        res.add(list1);
        return res;
    }



        public static int findLastZero(int[] arr) {
            // Write your solution here
            if (arr == null || arr.length == 0) {
                return -1;
            }
            int l = 0, r = arr.length - 1;
            while (l < r - 1) {
                int mid = l + (r - l) / 2;
                if (arr[mid] == 0) {
                    l = mid;
                }
                else {
                    r = mid;
                }
            }
            if (arr[r] == 0) {
                return r;
            }
            else if (arr[l] == 0) {
                return l;
            }
            else {
                return -1;
            }
        }
}