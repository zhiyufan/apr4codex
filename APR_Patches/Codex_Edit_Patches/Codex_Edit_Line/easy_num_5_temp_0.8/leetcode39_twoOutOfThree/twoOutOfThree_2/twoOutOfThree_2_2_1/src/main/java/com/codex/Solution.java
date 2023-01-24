package com.codex;

import java.util.*;

public class Solution {
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class ThreeWay {
    public static void main(String[] args) {
        int[] nums1 = {1,2,3,4};
        int[] nums2 = {2,3,4,5};
        int[] nums3 = {3,4,5,6};
        System.out.println(twoOutOfThree(nums1, nums2, nums3));
    }

    public static List<Integer> twoOutOfThree(int[] nums1, int[] nums2, int[] nums3) {      

        List<Integer> list = new ArrayList<>();
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int n : nums1) {
            if (!map.containsKey(n)) {
                map.put(n, 1);
            } else {
                map.put(n, map.get(n) + 1);
            }
        }
        for (int n : nums2) {
            if (!map.containsKey(n)) {
                map.put(n, 1);
            } else {
                map.put(n, map.get(n) + 1);
            }
        }
        for (int n : nums3) {
            if (!map.containsKey(n)) {
                map.put(n, 1);
            } else {
                map.put(n, map.get(n) + 1);
            }
        }
        for (int n : map.keySet()) {
            if (map.get(n) > 1) {
                list.add(n);
            }
        }
        return list;
    }

    
}