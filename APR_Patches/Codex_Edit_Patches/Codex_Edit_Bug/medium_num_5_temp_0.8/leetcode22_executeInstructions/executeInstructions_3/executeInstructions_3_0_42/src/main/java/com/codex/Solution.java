package com.codex;

import java.util.*;

public class Solution {
    public static int[] executeInstructions(int n, int[] startPos, String s) {
        
        int count = 0;
        int row = startPos[0];
        int col = startPos[1];

        for (int i = 0; i < s.length(); i++) {
            switch (s.charAt(i)) {
                case 'L': {
                    if (col > 0) {
                        col--;
                        count++;
                    }
                }
                case 'R': {
                    if (col < n - 1) {
                        col++;
                        count++;
                    }
                }
                case 'U': {
                    if (row > 0) {
                        row--;
                        count++;
                    }
                }
                case 'D': {
                    if (row < n - 1) {
                        row++;
                        count++;
                    }
                }
            }
        }
        return count;
    }
}