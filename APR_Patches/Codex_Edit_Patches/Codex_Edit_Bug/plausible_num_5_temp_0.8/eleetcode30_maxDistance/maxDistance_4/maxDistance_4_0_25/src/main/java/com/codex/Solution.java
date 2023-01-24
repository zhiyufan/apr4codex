package com.codex;

import java.util.*;

public class Solution {
    public static int maxDistance(int[] colors) {
        
        int n = colors.length;
        int[][] range = new int[3][2];
        for (int i = 0; i < 3; i++) {
            range[i] = new int[]{n, -1};
        }
        for (int i = 0; i < n; i++) {
            range[colors[i]][0] = Math.min(range[colors[i]][0], i);
            range[colors[i]][1] = Math.max(range[colors[i]][1], i);
        }
        int minDis = n - 1;
        for (int i = 0; i < 3; i++) {
            for (int j = i + 1; j < 3; j++) {
                minDis = Math.min(minDis, Math.abs(range[i][0] - range[j][1]));
                minDis = Math.min(minDis, Math.abs(range[j][0] - range[i][1]));
            }
        }
        return minDis;
    }


    public static void MinMax(int arr[],int start,int end)
    {
        
        if(start==end)
        {
            System.out.println("Minimum is : "+arr[start]);
            System.out.println("Maximum is : "+arr[end]);
            return;
        }
        else if(start+1==end)
        {
            if(arr[start]<arr[end])
            {
            System.out.println("Minimum is : "+arr[start]);
            System.out.println("Maximum is : "+arr[end]);
            }
            else
            {
            System.out.println("Minimum is : "+arr[end]);
            System.out.println("Maximum is : "+arr[start]);
        }
           
        }
        else
        {
           int mid=(start+end)/2;
           MinMax(arr,start,mid);
           MinMax(arr,mid+1,end);
        }
    }
}