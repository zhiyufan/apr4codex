package com.codex;

import java.util.*;

public class Solution {

    /**
     * Consider a grid of size n * n, the robot can only move right, down and left.
     * For example:
     * if n = 4, the grid is as follows:
     * 
     * <pre>
     * 0123
     * 4...
     * 5...
     * 6...
     * 7...
     * </pre>
     * 
     * Initially, the robot is at (row = 0, column = 0).
     * U = up, D = down, L = left, R = right
     * Assume the robot can only move "s" steps, each step is a command, calculate
     * the position after execution of all commands.
     * <p>
     * Example:
     * <p>
     * Input: n = 4, startPos = (0, 0), s = "RRDD"
     * <p>
     * Output: (2, 2)
     * <p>
     * Explanation: For the instructions "RRDD", first move right v
     * then move right again, then down, and down.
     * 
     * @param n       size of the grid
     * @param startPos initial position of the robot
     * @param s       list of instructions
     * @return final position of the robot
     */
    public static int[] executeInstructions(int n, int[] startPos, String s) {

        for (int i = 0; i < s.length(); i++) {
            char direction = s.charAt(i);
            switch (direction) {
                case 'L': {
                    if (startPos[0] > 0) {
                        startPos[0]--;
                    }
                    break;
                }
                case 'R': {
                    if (startPos[0] < n - 1) {
                        startPos[0]++;
                    }
                    break;
                }
                case 'U': {
                    if (startPos[1] > 0) {
                        startPos[1]--;
                    }
                    break;
                }
                case 'D': {
                    if (startPos[1] < n - 1) {
                        startPos[1]++;
                    }
                    break;
                }
            }
        }
        return startPos;
    }

    public static void main(String[] args) {
        int[] startPos = new int[] { 0, 0 };
        String s = "RRDD";
        System.out.println(Arrays.toString(executeInstructions(4, startPos, s)));
    }

    public static int[] executeInstructions1(int n, int[] startPos, String s) {

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
            }
            answer[i] = count;
        }
        return answer;
    }

    
}