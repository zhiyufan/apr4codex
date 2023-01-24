package com.codex;

import java.util.*;

public class Solution {
    public static int[] executeInstructions(int n, int[] startPos, String s) {
        /** There is an n x n grid, with the top-left cell at (0, 0) and the bottom-right cell at (n - 1, n - 1). You are given the integer n and an integer array startPos where startPos = [startrow, startcol] indicates that a robot is initially at cell (startrow, startcol).
         * You are also given a 0-indexed string s of length m where s[i] is the ith instruction for the robot: 'L' (move left), 'R' (move right), 'U' (move up), and 'D' (move down).
         * The robot can begin executing from any ith instruction in s. It executes the instructions one by one towards the end of s but it stops if either of these conditions is met:
         * The next instruction will move the robot off the grid.
         * There are no more instructions left to execute.
         * Return an array answer of length m where answer[i] is the number of instructions the robot can execute if the robot begins executing from the ith instruction in s.
         */
        int[] result = new int[s.length()];
        for (int i = 0; i < s.length(); i++) {
            int count = 0;
            int[] pos = new int[2];
            pos[0] = startPos[0];
            pos[1] = startPos[1];
            while (pos[0] >= 0 && pos[0] < n && pos[1] >= 0 && pos[1] < n && i + count < s.length()) {
                if (s.charAt(i + count) == 'L') {
                    pos[1]--;
                } else if (s.charAt(i + count) == 'R') {
                    pos[1]++;
                } else if (s.charAt(i + count) == 'U') {
                    pos[0]--;
                } else if (s.charAt(i + count) == 'D') {
                    pos[0]++;
                }
                count++;
            }
            result[i] = count;
        }
        return result;
    }

    }