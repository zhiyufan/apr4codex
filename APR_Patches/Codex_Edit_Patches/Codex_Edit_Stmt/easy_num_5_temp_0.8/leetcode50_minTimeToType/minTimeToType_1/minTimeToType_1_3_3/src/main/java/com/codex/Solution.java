package com.codex;

import java.util.*;

public class Solution {
    public static int minTimeToType(String word) {
        

        int[] pos = new int[26];
        int i = 0;
        for (char ch = 'a'; ch <= 'z'; ch++) {
            pos[ch - 'a'] = i++;
        }

        int cur = 0, res = 0;
        for (char ch : word.toCharArray()) {
            res += Math.min(Math.abs(pos[ch - 'a'] - cur), 26 - Math.abs(pos[ch - 'a'] - cur));



        public boolean isIsomorphic(String s, String t) {
        HashMap<Character, Character> hashMap = new HashMap<Character, Character>();
        char[] arr1 = s.toCharArray();
        char[] arr2 = t.toCharArray();
        for (int i = 0; i < s.length(); i++) {
            if (hashMap.get(arr1[i]) == null) {
                hashMap.put(arr1[i], arr2[i]);
            } else {
                if (hashMap.get(arr1[i]) != arr2[i]) {
                    return false;
                }
            }
        }
        return true;
    }
            cur = pos[ch - 'a'];
        }
        return res;
    }
}