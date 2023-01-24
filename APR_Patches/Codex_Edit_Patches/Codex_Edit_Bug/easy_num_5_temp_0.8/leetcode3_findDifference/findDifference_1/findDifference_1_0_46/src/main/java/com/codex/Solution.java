package com.codex;

import java.util.*;

public class Solution {
    public static List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        
        Set<Integer> set1 = new HashSet<>();
        Set<Integer> set2 = new HashSet<>();

        for (int num: nums1) set1.add(num);
        for (int num: nums2) set2.add(num);

        List<Integer> list1 = new ArrayList<>();
        List<Integer> list2 = new ArrayList<>();

        List<List<Integer>> res = new ArrayList<>();

        for (int num: nums1) {
            if (!set2.contains(num)) list1.add(num);
        }

        for (int num: nums2) {
            if (!set1.contains(num)) list2.add(num);
        }

        res.add(list1);
        res.add(list2);

        return res;

    }

    public static List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        List<List<Integer>> res = new ArrayList<>();
        
        for(int i = 0; i < nums1.length; i++){
            if(!map.containsKey(nums1[i])){
                map.put(nums1[i], 1);
            }
        }
        for(int i = 0; i < nums2.length; i++){
            if(!map.containsKey(nums2[i])){
                map.put(nums2[i], 1);
            }else{
                map.put(nums2[i], map.get(nums2[i]) + 1);
            }
        }
        List<Integer> temp1 = new ArrayList<Integer>();
        List<Integer> temp2 = new ArrayList<Integer>();
        for(Map.Entry<Integer, Integer> entry: map.entrySet()){
            if(entry.getValue() > 1){
                temp1.add(entry.getKey());
            }else{
                temp2.add(entry.getKey());
            }
        }
        res.add(temp1);
        res.add(temp2);
        return res;
    }
}