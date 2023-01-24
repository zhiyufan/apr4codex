package com.codex;

import java.util.*;

public class Solution {
    public static int[] executeInstructions(int n, int[] startPos, String s) {
        
        int[] answer = new int[s.length()];
        for (int i = 0; i < s.length(); i++) {
            int row = startPos[0];
            int col = startPos[1];
            int count = 0;
            boolean flag = true;

            char[] directions = s.substring(i).toCharArray();
            for (int j = 0; j < directions.length; j++) {
                if (directions[j] == 'L' && col > 0) {
                    col--;
                    count++;
                } else if (directions[j] == 'R' && col < n - 1) {
                    col++;
                    count++;
                } else if (directions[j] == 'U' && row > 0) {
                    row--;
                    count++;
                } else if (directions[j] == 'D' && row < n - 1) {
                    row++;
                    count++;
                }
                else{
                    flag = false;
                    break;
                }
            }
            if (flag)
                answer[i] = count;
            else
                answer[i] = -1;

        }
        return answer;
    }
}