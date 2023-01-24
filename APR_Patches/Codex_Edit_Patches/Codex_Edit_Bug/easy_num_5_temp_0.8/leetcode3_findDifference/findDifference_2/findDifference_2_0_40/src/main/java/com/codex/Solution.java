package com.codex;

import java.util.*;

public class Solution {
public class Test {

    public static void main(String[] args) {

    }

    public static List<Integer> findDifference(int[] nums1, int[] nums2) {
        
        Set<Integer> s = new HashSet<Integer>();
        List<Integer> res = new ArrayList<>();
        for (int i : nums2) {
            s.add(i);
        }
        for (int i : nums1) {
            if (!s.contains(i)) res.add(i);
        }
        return res;
    }

}
}