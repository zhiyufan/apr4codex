package com.codex;

import java.util.*;

public class Solution {
    static int[] rotateRight(int[] point, int angle) {
        int x = point[0];
        int y = point[1];
        // rotate point
        int xr = (int) Math.round((x * Math.cos(angle) - y * Math.sin(angle)));
        int yr = (int) Math.round((x * Math.sin(angle) + y * Math.cos(angle)));
        return new int[]{xr, yr};

    }

    static int[] rotateLeft(int[] point, int angle) {
        int x = point[0];
        int y = point[1];
        // rotate point
        int xr = (int) Math.round((x * Math.cos(angle) + y * Math.sin(angle)));
        int yr = (int) Math.round((-x * Math.sin(angle) + y * Math.cos(angle)));
        return new int[]{xr, yr};
    }

    static int[] nextPoint(int[] point, int angle) {
        int x = point[0];
        int y = point[1];
        // rotate point
        int xr = (int) Math.round((x * Math.cos(angle) + y * Math.sin(angle)));
        int yr = (int) Math.round((-x * Math.sin(angle) + y * Math.cos(angle)));
        return new int[]{xr, yr};
    }

    public static int[] executeInstructions(int n, int[] startPos, String s) {

        int[] answer = new int[s.length()];
        for (int i = 0; i < s.length(); i++) {
            int x = startPos[0];
            int y = startPos[1];
            int count = 0;

            int angle = 0;
            char direction = s.charAt(i);
            switch (direction) {
                case 'L': {
                    angle = -1;
                    break;
                }
                case 'R': {
                    angle = 1;
                    break;
                }
                case 'U': {
                    angle = 2;
                    break;
                }
                case 'D': {
                    angle = -2;
                    break;
                }
            }
            answer[i] = count;
        }
        return answer;
    }

    
}