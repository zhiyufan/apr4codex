package com.codex;

import java.util.*;

public class Solution {
package main;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.LinkedList;
import java.util.Set;

public class Main {

    public static List<Integer> twoOutOfThree(int[] nums1, int[] nums2,
                                              int[] nums3) {

        Set<Integer> hm = new HashSet<>();
        for(int n: nums1){
            hm.add(n);
        }

        Set<Integer> hs = new HashSet<>();
        for(int n: nums2){
            if(hm.contains(n)){
                hs.add(n);
                continue;
            }
        }

        hm.addAll(hs);

        hs.clear();
        for(int n: nums3){
            if(hm.contains(n)){
                hs.add(n);
            }
        }

        hm.clear();
        hm.addAll(hs);
        List<Integer> list = new LinkedList<>();
        list.addAll(hm);
        return list;
    }

    public static void main(String args[]){
        int[] nums1 = new int[]{1,2,2,2,2,2,2};
        int[] nums2 = new int[]{2,2,2,2,2,2};
        int[] nums3 = new int[]{2,2,2,2,2,2};

        List<Integer> list = twoOutOfThree(nums1, nums2, nums3);
        System.out.println(Arrays.toString(list.toArray()));
    }

}




        Set<Integer> hm1 = new HashSet<>();
        List<Integer> list1 = new LinkedList<>();
        for(int n : nums1){
            if(hm1.contains(n)){
                hm1.remove(n);
                list1.add(n);
            } else {
                hm1.add(n);
            }
        }

        Set<Integer> hm2 = new HashSet<>();
        List<Integer> list2 = new LinkedList<>();
        for(int n : nums2){
            if(hm2.contains(n)){
                hm2.remove(n);
                list.add(n);
            }

            if(hm1.contains(n)){
                list2.add(n);
            }

            if(list1.contains(n) && !list2.contains(n)){
                list2.add(n);
            }

            if(list2.contains(n) && !list1.contains(n)){
                list1.add(n);
            }
        }

        Set<Integer> hm3 = new HashSet<>();
        List<Integer> list3 = new LinkedList<>();
        for(int n : nums3){
            if(hm3.contains(n)){
                hm3.remove(n);
                list3.add(n);
            } else {
                hm3.add(n);
            }
        }

        for(int n : nums1){
            if(hm3.contains(n)){
                list3.add(n);
            }

            if(list1.contains(n) && !list3.contains(n)){
                list3.add(n);
            }

            if(list2.contains(n) && !list3.contains(n)){
                list3.add(n);
            }
        }

        for(int n : nums2){
            if(hm3.contains(n)){
                list3.add(n);
            }

            if(list2.contains(n) && !list3.contains(n)){
                list3.add(n);
            }

            if(list1.contains(n) && !list3.contains(n)){
                list.add(n);
            } else {
                hm2.add(n);
            }
        }

        for(int n : nums3){
            if(hm3.contains(n)){
                list3.add(n);
            }
            if(list1.contains(n) && !list3.contains(n)){
                list.add(n);
            }
            if(list2.contains(n) && !list3.contains(n)){
                list3.add(n);
            }
        }

        System.out.println("list1");
        System.out.println(Arrays.toString(list1.toArray()));
        System.out.println("list2");
        System.out.println(Arrays.toString(list2.toArray()));
        System.out.println("list3");
        System.out.println(Arrays.toString(list3.toArray()));
    }

    
}