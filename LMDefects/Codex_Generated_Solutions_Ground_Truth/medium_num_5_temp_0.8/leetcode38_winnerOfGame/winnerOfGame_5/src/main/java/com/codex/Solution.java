package com.codex;

import java.util.*;

public class Solution {
    public static boolean winnerOfGame(String colors) {
        /** There are n pieces arranged in a line, and each piece is colored either by 'A' or by 'B'. You are given a string colors of length n where colors[i] is the color of the ith piece.
         * Alice and Bob are playing a game where they take alternating turns removing pieces from the line. In this game, Alice moves first.
         * Alice is only allowed to remove a piece colored 'A' if both its neighbors are also colored 'A'. She is not allowed to remove pieces that are colored 'B'.
         * Bob is only allowed to remove a piece colored 'B' if both its neighbors are also colored 'B'. He is not allowed to remove pieces that are colored 'A'.
         * Alice and Bob cannot remove pieces from the edge of the line.
         * If a player cannot make a move on their turn, that player loses and the other player wins.
         * Assuming Alice and Bob play optimally, return true if Alice wins, or return false if Bob wins.
         */
        char[] arr = colors.toCharArray();
        int A = 0, B = 0;
        for(char c : arr) {
            if(c=='A')
                A++;
            else
                B++;
        }
        if(A>B) {
            return true;
        }
        return false;
    }
    }