package com.codex;

import java.util.*;

public class Solution {
    public static int maxDistance(int[] colors) {
        
        int[] left = new int[colors.length];
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < colors.length; i++) {
            left[i] = map.containsKey(colors[i]) ? map.get(colors[i]) : -1;
            map.put(colors[i], i);
        }

        int max = 0;
        for (int i = 0; i < colors.length; i++) {
            int distance = i - left[i];
            max = Math.max(max, distance);
        }
        return max;
    }


    


    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int[] array = new int[nums1.length];
        int i = 0;
        int j = 0;
        int index = 0;
        while (i < m && j < n) {
            if (nums1[i] < nums2[j]) {
                array[index++] = nums1[i++];
            } else {
                array[index++] = nums2[j++];
            }
        }

        while (i < m) {
            array[index++] = nums1[i++];
        }

        while (j < n) {
            array[index++] = nums2[j++];
        }

        for (int k = 0; k < array.length; k++) {
            nums1[k] = array[k];
        }
    }
}