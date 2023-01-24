package com.codex;

import java.util.*;

public class Solution {
    public static int[] executeInstructions(int n, int[] startPos, String s) {
        
        int[][] grid = new int[n][n];
        int[] ans = new int[s.length()];

        for (int i = 0; i < s.length(); i++) {
            char[] dir = new char[i + 1];
            for (int j = 0; j < dir.length; j++) {
                dir[j] = s.charAt(j);
            }
            int[] pos = Arrays.copyOf(startPos, startPos.length);
            boolean canMove = true;
            for (int j = 0; j < dir.length; j++) {
                int row = pos[0];
                int col = pos[1];
                if (dir[j] == 'L') {
                    if (col == 0 || grid[row][col - 1] == 1) {
                        canMove = false;
                        break;
                    } else {
                        pos[1]--;
                        grid[row][col - 1] = 1;
                    }
                } else if (dir[j] == 'R') {
                    if (col == n - 1 || grid[row][col + 1] == 1) {
                        canMove = false;
                        break;
                    } else {
                        pos[1]++;
                        grid[row][col + 1] = 1;
                    }
                } else if (dir[j] == 'U') {
                    if (row == 0 || grid[row - 1][col] == 1) {
                        canMove = false;
                        break;
                    } else {
                        pos[0]--;
                        grid[row - 1][col] = 1;
                    }

                } else if (dir[j] == 'D') {
                    if (row == n - 1 || grid[row + 1][col] == 1) {
                        canMove = false;
                        break;
                    } else {
                        pos[0]++;
                        grid[row + 1][col] = 1;
                    }
                }
            }
            if (canMove) {
                ans[i] = dir.length;
            }
        }
        return ans;
    }



    public static void countTriplets(List<Long> arr, long r) {
        Map<Long, Long> map1 = new HashMap<>();
        Map<Long, Long> map2 = new HashMap<>();
        long count =0;
        for (long item : arr) {
            long val = item;
            long key = item;
            long key2 = item;
            if (map1.containsKey(key2/r)) {
                if (map2.containsKey(key2/r)) {
                    count += (map2.get(key2/r));
                }
                map2.put(val, map2.getOrDefault(val, 0L)
                         + map1.get(key2/r));
            }
            map1.put(val, map1.getOrDefault(val, 0L) + 1);
        }
        System.out.println(count);
    }

    
    
}