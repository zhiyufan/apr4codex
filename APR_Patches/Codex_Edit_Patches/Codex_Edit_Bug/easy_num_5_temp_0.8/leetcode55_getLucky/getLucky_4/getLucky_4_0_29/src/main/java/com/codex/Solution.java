package com.codex;

import java.util.*;

public class Solution {
    public static boolean areAnagrams(String a, String b) {
	    int[] arr = new int[26];
        for (int i = 0; i < a.length; i++) {
            arr[a.charAt(i) - 'A']++;
        }
        for (int i = 0; i < b.length; i++) {
            arr[b.charAt(i) - 'A']--;
        }
        return ans;
    }
}