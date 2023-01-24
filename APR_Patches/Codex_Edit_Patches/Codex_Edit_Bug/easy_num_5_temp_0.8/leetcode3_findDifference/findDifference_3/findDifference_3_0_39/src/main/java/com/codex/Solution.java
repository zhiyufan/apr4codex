package com.codex;

import java.util.*;

public class Solution {
class Main {
    public static void main(String[] args) {
        int[] arr1 = { 1, 2, 2, 1 };
        int[] arr2 = { 2, 2 };
        List<List<Integer>> list = findDifference(arr1, arr2);
        for (List<Integer> list1 : list) {
            System.out.println(list1);
        }

    }

    public static List<List<Integer>> findDifference(int[] nums1, int[]
            nums2) {

        List<List<Integer>> result = new ArrayList<>();
        List<Integer> list1 = new ArrayList<>();
        List<Integer> list2 = new ArrayList<>();
        Map<Integer, Integer> map = new HashMap<>();
        for (int i : nums1) {
            set1.add(i);
        }
        for (int i : nums2) {
            set2.add(i);
        }
        for (int i : nums1) {
            if (!set2.contains(i)) {
                list1.add(i);
            }
        }
        for (int i : nums2) {
            if (!set1.contains(i)) {
                list2.add(i);
            }
        }
        result.add(list1);
        result.add(list2);
        return result;
    }
}