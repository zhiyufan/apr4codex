package com.codex;

import java.util.*;

public class Solution {
public static List<Integer> findPermutations(String str) {
        if (str == null) throw new IllegalArgumentException("str cannot be null");
        List<Integer> list = new ArrayList<>();
        int[] count = new int[26];
        for (char c : str.toCharArray()) {
            if (c < 'A' || c > 'Z') throw new IllegalArgumentException("str can only have letters only");
            count[c-'A']++;
        }
        findPermutations(list, "", new StringBuilder(), count, 0);
        return list;
    }

    private static void findPermutations(List<Integer> list, String str, StringBuilder sb, int[] count, int level) {
        if (level == sb.length()) {
            list.add(Integer.parseInt(str));
            return;
        }
        for (int i = 0; i < count.length; i++) {
            if (count[i] <= 0) continue;
            count[i]--;
            sb.append((char)(i+'A'));
            findPermutations(list, str+i, sb, count, level+1);
            count[i]++;
            sb.deleteCharAt(sb.length()-1);
        }
    }

    
}