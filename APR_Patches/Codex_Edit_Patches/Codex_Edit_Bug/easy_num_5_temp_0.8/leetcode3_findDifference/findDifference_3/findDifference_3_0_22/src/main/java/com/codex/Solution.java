package com.codex;

import java.util.*;

public class Solution {
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class HelloWorld{
     public static void main(String []args){
        System.out.println("Hello World");
        int[] firstArray = {4,7,9,7,6,7,};
        int[] secondArray = {5,0,0,6,1,6,3,2,5,7};
        List<List<Integer>> result = findDifference(firstArray,secondArray);
        for(int i = 0; i<result.size();i++) {
            for (int j=0; j<result.get(i).size();j++) {
                System.out.print(result.get(i).get(j) + " ");
            }
            System.out.println();
        }
     }
     public static List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> list1 = new ArrayList<>();
        List<Integer> list2 = new ArrayList<>();
        Set<Integer> set1 = new HashSet<>();
        Set<Integer> set2 = new HashSet<>();
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
}