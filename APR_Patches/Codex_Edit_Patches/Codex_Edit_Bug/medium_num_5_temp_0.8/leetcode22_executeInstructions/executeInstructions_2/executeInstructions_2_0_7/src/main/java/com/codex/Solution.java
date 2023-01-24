package com.codex;

import java.util.*;

public class Solution {

    public static void main(String[] args) {
        int[] startPos = { 0, 0 };
        int[] res = executeInstructions(4, startPos, "URR");
        for (int i = 0; i < res.length; i++) {
            System.out.println(res[i]);
        }
    }

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