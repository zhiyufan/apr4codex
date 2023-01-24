package com.codex;

import java.util.*;

public class Solution {

    public static long gridGame(int[][] grid, int n , int m) 
    {
        
        int dp[][] = new int[n][m];
        
        //initialize the first row and first column
        //do this in order of column major
        for(int j = 0; j < m; j++)
        	dp[0][j] = grid[0][j];
        
        for(int i = 1; i < n; i++)
        {
        	dp[i][0] = Math.max(dp[i - 1][0], dp[i - 1][1]) + grid[i][0];
        	for(int j = 1; j < m - 1; j++)
        		dp[i][j] = Math.max(dp[i - 1][j], Math.max(dp[i - 1][j - 1], dp[i - 1][j + 1])) + grid[i][j];
        	//initialize the last column
        	dp[i][m - 1] = Math.max(dp[i - 1][m - 1], dp[i - 1][m - 2]) + grid[i][m - 1];
        }

        
        int max = 0;
        for(int j = 0; j < m; j++)
        {
        	if(dp[n - 1][j] > max)
        		max = dp[n - 1][j];
        }
        return max;
    }

	/*
	 * tester
	 */
	
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		
		int grid[][];
		int n, m;
		
		n = 3;
		m = 3;
		grid = new int[n][m];
		
		grid[0][0] = 3;	grid[0][1] = 2;		grid[0][2] = 2;
		
		grid[1][0] = 1;	grid[1][1] = 5;		grid[1][2] = 4;
		
		grid[2][0] = 1;	grid[2][1] = 2;		grid[2][2] = 3;
		
		
		System.out.println(gridGame(grid, n, m));
		
		
	}
}