package com.codex;

import java.util.*;

public class Solution {
    public static int[] executeInstructions(int n, int[] startPos, String s) {
        
        int[] answer = new int[s.length()];
        for (int i = 0; i < s.length(); i++) {
            int row = startPos[0], col = startPos[1], count = 0;

            for (int j = i; j < n; j++) {
                char character = s.charAt(j);

                if (col > 0 && character == 'L')
                    col -= 1;
                else if (col < n - 1 && character == 'R')
                    col += 1;
                else if (row > 0 && character == 'U')
                    row -= 1;
                else if (row < n - 1 && character == 'D')
                    row += 1;

                if (row == startPos[0] && col == startPos[1]) {
                    count = j - i + 1;
                    break;
                }
            }
            answer[i] = count;
        }
        return answer;
    }

    
}