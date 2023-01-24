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
                    col =  Math.max(col - 1, 0);
                    count++;
                    break;
                }
                case 'R': {
                    col = Math.min(col + 1, n - 1);
                    count++;
                    break;
                }
                case 'U': {
                    row = Math.max(row - 1, 0);
                    count++;
                    break;
                }
                case 'D': {
                    row = Math.min(row + 1, n - 1);
                    count++;
                    break;
                }
            }
        }
        answer[i] = count;
    }

    return answer;
}
}