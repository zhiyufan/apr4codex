package com.codex;

import java.util.*;

public class Solution {
    public static List<Integer> twoOutOfThree(int[] nums1, int[] nums2, int[] nums3) {
        
        
        Set<Integer> set1 = new HashSet<>();
        Set<Integer> set2 = new HashSet<>();
        
        for (int n: nums1) {
            set1.add(n);
        }
        for (int n: nums2) {
            if (set1.contains(n)) {
                set2.add(n);
            }
        }
        for (int n: nums3) {
            if (set1.contains(n)) {
                set2.add(n);
            }
        }
        
        return new ArrayList<>(set2);
    }
    
    
    
    
    
    
    
    public static int minCost(int[][] costs) {
        
        if (costs == null || costs.length == 0) 
            return 0;
        
        for (int i = 1; i < costs.length; i++) {
            costs[i][0] += Math.min(costs[i - 1][1], costs[i - 1][2]);
            costs[i][1] += Math.min(costs[i - 1][0], costs[i - 1][2]);
            costs[i][2] += Math.min(costs[i - 1][0], costs[i - 1][1]);
        }
        
        int n = costs.length - 1;
        
        return Math.min(Math.min(costs[n][0], costs[n][1]), costs[n][2]);
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    public static List<List<Integer>> combinationSum2(int[] num, int target) {
        
        List<List<Integer>> result = new ArrayList<>();
        
        if (num == null || num.length == 0) {
            return result;
        }
        
        Arrays.sort(num);
        dfs(num, 0, new ArrayList<Integer>(), target, result);
        return result;
    }
    
    public static void dfs(int[] candidates, int pos, List<Integer> path, int gap, List<List<Integer>> result) {
        
        if (gap == 0) {
            result.add(new ArrayList(path));
            return;
        }
        
        int prev = -1;
        for (int i = pos; i < candidates.length; i++) {
            if (candidates[i] == prev) continue;
            if (gap < candidates[i]) return;
            
            prev = candidates[i];
            path.add(candidates[i]);
            dfs(candidates, i + 1, path, gap - candidates[i], result);
            path.remove(path.size() - 1);
        }
    }
    
    
    
    
    
    
    public static boolean isPossible(int[] nums) {
        
        if (nums.length < 3) return false;
        
        int[] count = new int[nums.length];
        int[] tail = new int[nums.length];
        
        for (int n: nums) {
            count[n]++;
        }
        
        for (int i : nums) {
            if (count[i] == 0) continue;
            if (count[i] > 0 && tail[i - 1] > 0) {
                tail[i - 1]--;
                tail[i]++;
                count[i]--;
            } else if (count[i] > 0 && count[i+1] > 0 && count[i+2] > 0) {
                count[i]--;
                count[i+1]--;
                count[i+2]--;
                tail[i+2]++;
            } else {
                return false;
            }
        }
        
        return true;
    }
    
    
    
    
    
    
    
    
    public static int[] findRestaurant(String[] list1, String[] list2) {
        
        Map<String, Integer> map = new HashMap<>();
        for (int i = 0; i < list1.length; i++) {
            map.put(list1[i], i);
        }
        
        int min = Integer.MAX_VALUE;
        List<String> result = new ArrayList<>();
        
        for (int i = 0; i < list2.length; i++) {
            if (map.containsKey(list2[i])) {
                if (min > i + map.get(list2[i])) {
                    min = i + map.get(list2[i]);
                    result.clear();
                    result.add(list2[i]);
                } else if (min == i + map.get(list2[i])) {
                    result.add(list2[i]);
                }
            }
        }
        
        int[] res = new int[result.size()];
        for (int i = 0; i < res.length; i++) {
            res[i] = result.get(i);
        }
        
        return res;
    }
    
    
    
    
    
    
    
    
    
    
    
    
    public static int findShortestSubArray(int[] nums) {
        
        if (nums.length == 0) return 0;
        
        Map<Integer, List<Integer>> map = new HashMap<>();
        int degree = 0;
        
        for (int i = 0; i < nums.length; i++) {
            List<Integer> list = map.getOrDefault(nums[i], new ArrayList<Integer>());
            list.add(i);
            map.put(nums[i], list);
            degree = Math.max(degree, list.size());
        }
        
        int minLen = Integer.MAX_VALUE;
        for (Integer n : map.keySet()) {
            if (map.get(n).size() == degree) {
                minLen = Math.min(minLen, map.get(n).get(degree - 1) - map.get(n).get(0) + 1);
            }
        }
        
        return minLen;
    }
    
    
    
    
    
    
    
    public static int[][] reconstructQueue(int[][] people) {
        
        if (people == null || people.length == 0 || people[0].length == 0)
            return new int[0][0];
        
        // Pick up the tallest guy first
        // When insert the next tall guy, just need to insert him into kth position
        // repeat until all people are inserted into list
        Arrays.sort(people, new Comparator<int[]>(){
            public int compare(int[] a, int[] b) {
                return a[0] == b[0] ? a[1] - b[1] : b[0] - a[0];
            }
        });
        
        int n = people.length;
        ArrayList<int[]> tmp = new ArrayList<>();
        for (int i = 0; i < n; i++)
            tmp.add(people[i][1], new int[]{people[i][0], people[i][1]});
        
        int[][] res = new int[people.length][2];
        for (int i = 0; i < tmp.size(); i++) {
            res[i][0] = tmp.get(i)[0];
            res[i][1] = tmp.get(i)[1];
        }
        
        return res;
    }
    
    
    
    
    public static int[] topKFrequent(int[] nums, int k) {
        
        Map<Integer, Integer> map = new HashMap<>();
        for (int n : nums) {
            map.put(n, map.getOrDefault(n, 0) + 1);
        }
        
        PriorityQueue<Map.Entry<Integer, Integer>> pq = new PriorityQueue<>(
            new Comparator<Map.Entry<Integer, Integer>>() {
                public int compare(Map.Entry<Integer, Integer
}