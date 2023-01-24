package com.codex;

import java.util.*;

public class Solution {


    
    public int minCut(String s) {
        if (s == null || s.length() == 0) return 0;
        char[] carr = s.toCharArray();
        int len = carr.length;
        int[] dp = new int[len + 1];
        for (int i = 0; i <= len; i++) { // dp[i] is min cut for s.substring(0, i)
            dp[i] = i - 1;
        }
        
        for (int i = 0; i < len; i++) {
            for (int j = 0; i - j >= 0 && i + j < len && carr[i - j] == carr[i + j]; j++) {
                dp[i + j + 1] = Math.min(dp[i + j + 1], 1 + dp[i - j]);
            }
            for (int j = 1; i - j + 1 >= 0 && i + j < len && carr[i - j + 1] == carr[i + j]; j++) {
                dp[i + j + 1] = Math.min(dp[i + j + 1], 1 + dp[i - j + 1]);
            }
        }
        return dp[len];
    }
    
    
    
    public int lengthOfLongestSubstring(String s) {
        if (s == null || s.length() == 0) return 0;
        char[] carr = s.toCharArray();
        int len = carr.length;
        int[] idx = new int[256];
        Arrays.fill(idx, -1);

        int res = 0;
        for (int i = 0, j = 0; j < len; j++) {
            // i = Math.max(idx[carr[j]] + 1, i);
            if (idx[carr[j]] != -1) i = Math.max(idx[carr[j]], i);
            res = Math.max(j - i + 1, res);
            idx[carr[j]] = j + 1;
        }
        return res;
    }


class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> res = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            if (i > 0 && nums[i] == nums[i - 1]) continue;
            int target = -nums[i];
            int lo = i + 1;
            int hi = nums.length - 1;
            while (lo < hi) {
                if (nums[lo] + nums[hi] == target) {
                    res.add(Arrays.asList(nums[i], nums[lo], nums[hi]));
                    lo++;
                    hi--;
                    while (lo < hi && nums[lo] == nums[lo - 1]) lo++;
                    while (lo < hi && nums[hi] == nums[hi + 1]) hi--;
                } else if (nums[lo] + nums[hi] < target) {
                    lo++;
                } else {
                    hi--;
                }
            }
        }
        return res;
    }
}
    public static int nearestExit(char[][] maze, int[] entrance) {
        
        Queue<int[]> queue = new LinkedList<>();
        queue.offer(entrance);
        boolean[][] visited = new boolean[maze.length][maze[0].length];
        visited[entrance[0]][entrance[1]] = true;
        int level = 0;

        while (!queue.isEmpty()) {
            int size = queue.size();
            while (size-- > 0) {
                int[] cur = queue.poll();
                int r = cur[0];
                int c = cur[1];

                if (r == 0 || c == 0 || r == maze.length - 1 || c == maze[0].length - 1) {
                    return level;
                }

                for (int[] d : new int[][]{{-1, 0}, {1, 0}, {0, -1}, {0, 1}}) {
                    int i = r, j = c;
                    while (i + d[0] >= 0 && j + d[1] >= 0 && i + d[0] < maze.length && j + d[1] < maze[0].length && maze[i + d[0]][j + d[1]] != '+') {
                        i += d[0];
                        j += d[1];
                    }
                    if (!visited[i][j]) {
                        queue.offer(new int[]{i, j});
                        visited[i][j] = true;
                    }
                }
            }
            level++;
        }
        return -1;
    }

    
}