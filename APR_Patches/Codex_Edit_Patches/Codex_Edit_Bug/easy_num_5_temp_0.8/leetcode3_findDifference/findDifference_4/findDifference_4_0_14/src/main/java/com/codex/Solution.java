package com.codex;

import java.util.*;

public class Solution {
    public static List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        
        List<List<Integer>> ans = new ArrayList<>();
        
        Set<Integer> set = new HashSet<>();
        
        for(int i: nums1)
        {
            if(!set.add(i))
                set.remove(i);
        } 
        List<Integer> a1 = new ArrayList<Integer>();
        a1.addAll(set);
        
        set.clear();
        
        for(int i: nums2)
        {
            if(!set.add(i))
                set.remove(i);
        } 
        
        List<Integer> a2 = new ArrayList<Integer>();
        a2.addAll(set);
        
        ans.add(a1);
        ans.add(a2);
        return ans;
        
    }

    public static List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer> ans = new ArrayList<>();
        Set<Integer> set = new HashSet<>();
        for (int n : nums) {
            set.add(n);
        }
        int len = nums.length;
        
        for(int i=1; i<=len; i++)
        {
            if(!set.contains(i))
            {
                set.add(i);
            }
        }
        
        ans.addAll(set);
        return ans;
        
    }

    
}