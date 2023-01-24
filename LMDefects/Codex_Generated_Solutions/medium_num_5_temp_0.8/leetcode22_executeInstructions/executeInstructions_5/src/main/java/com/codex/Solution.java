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
        int[][] grid = new int[n][n];
        int[] max = new int[s.length()];
        int x = startPos[0], y = startPos[1];
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            switch (c) {
                case 'L':
                    if (y > 0) {
                        y--;
                        max[i] = i + 1;
                    } else {
                        max[i] = 1;
                        max[0] = 1;
                        i++;
                        while (i < s.length()) {
                            max[i] = 1;
                            i++;
                        }
                    }
                    break;
                case 'R':
                    if (y < grid.length - 1) {
                        y++;
                        max[i] = i + 1;
                    } else {
                        max[i] = 1;
                        max[0] = 1;
                        i++;
                        while (i < s.length()) {
                            max[i] = 1;
                            i++;
                        }
                    }
                    break;
                case 'U':
                    if (x > 0) {
                        x--;
                        max[i] = i + 1;
                    } else {
                        max[i] = 1;
                        max[0] = 1;
                        i++;
                        while (i < s.length()) {
                            max[i] = 1;
                            i++;
                        }
                    }
                    break;
                case 'D':
                    if (x < grid.length - 1) {
                        x++;
                        max[i] = i + 1;
                    } else {
                        max[i] = 1;
                        max[0] = 1;
                        i++;
                        while (i < s.length()) {
                            max[i] = 1;
                            i++;
                        }
                    }
                    break;
                default:
                    throw new IllegalArgumentException("Illegal input! " + c);
            }
        }
        for (int i = max.length - 2; i >= 0; i--) {
            max[i] = Math.max(max[i], max[i + 1]);
        }
        }