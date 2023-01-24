package com.codex;

import java.util.*;

public class Solution {
public static int maxDistance(int[] colors) {

    int[] left = new int[colors.length];
    Map<Integer, Integer> map = new HashMap<>();
    for (int i = 0; i < colors.length; i++) {
        left[i] = map.containsKey(colors[i]) ? map.get(colors[i]) : -1;
        map.put(colors[i], i);
    }

    int max = 0;
    for (int i = 0; i < colors.length; i++) {
        int distance = i - left[i];
        max = Math.max(max, distance);
    }
    return max;
}

// Longest substring with not more than K repeating characters.
public static int longestSubString(String s, int k) {
    if (s.length() == 0)
        return 0;
    int[] count = new int[26];
    for (int i = 0; i < s.length(); i++) {
        count[s.charAt(i) - 'a']++;
    }

    int cur_max = 0;
    int start = 0;
    for (int i = 0; i < s.length(); i++) {
        if (count[s.charAt(i) - 'a'] < k) {
            cur_max = Math.max(cur_max, longestSubString(s.substring(start, i), k));
            start = i + 1;
        }
    }
    cur_max = Math.max(cur_max, longestSubString(s.substring(start, s.length()), k));
    return cur_max;
}

// Find the longest string with atmost k letters.
public static int findLongest(String s, int k) {
    if (s.length() == 0)
        return 0;
    int[] count = new int[26];
    for (int i = 0; i < s.length(); i++) {
        count[s.charAt(i) - 'a']++;
    }

    int cur_max = 0;
    int start = 0;
    for (int i = 0; i < s.length(); i++) {
        if (count[s.charAt(i) - 'a'] > k) {
            cur_max = Math.max(cur_max, findLongest(s.substring(start, i), k));
            start = i + 1;
        }
    }
    cur_max = Math.max(cur_max, findLongest(s.substring(start, s.length()), k));
    return cur_max;
}

// Find the number of sub string with atmost k letters.
public static int subStringWithK(String s, int k) {
    if (s.length() == 0 || k == 0)
        return 0;
    int[] count = new int[26];
    int start = 0;
    int end = 0;
    int result = 0;

    while (end < s.length()) {
        if (count[s.charAt(end++) - 'a']++ == k)
            break;
    }
    if (end == s.length())
        return 0;

    result = result + end - start + subStringWithK(s.substring(start, end), k);
    start = end;
    return result;
}

// Find the number of sub String with not more than k letters.
public static int subStringWithNotK(String s, int k) {
    if (s.length() == 0)
        return 0;
    int[] count = new int[26];
    int start = 0;
    int end = 0;
    int result = 0;

    while (end < s.length()) {
        if (count[s.charAt(end++) - 'a'] == k)
            break;
    }
    if (end == s.length())
        return 0;

    result = result + end - start + subStringWithK(s.substring(start, end), k);
    start = end;
    return result;
}

// Find the number of sub String with atmost k distinct characters
public static int subStringWithKElements(String s, int k) {
    if (s.length() == 0)
        return 0;
    int[] count = new int[26];
    int start = 0;
    int end = 0;
    int result = 0;
    int distinct = 0;

    while (end < s.length() && distinct < k) {
        if (count[s.charAt(end++) - 'a']++ == 0)
            distinct++;
    }
    if (distinct == k)
        result += s.length() - start;
    else if (end == s.length())
        return 0;
    for (int i = end; i < s.length(); i++) {

        int max = 0;
        while (end < s.length()) {
            if (count[s.charAt(end++) - 'a']++ == 0)
                distinct++;
        } 
    }

    
}