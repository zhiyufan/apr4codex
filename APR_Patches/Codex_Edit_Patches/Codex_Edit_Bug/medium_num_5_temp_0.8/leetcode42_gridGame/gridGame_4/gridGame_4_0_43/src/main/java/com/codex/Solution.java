package com.codex;

import java.util.*;

public class Solution {
    static int index = -1;
    static int[] array;
    static int[] aux;
    static int count = 0;
    
    static void match (int start, int end, int target) {
        if (start == end) {
            if (array[start] == target) {
                count++;
            }
        } else {
            if (target == array[start]) {
                count++;
            }
            match(start + 1, end, target - array[start]);
        }
    }
  
    static int numberOfWays(int[] coins, int target) {
        array = coins;
        match(0, coins.length - 1, target);
        return count;
    }



    public static long gridGame(int[][] grid) {
        
        int[] first = new int[grid[0].length];
        int[] second = new int[grid[0].length];
        for (int i = 0; i < grid[0].length; i++)
            first[i] = grid[0][i];
        for (int i = 0; i < grid[0].length; i++)
            second[i] = grid[1][i];
        Arrays.sort(first);
        Arrays.sort(second);
        int sum = 0;
        boolean swap = true;
        for (int i = 0; i < grid[0].length; i++) {
            if (swap) {
                sum += second[grid[0].length - i - 1];
                swap = false;
            } else {
                sum += first[grid[0].length - i - 1];
                swap = true;
            }
        }
        return sum;
    }

    
}