package com.codex;

import java.util.*;

public class Solution {
    public static int[] executeInstructions(int n, int[] startPos, String s) {
        
        int[] answer = new int[s.length()];
        for (int i = 0; i < s.length(); i++) {
            int row = startPos[0];
            int col = startPos[1];
            int count = 0;

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
            answer[i] = count;
        }
        return answer;
    }

    
}