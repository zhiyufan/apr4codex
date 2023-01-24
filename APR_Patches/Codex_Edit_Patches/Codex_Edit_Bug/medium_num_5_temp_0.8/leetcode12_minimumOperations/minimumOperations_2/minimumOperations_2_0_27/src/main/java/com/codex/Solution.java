package com.codex;

import java.util.*;

public class Solution {
double dp[][] = new double[i][j];

        for(int i=0;i<=n;i++)
            for(int j=0;j<=n;j++)
                dp[i][j]=-1;

        return func(n,n);
    }
    public double func(int i, int j)
    {
        if(i==0 || j==0)
            return 1;
        if(dp[i][j]!=-1)
            return dp[i][j];
        if(j==1)
        {
            dp[i][j]=0;
        }
        if(i==j)
        {
            dp[i][j]=0;
        }
        else
        {
            dp[i][j]=(i*1.0/(i+j))*func(i-1,j)+(j*1.0/(i+j))*func(i,j-1);
        }
        return dp[i][j];
    }

    
}