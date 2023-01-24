package com.codex;

import java.util.*;

public class Solution {
public static int[] executeInstructions(int n, int[] startPos, String s) {
    int[] answer = new int[s.length()];
    int row = startPos[0];
    int col = startPos[1];

    for (int i = 0; i < s.length(); i++) {
        char d = s.charAt(i);
        int prevRow = row;
        int prevCol = col;

        switch (d) {
            case 'L': col--;
                break;
            case 'R': col++;
                break;
            case 'U': row--;
                break;
            case 'D': row++;
                break;
        }
        if (row < 0 || row >= n || col < 0 || col >= n) {
            row = prevRow;
            col = prevCol;
        }
        answer[i] = row * n + col;
    }

    for (int i = 0; i < s.length(); i++) {
        answer[i] = answer[i] - startPos[0] * n - startPos[1];
        answer[i] = answer[i] > 0 ? answer[i] : 0;
    }
    return answer;
}

/*
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
                    }
                    break;
                }
                case 'R': {
                    if (col < n - 1) {
                        col++;
                        count++;
                    }
                    }
                    break;
                }
                case 'U': {
                    if (row > 0) {
                        row--;
                        count++;
                    }
                    }
                    break;
                }
                case 'D': {
                    if (row < n - 1) {
                        row++;
                        count++;
                    }
                }
            }
            answer[i] = count;
        }
        return answer;
    }

    
}