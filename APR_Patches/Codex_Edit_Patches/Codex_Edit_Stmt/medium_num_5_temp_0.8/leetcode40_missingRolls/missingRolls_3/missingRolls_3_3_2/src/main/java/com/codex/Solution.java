package com.codex;

import java.util.*;

public class Solution {
    /**
     * 
     * @author cqyc
     * 
     * 
     *         题目描述： You have a fighting game. Each character has a statistic
     *         for strength. Strength can be increased by rolling a 6-sided dice
     *         and adding the roll value to the strength. You might roll the
     *         dice multiple times and add the values together. Each character
     *         has a fixed number of allowed rolls. You want to know what the
     *         expected strength is of a character given the number of rolls
     *         they have and the possible rolls they could get.
     * 
     *         You have access to a function int roll() that will return a
     *         random number from 1 to 6.
     * 
     *         Example:
     * 
     *         roll() could return: 3 3 3 3 6 2 4 1 1 2
     * 
     *         If your character has 2 rolls, your possible strength values are:
     * 
     *         6 12 18 4 10 16 2 8 14 5 11 17 3 9 15 1 7 13
     * 
     *         So the expected strength would be (6 + 12 + 18 + 4 + 10 + 16 + 2 +
     *         8 + 14 + 5 + 11 + 17 + 3 + 9 + 15 + 1 + 7 + 13) / 21 = 9
     * 
     *         提示：
     * 
     *         If you have 0 rolls, the expected strength would be 0. If you
     *         have 1 roll, the expected strength would be 3.5.
     * 
     *         Function Description
     * 
     *         Complete the function missingRolls in the editor below.
     * 
     *         missingRolls has the following parameters: int[] rolls : an array
     *         of integers representing the rolls a character has
     * 
     *         int mean : an integer representing the expected strength of the
     *         character
     * 
     *         int n : the number of rolls allowed for the character Return:
     * 
     *         int[]: an array of integers representing the missing rolls
     * 
     *         Constraints
     * 
     *         1 ≤ rolls.length ≤ 105 0 ≤ rolls[i] ≤ 6 1 ≤ mean ≤ 15 1 ≤ n ≤ 107
     * 
     */

    public static int[] missingRolls(int[] rolls, int mean, int n) {
        
        int[] ans = new int[n];
        int sum1 = 0;
        for (int i = 0; i < rolls.length; i++) {
            sum1 += rolls[i];
        }
        int sum = (mean * (n + rolls.length)) - sum1;
        for (int i = 0; i < ans.length; i++) {
            ans[i] = sum / n;
        }
        return ans;
    }
}