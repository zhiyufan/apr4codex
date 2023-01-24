package com.codex;

import java.util.*;

public class Solution {
    public static int timeRequiredToBuy(int[] tickets, int k) {
        
        Queue<Integer> q = new LinkedList<Integer>();
        for (int i : tickets) {
            q.offer(i);
        }
        int cur = 0;
        while (k > 0) {
            int num = q.poll();
            if (num > 1) {
                q.offer(num - 1);
            }
            cur++;
            k--;
        }
        while (!q.isEmpty()) {
            q.poll();
            cur++;
        }
        return cur;
    }

        public static int minFallingPathSum(int[][] A) {
        int[][] dp = new int[A.length][A.length];
        for (int i = 0; i < dp.length; i++) {
            dp[0][i] = A[0][i];
        }
        for (int i = 1; i < dp.length; i++) {
            for (int j = 0; j < dp.length; j++) {
                int min = dp[i - 1][j];
                if (j > 0) {
                    min = Math.min(min, dp[i - 1][j - 1]);
                }
                if (j < dp.length - 1) {
                    min = Math.min(min, dp[i - 1][j + 1]);
                }
                dp[i][j] = min + A[i][j];
            }
        }
        int cur = Integer.MAX_VALUE;
        for (int i = 0; i < dp.length; i++) {
            cur = Math.min(cur, dp[dp.length - 1][i]);
        }
        return cur;
    }
    
    public static List<List<String>> findLadders(String beginWord, String endWord, List<String> wordList) {
        Set<String> dict = new HashSet<>(wordList);
        if (!dict.contains(endWord)) {
            return new ArrayList<>();
        }
        Set<String> cur = new HashSet<>();
        cur.add(beginWord);
        Set<String> next = new HashSet<>();
        List<List<String>> res = new ArrayList<>();
        Map<String, Set<String>> parent = new HashMap<>();
        while (!cur.isEmpty() && !cur.contains(endWord)) {
            dict.removeAll(cur);
            for (String s : cur) {
                for (int i = 0; i < s.length(); i++) {
                    for (int j = 0; j < 26; j++) {
                        String nextS = s.substring(0, i) + (char)('a' + j) + s.substring(i + 1, s.length()); //Update this string
                        if (dict.contains(nextS)) {
                            Set<String> set = parent.computeIfAbsent(nextS, x -> new HashSet<>());
                            if (set.add(s)) {
                                next.add(nextS);
                            }
                        }
                    }
                }
            }
            cur = next;
            next = new HashSet<>();
        }
        if (!cur.contains(endWord)) {
            return new ArrayList<>();
        }
        List<String> curRes = new ArrayList<>();
        curRes.add(endWord);
        addWord(res, curRes, beginWord, endWord, parent);
        return res;
    }

    public static void addWord(List<List<String>> res, List<String> curRes, String beginWord, String curWord, Map<String, Set<String>> parent) {
        if (curWord.equals(beginWord)) {
            List<String> res1 = new ArrayList<>(curRes);
            Collections.reverse(res1);
            res.add(res1);
            return;
        }
        Set<String> set = parent.get(curWord);
        for (String nextWord : set) {
            curRes.add(nextWord);
            addWord(res, curRes, beginWord, nextWord, parent);
            curRes.remove(curRes.size() - 1);
        }
    }

    public static int findKthNumber(int n, int k) {
        int cur = 1;
        k--;
        while (k > 0) {
            int step = calStep(n, cur, cur + 1);
            if (step <= k) {
                cur += 1;
                k -= step;
            } else {
                cur *= 10;
                k--;
            }
        }
        return cur;
    }
    
    private static int calStep(int n, long n1, long n2) {
        int step = 0;
        while (n1 <= n) {
            step += Math.min(n + 1, n2) - n1;
            n1 *= 10;
            n2 *= 10;
        }
        return step;
    }

    
}