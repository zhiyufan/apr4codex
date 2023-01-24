package com.codex;

import java.util.*;

public class Solution {
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Hackerrank;

/**
 *
 * @author trungnp
 */
public class MaximizingMissionPoints {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    }
    
    public static long gridGame(int[][] grid) {
        
        int[][] dp = new int[2][grid[0].length];
        dp[0][0] = 0;
        dp[1][0] = 0;
        for (int i = 1; i < grid[0].length; i++) {
            dp[0][i] = Math.max(dp[0][i - 1], dp[1][i - 1]);
            dp[1][i] = dp[0][i - 1] + grid[1][i];
        }

        return Math.max(dp[0][grid[0].length - 1], dp[1][grid[0].length - 1]);
    }

    
}