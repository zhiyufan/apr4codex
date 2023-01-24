package com.codex;

import java.util.*;

public class Solution {
class Solution {
    public List<List<Integer>> pacificAtlantic(int[][] matrix) {
        List<List<Integer>> result = new ArrayList<List<Integer>>();
        if (matrix == null || matrix.length == 0) return result;
        int m = matrix.length;
        int n = matrix[0].length;
        boolean[][] pacific = new boolean[m][n];
        boolean[][] atlantic = new boolean[m][n];
        for (int i = 0; i < m; i++) {
            flow(matrix, i, 0, pacific, Integer.MIN_VALUE);
            flow(matrix, i, n - 1, atlantic, Integer.MIN_VALUE);
        }
        for (int i = 0; i < n; i++) {
            flow(matrix, 0, i, pacific, Integer.MIN_VALUE);
            flow(matrix, m - 1, i, atlantic, Integer.MIN_VALUE);
        }
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (pacific[i][j] && atlantic[i][j]) {
                    List<Integer> list = new ArrayList<>();
                    list.add(i);
                    list.add(j);
                    result.add(list);
                }
            }
        }
        return result;
    }
    private void flow(int[][] matrix, int i, int j, boolean[][] water, int height) {
        if (i < 0 || i >= matrix.length || j < 0 || j >= matrix[0].length || water[i][j] || matrix[i][j] < height) {
            return;
        }
        water[i][j] = true;
        int m = matrix.length;
        int n = matrix[0].length;
        flow(matrix, i - 1, j, water, matrix[i][j]);
        flow(matrix, i + 1, j, water, matrix[i][j]);
        flow(matrix, i, j - 1, water, matrix[i][j]);
        flow(matrix, i, j + 1, water, matrix[i][j]);
    }
}

class Solution {
    public boolean canPartition(int[] nums) {
        if (nums == null || nums.length < 2) return false;
        int sum = 0;
        for (int num : nums) {
            sum += num;
        }
        if ((sum & 1) == 1) return false;
        int n = nums.length;
        int s = sum / 2;
        boolean[] dp = new boolean[s + 1];
        dp[0] = true;
        for (int num : nums) {
            for (int i = s; i >= num; i--) {
                dp[i] = dp[i] || dp[i - num];
            }
        }
        return dp[s];
    }
}
   public List<Integer> findMinHeightTrees(int n, int[][] edges) {
        if (n == 1) return Collections.singletonList(0);

        List<Set<Integer>> adj = new ArrayList<>(n);
        for (int i = 0; i < n; ++i) adj.add(new HashSet<>());
        for (int[] edge : edges) {
            adj.get(edge[0]).add(edge[1]);
            adj.get(edge[1]).add(edge[0]);
        }

        List<Integer> leaves = new ArrayList<>();
        for (int i = 0; i < n; ++i)
            if (adj.get(i).size() == 1) leaves.add(i);

        while (n > 2) {
            n -= leaves.size();
            List<Integer> newLeaves = new ArrayList<>();
            for (int i : leaves) {
                int j = adj.get(i).iterator().next();
                adj.get(j).remove(i);
                if (adj.get(j).size() == 1) newLeaves.add(j);
            }
            leaves = newLeaves;
        }
        return leaves;
    }

    public int findTargetSumWays(int[] nums, int S) {
        int sum = 0; 
        for(int n: nums)
            sum+=n;
        return sum < S || (S + sum) % 2 > 0 ? 0 : helper(nums, (S + sum) >>> 1); 
    }   

    public int helper(int[] nums, int s) {
        int[] dp = new int[s + 1]; 
        dp[0] = 1;
        for(int n : nums)
            for(int i = s; i >= n; i--)
                dp[i] += dp[i - n]; 
        return dp[s];
    }
    
    public int calculateMinimumHP(int[][] dungeon) {
        if (dungeon == null || dungeon.length == 0 || dungeon[0].length == 0) return 0;
        
        int m = dungeon.length;
        int n = dungeon[0].length;
        
        int[][] health = new int[m][n];

        health[m - 1][n - 1] = Math.max(1 - dungeon[m - 1][n - 1], 1);

        for (int i = m - 2; i >= 0; i--) {            
            health[i][n - 1] = Math.max(health[i + 1][n - 1] - dungeon[i][n - 1], 1);
        }

        for (int j = n - 2; j >= 0; j--) {
            health[m - 1][j] = Math.max(health[m - 1][j + 1] - dungeon[m - 1][j], 1);
        }

        for (int i = m - 2; i >= 0; i--) {
            for (int j = n - 2; j >= 0; j--) {
                int down = Math.max(health[i + 1][j] - dungeon[i][j], 1);
                int right = Math.max(health[i][j + 1] - dungeon[i][j], 1);
                health[i][j] = Math.min(right, down);
            }
        }

        return health[0][0];
    }

    public boolean canJump(int[] nums) {
        int lastPos = nums.length - 1;
        for (int i = nums.length - 1; i >= 0; i--) {
            if (i + nums[i] >= lastPos) {
                lastPos = i;
            } else {
                return false;
            }
        }
        return true;
    }

}
}