package com.codex;

import java.util.*;

public class Solution {
    public static int[] executeInstructions(int n, int[] startPos, String s) {        
        int[] result = new int[s.length()];
        for (int i = 0; i < s.length(); i++) {
            int count = 1;
            int newX = startPos[0];
            int newY = startPos[1];
            boolean direction = true;
            for (int j = i + 1; j < s.length(); j++) {
                if (s.charAt(j) == 'L') {
                    newY--;
                } else if (s.charAt(j) == 'R') {
                    newY++;
                } else if (s.charAt(j) == 'U') {
                    newX--;
                } else if (s.charAt(j) == 'D') {
                    newX++;
                }
                if (newX < 0 || newX >= n || newY < 0 || newY >= n) {
                    break;
                }
                if (s.charAt(j) != s.charAt(i)) {
                    direction = false;
                }
                if (s.charAt(j) == s.charAt(i) && !direction) {
                    break;
                } else if (s.charAt(j) == s.charAt(i)) {
                    count++;
                }
            }
            result[i] = count;
        }
        return result;
    }
}