package com.codex;

import java.util.*;

public class Solution {
public class Difference {

List<List<Integer>> res = new ArrayList<>();
List<Integer> list1 = new ArrayList<>();
List<Integer> list2 = new ArrayList<>();
public static void main(String args[]) {
	Difference diff = new Difference();
   diff.findDifference(new int[]{1,2,3,4,5}, new int[]{2,4,6,8});
}
public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        
        Set<Integer> set1 = new HashSet<>();
        Set<Integer> set2 = new HashSet<>();
        for (int i : nums1) { set1.add(i); list1.add(i); }
        for (int i : nums2) { set2.add(i); list2.add(i); }
        for(int i : set1) if (!set2.contains(i)) list2.add(i);
        for(int i : set2) if (!set1.contains(i)) list1.add(i);
        res.add(list1);
        res.add(list2);
        return res;
    }

}

    
}