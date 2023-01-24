package com.codex;

import java.util.*;

public class Solution {
	public int findDifference(String s, String t) {
        int[] letters = new int[26];
        for(int i = 0; i < s.length(); i++)
            letters[s.charAt(i) - 'a']++;
        for(int j = 0; j < t.length(); j++)
            letters[t.charAt(j) - 'a']--;
        for(int i = 0; i < letters.length; i++)
            if(letters[i] != 0)
                return i + 'a';
        return 0;
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