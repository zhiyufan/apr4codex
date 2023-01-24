package com.codex;

import java.util.*;

public class Solution {
public class Main {

    public static void main(String[] args) {
        int[] nums1 = {1, 2, 5, 8, 9};
        int[] nums2 = {1, 2, 5, 9, 12};
        int[] nums3 = {2, 8, 9};

        System.out.println(twoOutOfThree(nums1, nums2, nums3));

    }

    public static List<Integer> twoOutOfThree(int[] nums1, int[] nums2, int[] nums3) 
    {

        Set<Integer> hm1 = new HashSet<Integer>();
        Set<Integer> hm2 = new HashSet<Integer>();
        List<Integer> list = new LinkedList<Integer>();

        for(int i : nums1) {
            hm1.add(i);
        }

        for(int i : nums2) {
            if(hm1.contains(i) && !list.contains(i)){
                list.add(i);
            }
        }

        for(int i : nums3) {
            if(hm1.contains(i) && !list.contains(i)){
                list.add(i);
            }
        }

       return list;
    }

}
}