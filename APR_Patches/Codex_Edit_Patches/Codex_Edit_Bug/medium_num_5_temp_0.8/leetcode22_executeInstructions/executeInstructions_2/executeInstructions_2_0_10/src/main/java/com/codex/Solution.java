package com.codex;

import java.util.*;

public class Solution {
    public static int[] executeInstructions(int n, int[] startPos, String s) {
        
        int[] result = new int[startPos.length];
        for (int i = 0; i < startPos.length; i++) {
            int[] pos = new int[2];
            pos[0] = startPos[0];
            pos[1] = startPos[1];
            int count = 0;
            while (pos[0] >= 0 && pos[0] < n && pos[1] >= 0 && pos[1] < n && count < s.length()) {
                if (s.charAt(count) == 'L') {
                    pos[1] = pos[1] - 1;
                } else if (s.charAt(count) == 'R') {
                    pos[1] = pos[1] + 1;
                } else if (s.charAt(count) == 'U') {
                    pos[0] = pos[0] - 1;
                } else if (s.charAt(count) == 'D') {
                    pos[0] = pos[0] + 1;
                }
                count++;
                if (pos[0] < 0 || pos[0] >= n || pos[1] < 0 || pos[1] >= n) {
                    break;
                }
            }
            result[i] = count;
        }
        return result;
    }

    
}