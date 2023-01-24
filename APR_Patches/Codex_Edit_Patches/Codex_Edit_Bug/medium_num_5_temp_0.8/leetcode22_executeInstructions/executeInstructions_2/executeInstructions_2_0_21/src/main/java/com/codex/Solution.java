package com.codex;

import java.util.*;

public class Solution {
    public static int[] executeInstructions(int n, int[] startPos, String s) {
        
        int[] result = new int[s.length()];
        for (int i = 0; i < s.length(); i++) {
            int count = 0;
            int[] pos = new int[2];
            pos[0] = startPos[0];
            pos[1] = startPos[1];
            while (i + count < s.length()) {
                if (s.charAt(i + count) == 'L' || s.charAt(i + count) == 'R') {
                    if ((s.charAt(i + count) == 'L' && pos[1] > 0) || (s.charAt(i + count) == 'R' && pos[1] < n - 1)) {
                        pos[1] += (s.charAt(i + count) == 'L' ? -1 : 1);
                        count++;
                    } else {
                        break;
                    }
                } else if (s.charAt(i + count) == 'U' || s.charAt(i + count) == 'D') {
                    if ((s.charAt(i + count) == 'U' && pos[0] > 0) || (s.charAt(i + count) == 'D' && pos[0] < n - 1)) {
                        pos[0] += (s.charAt(i + count) == 'U' ? -1 : 1);
                        count++;
                    } else {
                        break;
                    }
                } else {
                    break;
                }
            }
            result[i] = count;
        }
        return result;
    }
}