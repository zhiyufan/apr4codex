package com.codex;

import java.util.*;

public class Solution {
// Doing it the hard way
    public static int[] executeInstructions1(int n, int[] startPos, String s) {
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

// Doing it the smart way
    public static int[] executeInstructions2(int n, int[] startPos, String s) {
        int[] result = new int[s.length()];
        int[] pos = new int[2];
        pos[0] = startPos[0];
        pos[1] = startPos[1];
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 'L') {
                    pos[1]--;
            } else if (s.charAt(i) == 'R') {
                pos[1]++;
            } else if (s.charAt(i) == 'U') {
                pos[0]--;
            } else if (s.charAt(i) == 'D') {
                pos[0]++;
            }
            if (pos[0] < 0 || pos[0] >= n || pos[1] < 0 || pos[1] >= n) {
                result[i] = 0;
            } else {
                result[i] = i + 1;
            }
        }
        return result;
    }
}