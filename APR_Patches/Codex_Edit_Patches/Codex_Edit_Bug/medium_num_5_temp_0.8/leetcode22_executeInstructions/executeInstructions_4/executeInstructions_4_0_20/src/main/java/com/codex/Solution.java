package com.codex;

import java.util.*;

public class Solution {
    public static int[] executeInstructions(int n, int[] startPos, String s) {
        int x = startPos[0];
        int y = startPos[1];
        char[] chars = s.toCharArray();
        int res[][] = new int[chars.length][2];
        int count = 0;
        for (int i = 0; i < chars.length; i++) {
            char c = chars[i];
            switch (c) {
                case 'U':
                    x--;
                    if (x < 0) {
                        x++;
                        continue;
                    }
                    break;
                case 'D':
                    x++;
                    if (x >= n) {
                        x--;
                        continue;
                    }
                    break;
                case 'L':
                    y--;
                    if (y < 0) {
                        y++;
                        continue;
                    }
                    break;
                case 'R':
                    y++;
                    if (y >= n) {
                        y--;
                        continue;
                    }
                    break;
            }
            res[count][0] = x;
            res[count][1] = y;
            count++;
        }
        int last[][] = new int[count][2];
        for (int i = 0; i < count; i++) {
            last[i][0] = res[i][0];
            last[i][1] = res[i][1];
        }
        int[] ans = new int[last.length];
        for (int i = 0; i < last.length; i++) {
            ans[i] = last[i][0] * n + last[i][1];
        }
        return ans 
    }
}