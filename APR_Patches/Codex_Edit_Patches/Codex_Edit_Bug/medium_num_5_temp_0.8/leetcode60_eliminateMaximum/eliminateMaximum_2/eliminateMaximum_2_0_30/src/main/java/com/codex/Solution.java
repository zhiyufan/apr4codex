package com.codex;

import java.util.*;

public class Solution {
public static List<String> wordBreak(String s, List<String> wordDict) {
    Set<String> set = new HashSet<>(wordDict);
    HashMap<Integer, List<String>> memo = new HashMap<>();
    return helper(s, 0, memo, set);
}

public static List<String> helper(String s, int start, HashMap<Integer, List<String>> memo, Set<String> set) {
    if (memo.containsKey(start)) {
        return memo.get(start);
    }

    List<String> list = new ArrayList<>();
    if (start == s.length()) {
        list.add("");
        return list;
    }

    for (int i = start + 1; i <= s.length(); i++) {
        String substring = s.substring(start, i);
        if (set.contains(substring)) {
            List<String> subList = helper(s, i, memo, set);
            for (String str : subList) {
                list.add(substring + (str.isEmpty()? "" : " ") + str);
            }
        }
    }
    memo.put(start, list);
    return list;
}
}