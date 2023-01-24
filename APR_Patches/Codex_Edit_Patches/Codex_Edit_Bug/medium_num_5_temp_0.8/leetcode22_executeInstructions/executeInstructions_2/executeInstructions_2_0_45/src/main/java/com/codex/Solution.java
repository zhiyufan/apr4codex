package com.codex;

import java.util.*;

public class Solution {
    public static int[] executeInstructions(int n, int[] startPos, String s) {
        if (startPos == null || n <= 0 || n > 1000) {
            return null;
        }
        if (s == null || s.length() == 0 || s.length() > 10000) {
            return null;
        }
        if (startPos[0] < 0 || startPos[0] >= n) {
            return null;
        }
        if (startPos[1] < 0 || startPos[1] >= n) {
            return null;
        }
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
                result[i] = 1;
            }
            if (pos[0] < 0) {
                pos[0]++;
            } else if (pos[0] >= n) {
                pos[0]--;
            } else if (pos[1] < 0) {
                pos[1]++;
            } else if (pos[1] >= n) {
                pos[1]--;
            }
        }
     
        return result;   
    }   

    
}