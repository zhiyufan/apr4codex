package com.codex;

import java.util.*;

public class Solution {
    /**
     * Given two arrays A and B of length N, determine if there is a way to make A equal to B by reversing any subarrays 
     * from array B any number of times.
     * Signature : bool areTheyEqual(int[] arr_a, int[] arr_b)
     * Example :
     * A = [1, 2, 3, 4]
     * B = [1, 4, 3, 2]
     * output : true
     * Thanks for the help!
     */
    public static boolean areTheyEqual(int[] arr_a, int[] arr_b) {
        if (arr_a.length != arr_b.length) {
            return false;
        }
        for (int i = 0; i < arr_a.length; i++) {
            if (arr_a[i] != arr_b[arr_b.length - 1 - i]) {
                return false;
            }
        }
        return true;
    }
    
    /**
     * Given two arrays of integers nums and index. Your task is to create target array under the following rules:
     * Initially target array is empty.
     * From left to right read nums[i] and index[i], insert at index index[i] the value nums[i] in target array.
     * Repeat the previous step until there are no elements to read in nums and index.
     * Return the target array.
     * It is guaranteed that the insertion operations will be valid.
     * Signature : Vector<Integer> createTargetArray(Vector<Integer> nums, Vector<Integer> index)
     * Example :
     * nums={0,1,2,3,4}, index={0,1,2,2,1}
     * Output={0,4,1,3,2}
     */
    public static Vector<Integer> createTargetArray(Vector<Integer> nums, Vector<Integer> index) {
        Vector<Integer> ans = new Vector<>();
        for (int i = 0; i < index.size(); i++) {
            ans.add(index.get(i),nums.get(i));
        }
        return ans;
    }   
    
    /**
     * Given two arrays of integers nums and index. Your task is to create target array under the following rules:
     * Initially target array is empty.
     * From left to right read nums[i] and index[i], insert at index index[i] the value nums[i] in target array.
     * Repeat the previous step until there are no elements to read in nums and index.
     * Return the target array.
     * It is guaranteed that the insertion operations will be valid.
     * Signature : Vector<Integer> createTargetArray(Vector<Integer> nums, Vector<Integer> index)
     * Example :
     * nums={0,1,2,3,4}, index={0,1,2,2,1}
     * Output={0,4,1,3,2}
     */
    public static Vector<Integer> createTargetArray(Vector<Integer> nums, Vector<Integer> index) {
        Vector<Integer> ans = new Vector<>();
        for (int i = 0; i < index.size(); i++) {
            ans.add(index.get(i),nums.get(i));
        }
        return ans;
    }   
    
    /**
     *  Given two arrays A and B of length N, determine if there is a way to make A equal to B by reversing any subarrays 
     *  from array B any number of times.
     *  Signature : bool areTheyEqual(int[] arr_a, int[] arr_b)
     *  Example :
     *  A = [1, 2, 3, 4]
     *  B = [1, 4, 3, 2]
     *  output : true
     *  Thanks for the help!
     */
    public static boolean areTheyEqual(int[] arr_a, int[] arr_b) {
        if (arr_a.length != arr_b.length) {
            return false;
        }
        for (int i = 0; i < arr_a.length; i++) {
            if (arr_a[i] != arr_b[arr_b.length - 1 - i]) {
                return false;
            }
        }
        return true;
    }
    
    /**
     * Given two arrays A and B of length N, determine if there is a way to make A equal to B by reversing any subarrays 
     * from array B any number of times.
     * Signature : bool areTheyEqual(int[] arr_a, int[] arr_b)
     * Example :
     * A = [1, 2, 3, 4]
     * B = [1, 4, 3, 2]
     * output : true
     * Thanks for the help!
     */
    public static boolean areTheyEqual(int[] arr_a, int[] arr_b) {
        if (arr_a.length != arr_b.length) {
            return false;
        }
        for (int i = 0; i < arr_a.length; i++) {
            if (arr_a[i] != arr_b[arr_b.length - 1 - i]) {
                return false;
            }
        }
        return true;
    }
    
    /**
     * Given two arrays of integers nums and index. Your task is to create target array under the following rules:
     * Initially target array is empty.
     * From left to right read nums[i] and index[i], insert at index index[i] the value nums[i] in target array.
     * Repeat the previous step until there are no elements to read in nums and index.
     * Return the target array.
     * It is guaranteed that the insertion operations will be valid.
     * Signature : Vector<Integer> createTargetArray(Vector<Integer> nums, Vector<Integer> index)
     * Example :
     * nums={0,1,2,3,4}, index={0,1,2,2,1}
     * Output={0,4,1,3,2}
     */
    public static Vector<Integer> createTargetArray(Vector<Integer> nums, Vector<Integer> index) {
        Vector<Integer> ans = new Vector<>();
        for (int i = 0; i < index.size(); i++) {
            ans.add(index.get(i),nums.get(i));
        }
        return ans;
    }
    
    /**
     * Given two arrays of integers nums and index. Your task is to create target array under the following rules:
     * Initially target array is empty.
     * From left to right read nums[i] and index[i], insert at index index[i] the value nums[i] in target array.
     * Repeat the previous step until there are no elements to read in nums and index.
     * Return the target array.
     * It is guaranteed that the insertion operations will be valid.
     * Signature : Vector<Integer> createTargetArray(Vector<Integer> nums, Vector<Integer> index)
     * Example :
     * nums={0,1,2,3,4}, index={0,1,2,2,1}
     * Output={0,4,1,3,2}
     */
    public static Vector<Integer> createTargetArray(Vector<Integer> nums, Vector<Integer> index) {
        Vector<Integer> ans = new Vector<>();
        for (int i = 0; i < index.size(); i++) {
            ans.add(index.get(i),nums.get(i));
        }
        return ans;
    }
    
    public static List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        
        List<List<Integer>> ans = new ArrayList<>();
        Set<Integer> set1 = new HashSet<>();
        Set<Integer> set2 = new HashSet<>();
        for (int n : nums1) {
            set1.add(n);
        }
        for (int n : nums2) {
            set2.add(n);
        }
        for (int n : nums1) {
            if (!set2.contains(n)) {
                set2.add(n);
            } else {
                set2.remove(n);
            }
        }
        for (int n : nums2) {
            if (!set1.contains(n)) {
                set1.add(n);
            } else {
                set1.remove(n);
            }
        }
        ans.add(new ArrayList<>(set1));
        ans.add(new ArrayList<>(set2));
        return ans;
    }

    /**
    * 
    */
   public static void main(String[] args) {
       System.out.println();
   }
}