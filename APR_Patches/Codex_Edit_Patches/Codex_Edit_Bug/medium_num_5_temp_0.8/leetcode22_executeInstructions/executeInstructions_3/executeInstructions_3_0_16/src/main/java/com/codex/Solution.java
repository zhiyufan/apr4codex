package com.codex;

import java.util.*;

public class Solution {
 public static int[] executeInstructions(int n, int[] startPos, String s) {
        
        int[] answer = new int[startPos.length];
        for (int i = 0; i < startPos.length; i++) {
            int row = 0;
            int col = 0;

            char[] directions = s.substring(i).toCharArray();
            for (int j = 0; j < directions.length; j++) {
                switch (directions[j]) {
                    case 'L': {
                        if (col > 0) {
                            col--;
                        }
                        break;
                    }
                    case 'R': {
                        if (col < n - 1) {
                            col++;
                        }
                        break;
                    }
                    case 'U': {
                        if (row > 0) {
                            row--;
                        }
                        break;
                    }
                    case 'D': {
                        if (row < n - 1) {
                            row++;
                        }
                        break;
                    }
                }
            }
            answer[i] = Math.abs(startPos[i] - row) + Math.abs(startPos[i+1] - col);
        }
        return answer;
    }

    
}