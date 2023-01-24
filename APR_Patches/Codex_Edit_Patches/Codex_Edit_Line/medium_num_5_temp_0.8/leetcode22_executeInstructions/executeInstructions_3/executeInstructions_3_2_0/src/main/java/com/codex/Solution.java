package com.codex;

import java.util.*;

public class Solution {
    static int[] executeInstructions(int n, int[] startPos, String s) {
        int[] answer = new int[s.length()];
        int currPos[] = startPos;
        int count = 0;
        char[] directions = s.toCharArray();
        for (char d : directions) {
            switch (d) {
                case 'L':
                    if ((currPos[1] - 1) >= 0) {
                        currPos[1]--;
                        count++;
                    }
                    break;
                case 'R':
                    if ((currPos[1] + 1) < n) {
                        currPos[1]++;
                        count++;
                    }
                    break;
                case 'U':
                    if ((currPos[0] - 1) >= 0) {
                        currPos[0]--;
                        count++;
                    }
                    break;
                case 'D':
                    if ((currPos[0] + 1) < n) {
                        currPos[0]++;
                        count++;
                    }
                    break;
            }
            answer[count - 1] = count;
        }
        return answer;
    }


















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
                            count++;
                        }
                        break;
                    }
                    case 'R': {
                        if (col < n - 1) {
                            col++;
                            count++;
                        }
                        break;
                    }
                    case 'U': {
                        if (row > 0) {
                            row--;
                            count++;
                        }
                        break;
                    }
                    case 'D': {
                        if (row < n - 1) {
                            row++;
                            count++;
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