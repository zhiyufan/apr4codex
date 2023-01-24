package com.codex;

import java.util.*;

public class Solution {

Write a program that produces a sequence of instructions given a starting position and a string of characters.

Example:
Input:

n: 10 
(n x n is the dimensions of the grid)

startPos: [5,5]

instructions: "LRRRRRL"

Output:
[4,4,4,4,4,4,1]



    public static int[] executeInstructions(int n, int[] startPos, String s) {
        
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