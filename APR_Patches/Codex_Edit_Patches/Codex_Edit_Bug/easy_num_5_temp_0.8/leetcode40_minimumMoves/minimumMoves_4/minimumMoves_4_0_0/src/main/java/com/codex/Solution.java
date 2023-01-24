package com.codex;

import java.util.*;

public class Solution {

/*
* Given a String representing the sequence of moves a robot vacuum makes,
* return the number of moves that will result in the vacuum cleaning every part of the room.
*/


    public static int minimumMoves(String s) {
        
        int[] dp = new int[s.length()];
        char[] sChar = s.toCharArray();
        if (sChar[0] == sChar[1] && sChar[1] == sChar[2]) {
            dp[0] = sChar[0] == 'X'? 0 : 1;
        }
        else if (sChar[0] == sChar[1] && sChar[1] != sChar[2]) {
            dp[0] = sChar[0] == 'X'? 1 : 0;
        } else {
            dp[0] = 0;
        }
        dp[1] = dp[0];
        for (int i = 2; i < sChar.length; i++) {
            if (sChar[i] == sChar[i-1] && sChar[i-1] == sChar[i-2]) {
                dp[i] = sChar[i] == 'X'? 0 : 1;
            } else if (sChar[i] == sChar[i-1] && sChar[i-1] != sChar[i-2]) {
                dp[i] = sChar[i] == 'X'? 1 : 0;
            } else {
                dp[i] = 0;
            }
            dp[i] += dp[i-1];
        }
        return dp[dp.length-1];
    }
}