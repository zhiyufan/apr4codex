package com.codex;

import java.util.*;

public class Solution {
// import java.util.Scanner;
// public class Solution {
// public static void main(String args[] ) throws Exception {
// Scanner sc = new Scanner(System.in);
// int n = sc.nextInt();
// int arr[] = new int[n];
// for(int i = 0; i < n; i++)
//                                             arr[i] = sc.nextInt();
// int res = minimumCost(arr);
// System.out.println(res);

                                            
// }
    public static int minimumCost(int[] cost) {
        
        if (cost.length == 1) return cost[0];
        int a = cost[0];
        int b = cost[1];
        int c = 0;
        for (int i = 2; i < cost.length; i++) {
            c = cost[i] + Math.min(a, b);
            a = b;
            b = c;
        }
        return Math.min(a, b);
    }

// }
    
    
}