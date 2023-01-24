package com.codex;

import java.util.*;

public class Solution {
    public static long interchangeableRectangles(int[][] rectangles) {
        
        HashMap<Double, Long> map = new HashMap<>();
        for (int i = 0; i < rectangles.length; i++){
            for (int j = 0; j < rectangles[0].length; j++){
                if (rectangles[i][0] < rectangles[i][1]){
                    int temp = rectangles[i][0];
                    rectangles[i][0] = rectangles[i][1];
                    rectangles[i][1] = temp;
                }
                Double ratio = (double)rectangles[i][0] / rectangles[i][1];
                map.put(ratio, map.getOrDefault(ratio, 0L) + 1);
            }
        }
        long res = 0;
        for (long l : map.values()){
            res += l * (l - 1) / 2;
        }
        return res;
    }
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int n = nums1.length + nums2.length;
        if ((n & 1) == 1) {
            return findRank(nums1, nums2, n / 2 + 1);
        } else {
            return (findRank(nums1, nums2, n / 2) + findRank(nums1, nums2, n / 2 + 1)) / 2;
        }
    }
    public double findRank(int[] nums1, int[] nums2, int rank) {
        int i = 0, j = 0;
        while(rank > 1 && (i < nums1.length || j < nums2.length)) {
            if (i >= nums1.length) {
                j ++;
            } else if (j >= nums2.length) {
                i ++;
            } else if (nums1[i] <= nums2[j]) {
                i ++;
            } else {
                j ++;
            }
            rank --;
        }
        if (i >= nums1.length) {
            return nums2[j];
        }
        if (j >= nums2.length) {
            return nums1[i];
        }
        return Math.min(nums1[i], nums2[j]);
    }
    //https://www.youtube.com/watch?v=LPFhl65R7ww
}