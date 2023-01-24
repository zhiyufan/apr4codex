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


     ArrayList<List<String>> res = new ArrayList<>();
        if (beginWord == null || endWord == null) {
            return res;
        }
        Set<String> dict = new HashSet<>();
        for (String s : wordList) {
            dict.add(s);
        }
        if (!dict.contains(endWord)) {
            return res;
        }
        Map<String, List<String>> neis = new HashMap<>();
        getNeis(dict, neis);
        Map<String, Integer> step = new HashMap<>();
        
        queue.add(beginWord);
        step.put(beginWord, 0);
        while (!queue.isEmpty()) {
            String word = queue.poll();
            int curStep = step.get(word);
            if (word.equals(endWord)) {
                List<String> list = new ArrayList<>();
                list.add(word);
                dfs(word, endWord, list, step, neis);
            }
            for (String s : neis.get(word)) {
                if (!step.containsKey(s)) {
                    step.put(s, curStep + 1);
                    queue.add(s);
                }
                if (step.get(s) == curStep + 1) {
                    List<String> list = new ArrayList<>();
                    list.add(word);
                    dfs(word, s, list, step, neis);
                }
            }
        }
        return res;
    }
    
    public void getNeis(Set<String> dict, Map<String, List<String>> neis) {
        
        for (String s : dict) {
            List<String> nei = new ArrayList<>();
            for (int i = 0; i < s.length(); i++) {
                char[] array = s.toCharArray();
                for (char c = 'a'; c <= 'z'; c++) {
                    if (array[i] == c) {
                        continue;
                    }
                    array[i] = c;
                    String newString = new String(array);
                    if (dict.contains(newString)) {
                        nei.add(newString);
                    }
                }
            }
            neis.put(s, nei);
        }
    }
            cur = pos[ch - 'a'];
        }
        return res;
    }
}