package com.codex;

import java.util.*;

public class Solution {
    public static int minimumSum(int num) {
        

        List<Integer> digits = new ArrayList<>();
        while (num > 0) {
            digits.add(num % 10);
            num /= 10;
        }
        Collections.sort(digits);
        int first = 0, second = 0;
        for (int i = digits.size() - 1; i >= 0; i--) {
            first = first * 10 + digits.get(i);
            if (i > 0)
                second = second * 10 + digits.get(i - 1);
            i--;
        }
        return first + second;
 public static List<Integer> findSubstring(String s, String[] words) {
        int wLen = words.length;
        if (wLen == 0) return Collections.emptyList();
        int wL = words[0].length();
        List<Integer> ans = new ArrayList<>();
        Map<String, Integer> wordCnt = new HashMap<>();
        for (String word : words) wordCnt.merge(word, 1, Integer::sum);
        for (int i = 0; i < wL; i++) {
            int j = i, count = 0;
            Map<String, Integer> foundWordCnt = new HashMap<>();
            while (j <= s.length() - wLen * wL) {
                boolean findWord = true;
                int k = 0;
                while (k < wLen) {
                    String word = s.substring(j + k * wL, j + (k + 1) * wL);
                    if (!wordCnt.containsKey(word)) {
                        findWord = false;
                        count = 0;
                        foundWordCnt.clear();
                        break;
                    }
                    foundWordCnt.merge(word, 1, Integer::sum);
                    if (foundWordCnt.get(word) > wordCnt.get(word)) break;
                    k++;
                    count++;
                }
                if (findWord && k == wLen) ans.add(j);
                if (count == wLen) {
                    String word = s.substring(j, j + wL);
                    foundWordCnt.put(word, foundWordCnt.get(word) - 1);
                    count--;
                }
                j += wL;
            }
        }
        return ans;
    }
    }

    
}