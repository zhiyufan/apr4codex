package com.codex;

import java.util.*;

public class Solution {
    public static int[] executeInstructions(int n, int[] startPosition, String s) {
        // Write your code here
        int[] result = new int[2];
        int row = startPosition[0]; //row
        int col = startPosition[1]; //col
        int numberOfRows = n;
        int numberOfCols = n;
        int count = 0;
        for(int i = 0; i < s.length(); i++) {
            char current = s.charAt(i);
            if(current == 'L') {
                col--;
                if(col < 0) {
                    result[0] = row;
                    result[1] = count;
                    break;
                }
            } else if(current == 'R') {
                col++;
                if(col > numberOfCols - 1) {
                    result[0] = row;
                    result[1] = count;
                    break;
                }
            } else if(current == 'U') {
                row--;
                if(row < 0) {
                    result[0] = row;
                    result[1] = count;
                    break;
                }
            } else if(current == 'D') {
                row++;
                if(row > numberOfRows - 1) {
                    result[0] = row;
                    result[1] = count;
                    break;
                }
            }
            result[i] = count;
        }
        return result;
    }

    
}