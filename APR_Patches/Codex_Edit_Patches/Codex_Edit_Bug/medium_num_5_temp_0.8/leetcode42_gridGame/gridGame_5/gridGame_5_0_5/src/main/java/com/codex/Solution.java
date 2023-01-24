package com.codex;

import java.util.*;

public class Solution {
import java.util.*;

    public static long gridGame(int[][] grid) {
        
        int m = grid[0].length;
        int[] grid1 = new int[m];
        int[] grid2 = new int[m];
        for (int i = 0; i < m; i++) {
            grid1[i] = grid[0][i];
            grid2[i] = grid[1][i];
        }
        Arrays.sort(grid1);
        Arrays.sort(grid2);
        int sum = 0;
        for (int i = 0; i < m; i++) {
            if (grid1[i] > grid2[i]) {
                sum += grid2[i];
            } else {
                sum += grid1[i];
            }
        }
        return sum;
    }

    public static int gridGame1(int[][] grid) {
        int m = grid[0].length;
        int sum = 0;
        while (m > 0) {
            int min1 = Integer.MAX_VALUE;
            int min2 = min1;
            int iMin1 = -1, iMin2 = -1;
            for (int i = 0; i < m; i++) {
                if (min1 > grid[0][i]) {
                    iMin2 = iMin1;
                    min2 = min1;
                    iMin1 = i;
                    min1 = grid[0][i];
                } else if (min2 > grid[0][i]) {
                    iMin2 = i;
                    min2 = grid[0][i];
                }
            }
            sum += grid[0][iMin1] < grid[1][iMin1] ? grid[0][iMin1] : grid[1][iMin1];
            for (int i = iMin2; i < m - 1; i++) {
                grid[0][i] = grid[0][i + 1];
                grid[1][i] = grid[1][i + 1];
            }
            m--;
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int m = in.nextInt();
        int[][] grid = new int[2][m];
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < m; j++) {
                grid[i][j] = in.nextInt();
            }
        }
        System.out.println(gridGame(grid));
        System.out.println(gridGame1(grid));
    }
}
}