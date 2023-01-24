package com.codex;

import java.util.*;

public class Solution {
package packages.utils;

import java.util.ArrayList;
import java.util.List;

public class LeetCodePractice {
    private static List<String> wordList;

    public static boolean wordBreak(String s, List<String> wordDict) {
        wordList = new ArrayList<>();
        boolean[] mem = new boolean[s.length() + 1];
        mem[0] = true;
        return wordBreakHelper(s, wordDict, mem);
    }

    public static boolean wordBreakHelper(String s, List<String> wordDict, boolean[] mem) {
        if (mem[s.length()]) {
            return true;
        }
        for (int i = 1; i <= s.length(); i++) {
            String cur = s.substring(0, i);
            if (wordDict.contains(cur) && wordBreakHelper(s.substring(i), wordDict, mem)) {
                wordList.add(cur);
                mem[s.length()] = true;
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        String s = "applepenapple";
        List<String> wordList = new ArrayList<>();
        wordList.add("apple");
        wordList.add("pen");
        System.out.println(wordBreak(s, wordList));
    }

}
}