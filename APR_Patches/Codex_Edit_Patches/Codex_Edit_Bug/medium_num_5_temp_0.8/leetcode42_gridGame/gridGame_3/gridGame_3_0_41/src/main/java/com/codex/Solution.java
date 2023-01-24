package com.codex;

import java.util.*;

public class Solution {
import java.util.*;

public class Solution {

    public static int solve(int a[][])
    {
        int ans=0;
        if(a.length==0)
        {
            return 0;
        }
        int n=a[0].length;
        int dp[][]=new int[a.length][n];
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<a.length;j++)
            {
                if(i==0)
                {
                    dp[j][0]=a[j][0];
                }
                else
                {
                    int min=Math.min(dp[(j+1)%a.length][i-1],dp[(j+2)%a.length][i-1]);
                    dp[j][i]=a[j][i]+min;
                }
            }
        }
        int min=Integer.MAX_VALUE;
        for(int i=0;i<a.length;i++)
        {
            min=Math.min(min,dp[i][n-1]);
        }
        return min;
    }




    public static long gridGame(int[][] grid) {
        int n=grid.length;
        int m=grid[0].length;
        return solve(grid);
    }
    public static void main(String arg[])
    {
        int a[][]={{1,2},{2,2}};
        System.out.print(solve(a));
        }
}
}