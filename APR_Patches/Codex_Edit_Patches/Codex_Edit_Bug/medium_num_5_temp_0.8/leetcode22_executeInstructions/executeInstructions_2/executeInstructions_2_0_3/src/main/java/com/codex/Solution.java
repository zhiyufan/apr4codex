package com.codex;

import java.util.*;

public class Solution {
    public static int[] executeInstructions(int n, int[] startPos, String s) {
        
        int[] result = new int[s.length() + 1];
        int posX = startPos[0];
        int posY = startPos[1];
        int count = 1;
        int direction = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 'L') {
                direction = (direction - 1 + 4) % 4;
            } else if (s.charAt(i) == 'R') {
                direction = (direction + 1 + 4) % 4;
            } else if (s.charAt(i) == 'U') {
                direction = (direction - 2 + 4) % 4;
            } else if (s.charAt(i) == 'D') {
                direction = (direction + 2 + 4) % 4;
            } else {
                result[i] = count;
                count = 0;
            }
            if (direction == 0) {
                posX--;
            } else if (direction == 1) {
                posY++;
            } else if (direction == 2) {
                posX++;
            } else if (direction == 3) {
                posY--;
            }
            if (posX < 0 && posY < 0) {
                count++;
            } else if (posX >= 0 && posY >= 0 && posX < n && posY < n) {
                count = 1;
            } else {
                count = 0;
            }
        }
        if (count > 0) {
            result[s.length()] = count;
        }
        return result;
    }

    
}