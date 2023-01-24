package com.codex;

import java.util.*;

public class Solution {
    public static String kthDistinct(String[] arr, int k) {
        /** A distinct string is a string that is present only once in an array.
         * Given an array of strings arr, and an integer k, return the kth distinct string present in arr. If there are fewer than k distinct strings, return an empty string "".
         * Note that the strings are considered in the order in which they appear in the array.
         */
        HashMap<String, Integer> freq = new HashMap<>();
        for (String s: arr) {
            freq.put(s, freq.containsKey(s) ? freq.get(s) + 1 : 1);
        }
        ArrayList<String> distinct = new ArrayList<>();
        for (String s: freq.keySet()) {
            if (freq.get(s) == 1) {
                distinct.add(s);
            }
        }
        if (distinct.size() < k) {
            return "";
        }
        Collections.sort(distinct);
        return distinct.get(k - 1);
    }

    }