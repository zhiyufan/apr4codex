package com.codex;

import java.util.*;

public class Solution {
    // https://leetcode.com/discuss/interview-question/398035/

    /**
        Bob is playing a game with two grids of numbers, A and B. He has to make both grids equal by selecting an arbitrary cell of A and replacing it with the number in the same cell of B.

        Afterwards, Bob wants to find the most valuable set of cells that he can still change so that the sum of values in both grids is equalized. Change a cell only once.

        Example:

        A = [[5, 0, 2],
             [1, 2, 0]]
        B = [[6, 2, 2],
             [2, 0, 2]]

        The most valuable set of cells is: [(0, 0), (0, 2), (1, 0)]
        The value of this set is: 5 + 2 + 1 = 8

        The total sum of values in A is 8, while B is 8.
        After replacing the cells with the values of B, the sum of both grids is also 8.

        Function Description

        Complete the gridGame function in the editor below. The function must return an integer that represents the maximum possible value for the selected cells.

        gridGame has the following parameter(s):

        grid: a 2D array of integers

        Input Format

        The first line contains a single integer n, the number of arrays in grid.
        Each of the next n lines contains an array of m integers separated by a single space.

        Constraints
        2 <= n <= 10
        1 <= m <= 10^5
        1 <= grid[i][j] <= 10^9

        Output Format

        Return the maximum possible value of the selected cells.

        Sample Input
        2
        5 0 2
        1 2 0
        6 2 2
        2 0 2

        Sample Output
        8

        Explanation

        A = [[5, 0, 2],
             [1, 2, 0]]
        B = [[6, 2, 2],
             [2, 0, 2]]

        The most valuable set of cells is: [(0, 0), (0, 2), (1, 0)]
        The value of this set is: 5 + 2 + 1 = 8

        The total sum of values in A is 8, while B is 8.
        After replacing the cells with the values of B, the sum of both grids is also 8.
    */
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


    

    
}