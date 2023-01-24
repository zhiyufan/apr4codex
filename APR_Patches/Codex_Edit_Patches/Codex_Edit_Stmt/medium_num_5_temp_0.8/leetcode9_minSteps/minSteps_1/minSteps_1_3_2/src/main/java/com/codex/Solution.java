package com.codex;

import java.util.*;

public class Solution {
    public static int minSteps(String s, String t) {
        
        int res = 0;
        int[] sCount = new int[26];
        int[] tCount = new int[26];
        for (int i = 0; i < s.length(); i++) {
            sCount[s.charAt(i) - 'a']++;
            tCount[t.charAt(i) - 'a']++;
        }
        for (int i = 0; i < 26; i++) {
            res += Math.abs(sCount[i] - tCount[i]);
        }
        return res / 2;
    }

    public int[] relativeSortArray(int[] arr1, int[] arr2) {
        int[] map = new int[1001];
        int[] res = new int[arr1.length];
        for (int i = 0; i < arr1.length; i++) {
            map[arr1[i]]++;
        }
        int index = 0;
        for (int i = 0; i < arr2.length; i++) {
            while (map[arr2[i]]-- > 0) {
                res[index++] = arr2[i];
            }
        }
        for (int i = 0; i < map.length; i++) {
            while (map[i]-- > 0) {
                res[index++] = i;
            }
        }
        return res;
    }
    
    
}