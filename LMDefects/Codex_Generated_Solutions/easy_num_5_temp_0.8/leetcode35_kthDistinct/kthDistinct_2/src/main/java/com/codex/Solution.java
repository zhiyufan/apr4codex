package com.codex;

import java.util.*;

public class Solution {
    public static String kthDistinct(String[] arr, int k) {
        /** A distinct string is a string that is present only once in an array.
         * Given an array of strings arr, and an integer k, return the kth distinct string present in arr. If there are fewer than k distinct strings, return an empty string "".
         * Note that the strings are considered in the order in which they appear in the array.
         */

        Map<String, Integer> freqMap = new HashMap<>();
        for (String str : arr) {
            freqMap.put(str, freqMap.getOrDefault(str, 0) + 1);
        }
        List<Map.Entry<String, Integer>> entryList = new ArrayList<>(freqMap.entrySet());
        entryList.sort((o1, o2) -> {
            String s1 = o1.getKey();
            String s2 = o2.getKey();
            int freq1 = o1.getValue();
            int freq2 = o2.getValue();
            if (freq1 == freq2) {
                return s1.compareTo(s2);
            } else {
                return Integer.compare(freq1, freq2);
            }
        });
        int count = 0;
        for (Map.Entry<String, Integer> entry : entryList) {
            count++;
            if (count == k) {
                return entry.getKey();
            }
        }
        return}