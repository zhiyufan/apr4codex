package com.codex;

import java.util.*;

public class Solution {
public static int[] executeInstructions(int n, int[] startPos, String s) {

    int[] answer = new int[s.length()];
    int row = startPos[0];
    int col = startPos[1];
    int count = 0;

    char[] directions = s.toCharArray();
    for (int i = 0; i < directions.length; i++) {
        switch (directions[i]) {
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
        answer[i] = count;
    }

    return answer;
}
}