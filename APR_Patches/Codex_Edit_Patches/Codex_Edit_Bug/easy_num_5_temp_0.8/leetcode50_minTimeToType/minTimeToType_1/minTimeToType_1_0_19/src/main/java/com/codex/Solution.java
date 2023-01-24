package com.codex;

import java.util.*;

public class Solution {
    public static int minTimeToType(String word) {
        Map<Character, Integer> map = new HashMap<>();
        for (char c = 'a'; c <= 'z'; c++) {
            map.put(c, (int) (c - 'a'));
        }

        int result = 0;
        int lastIndex = 0;
        for (char c : word.toCharArray()) {
            result += Math.min(Math.abs(map.get(c) - lastIndex), 26 - Math.abs(map.get(c) - lastIndex));
            lastIndex = map.get(c);
        }
        return result;
    }









    public static int minTimeToType(String word) {
        

        int[] pos = new int[26];
        int i = 0;
        for (char ch = 'a'; ch <= 'z'; ch++) {
            pos[ch - 'a'] = i++;
        }

        int cur = 0, res = 0;
        for (char ch : word.toCharArray()) {
            res += Math.min(Math.abs(pos[ch - 'a'] - cur), 26 - Math.abs(pos[ch - 'a'] - cur));





















    public static int minTimeToType(String word) {
        

        char[] chars = "abcdefghijklmnopqrstuvwxyz".toCharArray();
        Map<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < chars.length; i++) {
            map.put(chars[i], i);
        }

        int lastIndex = 0;
        int result = 0;
        for (char c : word.toCharArray()) {
            result += Math.min(Math.abs(map.get(c) - lastIndex), 26 - Math.abs(map.get(c) - lastIndex));
            lastIndex = map.get(c);
        }
        return result;
    }
            cur = pos[ch - 'a'];
        }
        return res;
    }
}