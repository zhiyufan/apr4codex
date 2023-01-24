package com.codex;

import java.util.*;

public class Solution {
    public static List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
// brute force method
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> list1 = new ArrayList<>();
        List<Integer> list2 = new ArrayList<>();
        boolean[] arr1 = new boolean[nums1.length];
        boolean[] arr2 = new boolean[nums2.length];
        for (int i = 0; i < nums1.length; i++) {
            for (int j = 0; j < nums2.length; j++) {
                if (nums1[i] == nums2[j]) {
                    arr1[i] = true;
                    arr2[j] = true;
                    break;
                }
            }
        }
        for (int i = 0; i < nums1.length; i++) {
            if (!arr1[i]) {
                list1.add(nums1[i]);
            }
        }
        for (int i = 0; i < nums2.length; i++) {
            if (!arr2[i]) {
                list2.add(nums2[i]);
            }
        }
        result.add(list1);
        result.add(list2);
        return result;
// HashSet:
//        List<List<Integer>> result = new ArrayList<>();
//        List<Integer> list1 = new ArrayList<>();
//        List<Integer> list2 = new ArrayList<>();
//        Set<Integer> set1 = new HashSet<>();
//        Set<Integer> set2 = new HashSet<>();
//        for (int i : nums1) {
//            set1.add(i);
//        }
//        for (int i : nums2) {
//            set2.add(i);
//        }
//        for (int i : nums1) {
//            if (!set2.contains(i)) {
//                list1.add(i);
//            }
//        }
//        for (int i : nums2) {
//            if (!set1.contains(i)) {
//                list2.add(i);
//            }
//        }
//        result.add(list1);
//        result.add(list2);
//        return result;
    }

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter the first array size: ");
        int num1 = keyboard.nextInt();
        int[] array1 = new int[num1];
        for (int i = 0; i < num1; i++) {
            System.out.println("Enter the " + i + " th number: ");
            array1[i] = keyboard.nextInt();
        }
        System.out.println("Enter the second array size: ");
        int num2 = keyboard.nextInt();
        int[] array2 = new int[num2];
        for (int i = 0; i < num2; i++) {
            System.out.println("Enter the " + i + " th number: ");
            array2[i] = keyboard.nextInt();
        }
        List<List<Integer>> result = findDifference(array1, array2);
        for (List<Integer> l : result) {
            System.out.println("The number that is different from another one is: ");
            for (int i : l) {
                System.out.print(" " + i);
            }
        }
    }
}

        
}