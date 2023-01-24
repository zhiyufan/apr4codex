package com.codex;

import java.util.*;

public class Solution {
    public static int nearestExit(char[][] maze, int[] entrance) {
        
        if (maze == null || maze[0] == null || maze.length == 0 || maze[0].length == 0) {
            return 0;
        }
        int m = maze.length;
        int n = maze[0].length;
        int[][] dist = new int[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                dist[i][j] = Integer.MAX_VALUE;
            }
        }
        dist[entrance[0]][entrance[1]] = 0;
        int[][] dirs = {{1, 0}, {-1, 0}, {0, 1}, {0, -1}};
        Queue<int[]> queue = new LinkedList<>();
        queue.offer(entrance);
        while (!queue.isEmpty()) {
            int[] cur = queue.poll();
            int x = cur[0];
            int y = cur[1];
            for (int[] dir : dirs) {
                int xx = x + dir[0];
                int yy = y + dir[1];
                int count = 0;
                while (xx >= 0 && xx < m && yy >= 0 && yy < n && maze[xx][yy] != '+') {
                    xx += dir[0];
                    yy += dir[1];
                    count++;
                }
                if (dist[x][y] + count < dist[xx - dir[0]][yy - dir[1]]) {
                    dist[xx - dir[0]][yy - dir[1]] = dist[x][y] + count;
                    queue.offer(new int[]{xx - dir[0], yy - dir[1]});
                }
            }
        }
        int minDist = Integer.MAX_VALUE;
        for (int i = 0; i < m; i++) {
            minDist = Math.min(minDist, dist[i][0]);
            minDist = Math.min(minDist, dist[i][n - 1]);
        }
        for (int i = 0; i < n; i++) {
            minDist = Math.min(minDist, dist[0][i]);
            minDist = Math.min(minDist, dist[m - 1][i]);
        }
        return minDist == Integer.MAX_VALUE ? -1 : minDist;
    }
    public boolean nextPermutation(int[] nums) {
        
        if (nums == null || nums.length == 0) {
            return false;
        }
        int i = nums.length - 2;
        for (; i >= 0; i--) {
            if (nums[i] < nums[i + 1]) {
                break;
            }
        }
        if (i == -1) {
            Arrays.sort(nums);
            return false;
        }
        int j = nums.length - 1;
        for (; j > i; j--) {
            if (nums[j] > nums[i]) {
                break;
            }
        }
        swap(nums, i, j);
        reverse(nums, i + 1, nums.length - 1);
        return true;
    }
    
    private void reverse(int[] nums, int i, int j) {
        while (i < j) {
            swap(nums, i++, j--);
        }
    }
    
    private void swap(int[] nums, int i, int j) {
        int tmp = nums[i];
        nums[i] = nums[j];
        nums[j] = tmp;
    }
    
    public int[] twoSum(int[] nums, int target) {
        
        if (nums == null || nums.length == 0) {
            return null;
        }
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int other = target - nums[i];
            if (map.containsKey(other)) {
                return new int[]{map.get(other), i};
            }
            map.put(nums[i], i);
        }
        return null;
    }

    public String longestPalindrome(String s) {
        
        if (s == null || s.length() == 0) {
            return "";
        }
        int len = s.length();
        boolean[][] dp = new boolean[len][len];
        int max = 0;
        int i = 0;
        int j = 0;
        for (int k = 0; k < len; k++) {
            for (int l = 0; l + k < len; l++) {
                int r = l + k;
                if (l == r) {
                    dp[l][r] = true;
                } else if (l + 1 == r) {
                    dp[l][r] = s.charAt(l) == s.charAt(r);
                } else {
                    dp[l][r] = dp[l + 1][r - 1] && s.charAt(l) == s.charAt(r);
                }
                if (dp[l][r] && max < r - l + 1) {
                    max = r - l + 1;
                    i = l;
                    j = r;
                }
            }
        }
        return s.substring(i, j + 1);
    }
    
    public List<List<Integer>> threeSum(int[] nums) {
        
        List<List<Integer>> res = new ArrayList<>();
        if (nums == null || nums.length == 0) {
            return res;
        }
        Arrays.sort(nums);
        for (int i = 0; i < nums.length; i++) {
            if (i > 0 && nums[i] == nums[i - 1]) {
                continue;
            }
            int j = i + 1;
            int k = nums.length - 1;
            while (j < k) {
                if (nums[i] + nums[j] + nums[k] == 0) {
                    List<Integer> list = new ArrayList<>();
                    list.add(nums[i]);
                    list.add(nums[j]);
                    list.add(nums[k]);
                    res.add(list);
                    j++;
                    while (j < nums.length && nums[j] == nums[j - 1]) {
                        j++;
                    }
                    k--;
                    while (k >= 0 && nums[k] == nums[k + 1]) {
                        k--;
                    }
                } else if (nums[i] + nums[j] + nums[k] < 0) {
                    j++;
                } else {
                    k--;
                }
            }
        }
        return res;
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}