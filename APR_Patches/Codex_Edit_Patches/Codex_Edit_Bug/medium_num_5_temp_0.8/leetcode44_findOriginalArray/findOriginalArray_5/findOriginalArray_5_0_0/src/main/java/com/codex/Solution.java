package com.codex;

import java.util.*;

public class Solution {
class Solution {
    public List<String> findAndReplacePattern(String[] words, String pattern) {

        List<String> result = new ArrayList<>();
        Map<Character, Character> forward = new HashMap<>();
        Map<Character, Character> backward = new HashMap<>();
        for (String word : words) {
            forward.clear();
            backward.clear();
            int count = 0;

        for (int i = 0; i < changed.length; i++) {
            int num = changed[i];
            int count = cache.getOrDefault(num, 0);
            cache.put(num, count + 1);
        }

        int index = 0;
        for (int k : cache.keySet()) {
            int v = cache.get(k);
            if (v % 2 != 0) {
                return new int[0];
            }
            for (int i = 0; i < v / 2; i++) {
                res[index] = k;
                index++;
            }
        }
        return res;
    }

    
}