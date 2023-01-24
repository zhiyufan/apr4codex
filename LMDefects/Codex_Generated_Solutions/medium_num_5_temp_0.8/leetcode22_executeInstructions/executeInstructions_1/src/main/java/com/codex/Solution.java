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
        int [] answer = new int[s.length()];
        int [][] possibleMove = new int[n][n];
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (isValidMove(n, possibleMove, startPos, c)) {
                possibleMove[startPos[0]][startPos[1]] = i + 1;
                switch (c) {
                    case 'U':
                        startPos[0] -= 1;
                        break;
                    case 'D':
                        startPos[0] += 1;
                        break;
                    case 'L':
                        startPos[1] -= 1;
                        break;
                    case 'R':
                        startPos[1] += 1;
                        break;
                }
            }
        }
        answer[s.length() - 1] = 1;
        for (int i = s.length() - 2; i >= 0; i--) {
            char c = s.charAt(i);
            if (isValidMove(n, possibleMove, startPos, c)) {
                answer[i] = possibleMove[startPos[0]][startPos[1]] - i;
                switch (c) {
                    case 'U':
                        startPos[0] -= 1;
                        break;
                    case 'D':
                        startPos[0] += 1;
                        break;
                    case 'L':
                        startPos[1] -= 1;
                        break;
                    case 'R':
                        startPos[1] += 1;
                        break;
                }
            } else {
                answer[i] = 0;
            }
        }
        return answer;
    }
    }