package com.codex;

import java.util.*;

public class Solution {
    public static int minimumBuckets(String street) {
        

        int buckets = 0;
        int i = 0;
        while (i < street.length()) {
            if (street.charAt(i) == 'H') {
                buckets++;
                if (i + 1 < street.length() && street.charAt(i + 1) == 'H') {
                    return -1;
                }
                i++;
            } else {
                i++;
                if (i < street.length() && street.charAt(i) == 'H') {
                    buckets++;
                }
                i++;
            }
        }
        return buckets;
    }


    static Map<Character, Integer> createMap(String s) {
        Map<Character, Integer> map = new HashMap<>();
        for (Character c : s.toCharArray()) {
            if (!map.containsKey(c)) {
                map.put(c, 0);
            }
            map.put(c, map.get(c) + 1);
        }
        return map;
    }

    static int countSubstring(String s, String t) {
        int cnt = 0;
        if (s.length() >= t.length()) {
            Map<Character, Integer> map = createMap(t);
            for (int i = 0; i < s.length() - t.length() + 1; i++) {
                String sub = s.substring(i, i + t.length());
                Map<Character, Integer> subMap = createMap(sub);
                if (subMap.equals(map)) {
                    cnt++;
                }
            }
        }
        return cnt;
    }
    

    
}