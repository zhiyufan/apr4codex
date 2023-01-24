package com.codex;

import java.util.*;

public class Solution {
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Solution {
    public static void main(String[] args) {
        
        Solution obj = new Solution();
        List<List<Integer>> res = obj.findDifference(new int[] {1, 2, 3}, new int[] {1, 2, 3});
        for (List<Integer> l : res) {
            System.out.println(l);
        }
    }
    
    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
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
                set1.remove(n);
            } else {               
                set2.remove(n);   
            }
        }
        ans.add(new ArrayList<>(set1));
        ans.add(new ArrayList<>(set2));
        return ans;
    }

    
}