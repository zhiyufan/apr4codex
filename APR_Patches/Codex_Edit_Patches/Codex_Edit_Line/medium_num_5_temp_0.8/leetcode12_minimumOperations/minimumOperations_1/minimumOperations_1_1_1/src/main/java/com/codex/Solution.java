package com.codex;

import java.util.*;

public class Solution {
package interview.leetcode.prob;

/**
 * Alex and Lee play a game with piles of stones.  There are an even number of piles arranged in a row, and each pile has a positive integer number of stones piles[i].

The objective of the game is to end with the most stones.  The total number of stones is odd, so there are no ties.

Alex and Lee take turns, with Alex starting first.  Each turn, a player takes the entire pile of stones from either the beginning or the end of the row.  This continues until there are no more piles left, at which point the person with the most stones wins.

Assuming Alex and Lee play optimally, return True if and only if Alex wins the game.

Example 1:

Input: [5,3,4,5]
Output: true
Explanation: 
Alex starts first, and can only take the first 5 or the last 5.
Say he takes the first 5, so that the row becomes [3, 4, 5].
If Lee takes 3, then the board is [4, 5], and Alex takes 5 to win with 10 points.
If Lee takes the last 5, then the board is [3, 4], and Alex takes 4 to win with 9 points.
This demonstrated that taking the first 5 was a winning move for Alex, so we return true.
 

Note:

2 <= piles.length <= 500
piles.length is even.
1 <= piles[i] <= 500
sum(piles) is odd.
Accepted
8,099
Submissions
9,936
 * @author jojo
 * Jul 14, 2019 11:17:31 PM
 */
public class StoneGame {
	public boolean stoneGame(int[] piles) {
        // the idea is pretty straight forward. the player with the last move will win. 
        // the player can pick last or first move so the call is to maximize the sum of the piles.
        // so for every step the player will pick max from 0 to n - 1
        return maxSum(piles, 0, piles.length - 1) > 0;
    }
    
    private int maxSum(int[] piles, int left, int right){
        if(left == right){
            return piles[left];
        }
        
        int pickFirst = piles[left] - maxSum(piles, left + 1, right);
        int pickLast = piles[right] - maxSum(piles, left, right - 1);
        
        return Math.max(pickFirst, pickLast);
    }
}

	public static int minimumOperations(int[] nums) {
        
        int dp[][] = new int[nums.length][3];
        for (int[] d : dp) Arrays.fill(d, Integer.MAX_VALUE);
        dp[0][1] = nums[0];
        dp[1][1] = nums[1];
        for(int i = 2; i < nums.length; i++){
            if (nums[i - 2] == nums[i]){
                dp[i][2] = Math.min(dp[i][2], dp[i - 2][1] + nums[i]);
                dp[i][2] = Math.min(dp[i][2], dp[i - 2][2] + nums[i]);
            } else {
                dp[i][1] = Math.min(dp[i][1], dp[i - 2][1] + nums[i]);
                dp[i][1] = Math.min(dp[i][1], dp[i - 2][2] + nums[i]);
            }
            dp[i][1] = Math.min(dp[i][1], dp[i - 1][1] + nums[i - 1]);
            dp[i][1] = Math.min(dp[i][1], dp[i - 1][2] + nums[i -1]);
        }
        return Math.min(dp[nums.length - 1][1], dp[nums.length - 1][2]);
    }

    
}