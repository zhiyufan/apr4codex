package com.codex;

import java.util.*;

public class Solution {
    public static int[] executeInstructions(int x, int y, int n, String s) {
        int[] answer = new int[s.length()];
        for (int i = 0; i < s.length(); i++) {
            int row = x;
            int col = y;
            int count = 0;

            char[] directions = s.substring(i).toCharArray();
            for (int j = 0; j < directions.length; j++) {
                switch (directions[j]) {
                    case 'L': {
                        col--;
                        count++;
                        break;
                    }
                    case 'R': {
                        col++;
                        count++;
                        break;
                    }
                    case 'U': {
                        row--;
                        count++;
                        break;
                    }
                    case 'D': {
                        row++;
                        count++;
                        break;
                    }
                }
                if (isOut(row, col, n)) {
                    break;
                }
            }
            answer[i] = count;
        }
        return answer;
    }

    
}