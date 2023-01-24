package com.codex;

import java.util.*;

public class Solution {
    
public class prob1 {
    
    public static void main(String[] args){
        
        int[] nums1 = {11,12,13,14,15,16};
        int[] nums2 = {11,12,13,14,15};
        
        List<List<Integer>> result = findDifference(nums1,nums2);
        
        for(List<Integer> e : result){
            System.out.println(e);
        }
        
    }

    public static List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        
        for(int i: nums1){
            if(i%2 != 0){
                System.out.println("Odd number found in nums1: " + i);
                return null;
            }
        }
        
        for(int i: nums2){
            if(i%2 != 0){
                System.out.println("Odd number found in nums2: " + i);
                return null;
            }
        }
        
        List<List<Integer>> result = new ArrayList<>();

        List<Integer> l1 = new ArrayList<>();
        Set<Integer> set1 = new HashSet<>();

        for (int i : nums1) {
            l1.add(i);
        }

        List<Integer> l2 = new ArrayList<>();
        for (int i : nums2) {
            if (!l1.contains(i)) {
                l2.add(i);
            }
        }

        List<Integer> l3 = new ArrayList<>();
        for (int i = 0; i < l2.size(); i++) {
            if (!l3.contains(l2.get(i))) {
                l3.add(l2.get(i));
            }
        }

        l1.removeAll(l3);

        result.add(l1);
        result.add(l3);

        return result;
    }
}





    public static Set<Integer> findDifference(int[] nums1, int[] nums2) {
        
        Set<Integer> s1 = new HashSet<>();
        Set<Integer> s2 = new HashSet<>();

        for (int i : nums1) {
            s1.add(i);
        }
        for (int i : nums2) {
            if (!s1.contains(i)) {
                s2.add(i);
            }
        }

        s1.removeAll(s2);
        return s1;
    }








public class prob1 {
    
    public static void main(String[] args){
        
        int[] nums1 = {11,12,13,14,15,16};
        int[] nums2 = {11,12,13,14,15};
        
        List<List<Integer>> result = findDifference(nums1,nums2);
        
        for(List<Integer> e : result){
            System.out.println(e);
        }
        
    }

    public static List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        
        for(int i: nums1){
            if(i%2 != 0){
                System.out.println("Odd number found in nums1: " + i);
                return null;
            }
        }
        result.add(list1);
        result.add(list2);
        return result;
    }
}