package com.codex;

import java.util.*;

public class Solution {
    public static String kthDistinct(String[] arr, int k) {
        /** A distinct string is a string that is present only once in an array.
         * Given an array of strings arr, and an integer k, return the kth distinct string present in arr. If there are fewer than k distinct strings, return an empty string "".
         * Note that the strings are considered in the order in which they appear in the array.
         */

        Set<String> set = new HashSet<>();

        for (String str : arr) {
            set.add(str);
        }

        if (k > set.size()) return "";

        int count = 0;
        for (String str : arr) {
            if (!set.contains(str)) continue;
            count++;
            if (count == k) return str;
            set.remove(str);
        }

        return "";
    }

    }