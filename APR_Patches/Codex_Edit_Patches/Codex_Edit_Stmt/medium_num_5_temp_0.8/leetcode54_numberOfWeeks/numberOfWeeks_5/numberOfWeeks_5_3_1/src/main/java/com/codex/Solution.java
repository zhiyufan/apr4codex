package com.codex;

import java.util.*;

public class Solution {

// /*
//  * To change this license header, choose License Headers in Project Properties.
//  * To change this template file, choose Tools | Templates
//  * and open the template in the editor
//  */
// package javaapplication1;

// /**
//  *
//  * @author Calvin
//  */
// public class JavaApplication1 {

//     /**
//      * @param args the command line arguments
//      */
//     public static void main(String[] args) {

//     }
// 	public static long numberOfWeeks(int[] milestones) {
        
//         int result = 0;
//         int[] dp = new int[10000];
//         for (int i = 0; i < 10000; i++) {
//             dp[i] = Integer.MAX_VALUE;
//         }
//         dp[0] = 0;
//         for (int i = 0; i < milestones.length; i++) {
//             for (int j = 0; j < milestones[i]; j++) {
//                 if (dp[j] != Integer.MAX_VALUE) {
//                     dp[milestones[i]] = Math.min(dp[j] + 1, dp[milestones[i]]);
//                 }
//             }
//             result = Math.max(result, dp[milestones[i]]);
//         }
//         return result;
//     }

// }

    public static long numberOfWeeks(int[] milestones) {
        
        int result = 0;
        int[] dp = new int[10000];
        for (int i = 0; i < 10000; i++) {
            dp[i] = Integer.MAX_VALUE;
        }
        dp[0] = 0;
        for (int i = 0; i < milestones.length; i++) {
            for (int j = 0; j < milestones[i]; j++) {
                if (dp[j] < Integer.MAX_VALUE) {
                    dp[milestones[i]] = Math.min(dp[j] + 1, dp[milestones[i]]);
                }
            }
            result = Math.max(result, dp[milestones[i]]);
        }
        return result;
    }

    
}