package com.codex;

import java.util.*;

public class Solution {
public class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> hm1 = new HashSet<>();
        List<Integer> list = new ArrayList<>();
        
        for(int n : nums1){
            if(!hm1.contains(n)){
                hm1.add(n);
            }
        }
        
        for(int n: nums2){
            if(hm1.contains(n) && !list.contains(n)){
                list.add(n);
            }
        }
        return list;
    }

    
}