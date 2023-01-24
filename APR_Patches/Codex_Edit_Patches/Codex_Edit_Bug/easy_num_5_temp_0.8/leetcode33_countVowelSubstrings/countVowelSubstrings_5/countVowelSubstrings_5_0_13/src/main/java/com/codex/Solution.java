package com.codex;

import java.util.*;

public class Solution {
import java.io.*;
import java.util.*;

public class Solution {

    public static int[] getCount(String word) {
        List<Integer> list = new ArrayList<>();

        int[] counts = new int[26];
        for (char c : word.toCharArray()) {
            counts[c - 'a']++;
        }

        for (int count : counts) {
            list.add(count);
        }

        Collections.sort(list);
        Collections.reverse(list);

        return list.stream().mapToInt(value -> value).toArray();
    }

    public static boolean isAnagram(String word1, String word2) {
        
        int[] counts1 = getCount(word1);
        int[] counts2 = getCount(word2);

        for (int i = 0; i < counts1.length; i++) {
            if (counts1[i] != counts2[i]) {
                return false;
            }
        }

        for (int i = 0; i < word.length(); i++) {
            if (vowels.contains(word.charAt(i))) {
                count += word.length() - i;
            }
        }

        return count;
    }

    
}