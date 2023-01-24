package com.codex;

import java.util.*;

public class Solution {
    public static List<List<Integer>> findDifference(int[] arr1, int[] arr2) {
        
        List<List<Integer>> ans = new ArrayList<>();
        Map<Integer, Integer> map1 = new HashMap<>();
        for (int n : arr1) {
            int val = map1.getOrDefault(n, 0) + 1;
            map1.put(n, val);
        }
        Map<Integer, Integer> map2 = new HashMap<>();
        for (int n : arr2) {
            int val = map2.getOrDefault(n, 0) + 1;
            map2.put(n, val);
        }
        Set<Integer> set1 = new HashSet<>(map1.keySet());
        Set<Integer> set2 = new HashSet<>(map2.keySet());
        for (int n : set1) {
            if (map2.containsKey(n)) {
                int freq1 = map1.get(n);
                int freq2 = map2.get(n);
                if (freq1 != freq2) {
                    ans.add(Arrays.asList(new Integer[] {n}));
                }
            } else {
                ans.add(Arrays.asList(new Integer[] {n}));
            }
        }
        for (int n : set2) {
            if (map1.containsKey(n)) {
                int freq1 = map1.get(n);
                int freq2 = map2.get(n);
                if (freq1 != freq2) {
                    ans.add(Arrays.asList(new Integer[] {n}));
                }
            } else {
                ans.add(Arrays.asList(new Integer[] {n}));
            }
        }
        return ans;
    }

    

        public static List<List<Integer>> findDifference(int[] arr1, int[] arr2) {
        
        List<List<Integer>> ans = new ArrayList<>();
        Set<Integer> set1 = new HashSet<>();
        Set<Integer> set2 = new HashSet<>();
        for (int n : arr1) {
            set1.add(n);
        }
        for (int n : arr2) {
            set2.add(n);
        }
        for (int n : set1) {
            if (!set2.contains(n)) {
                set2.add(n);
            } else {
                set2.remove(n);
            }
        }
        for (int n : set2) {
            if (!set1.contains(n)) {
                set1.add(n);
            } else {
                set1.remove(n);
            }
        }
        ans.add(new ArrayList<>(set1));
        ans.add(new ArrayList<>(set2));
        // int[] arr1 = new int[set1.size()];
        // int c = 0;
        // for (int n : set1) {
        //     arr1[c] = n;
        //     c++;
        // }
        // int[] arr2 = new int[set2.size()];
        // c = 0;
        // for (int n : set2) {
        //     arr2[c] = n;
        //     c++;
        // }
        // ans.add(Arrays.asList(new Integer[] {arr1}));
        // ans.add(Arrays.asList(new Integer[] {arr2}));
        return ans;
    }
    }
}