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
        int[] answer = new int[s.length()];
        for (int i = 0; i < s.length(); i++) {
            int row = startPos[0];
            int col = startPos[1];
            int count = 0;

            char[] directions = s.substring(i).toCharArray();
            for (int j = 0; j < directions.length; j++) {
                switch (directions[j]) {
                    case 'L': {
                        if (col > 0) {
                            col--;
                            count++;
                        }
                        break;
                    }
                    case 'R': {
                        if (col < n - 1) {
                            col++;
                            count++;
                        }
                        break;
                    }
                    case 'U': {
                        if (row > 0) {
                            row--;
                            count++;
                        }
                        break;
                    }
                    case 'D': {
                        if (row < n - 1) {
                            row++;
                            count++;
                        }
                        break;
                    }
                }
            }
            answer[i] = count;
        }
        return answer;
    }

    }