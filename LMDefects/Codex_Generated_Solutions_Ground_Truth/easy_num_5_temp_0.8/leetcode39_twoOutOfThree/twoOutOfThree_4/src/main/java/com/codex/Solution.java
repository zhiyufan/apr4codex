package com.codex;

import java.util.*;

public class Solution {
    public static List<Integer> twoOutOfThree(int[] nums1, int[] nums2, int[] nums3) {
        /** Given three integer arrays nums1, nums2, and nums3, return a distinct array containing all the values that are present in at least two out of the three arrays. You may return the values in any order.
         */
        Set<Integer> hm1 = new HashSet<>();
        List<Integer> list = new LinkedList<>();
        for(int n : nums1){
            hm1.add(n);
        }

        Set<Integer> hm2 = new HashSet<>();
        for(int n : nums2){
            if(hm1.contains(n) && !list.contains(n)){
                list.add(n);
            }

            hm2.add(n);
        }

        for(int n : nums3){
            if(hm1.contains(n) && !list.contains(n)){
                list.add(n);
            }
            if(hm2.contains(n) && !list.contains(n)){
                list.add(n);
            }
        }
        return list;
    }

    }