package com.codex;

import java.util.*;

public class Solution {
    public static List<Integer> maxScoreIndices(int[] nums) {
        

        int max = 0;
        List<Integer> ans = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            int[] left = Arrays.copyOfRange(nums, 0, i);
            int[] right = Arrays.copyOfRange(nums, i, nums.length);
            int score = 0;
            for (int n : left) {
                if (n == 0) {
                    score++;
                }
            }
            for (int n : right) {
                if (n == 1) {
                    score++;
                }
            }
            if (score > max) {
                max = score;
                ans.clear();
                ans.add(i);
            } else if (score == max) {
                ans.add(i);
            }
        }
        return ans;
    }

    public List<Integer> killProcess(List<Integer> pid, List<Integer> ppid, int kill) {
        LinkedHashMap<Integer, List<Integer>> hMap = new LinkedHashMap<>();
        LinkedHashMap<Integer, Integer> pMap = new LinkedHashMap<>();
        List<Integer> ans = new ArrayList<>();

        int n = pid.size();
        for (int i = 0; i < n; i++) {
            hMap.putIfAbsent(ppid.get(i), new ArrayList<>());
            hMap.get(ppid.get(i)).add(pid.get(i));
            pMap.put(pid.get(i), ppid.get(i));
        }

        Queue<Integer> q = new LinkedList<>();
        q.add(kill);
        while (!q.isEmpty()) {
            int curr = q.poll();
            ans.add(curr);
            if (hMap.containsKey(curr)) {
                q.addAll(hMap.get(curr));
            }
        }
        return ans;
    }

    
    
}