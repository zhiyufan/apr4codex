package com.codex;

import java.util.*;

public class Solution {
    public static int minimumBuckets(String street) {
        

        int minRow = 0;
        int minCol = 0;
        int row = 0;
        int col = 0;
        for(int i = 0; i < street.length(); i++) {
            if(minRow < row)
                minRow = row;
            if(minCol < col)
                minCol = col;
            if(street.charAt(i) == 'W') row++;
            else if(street.charAt(i) == 'D') row--;
            else if(street.charAt(i) == 'S') col--;
            else if(street.charAt(i) == 'A') col++;
        }
        if(minRow < row)
            minRow = row;
        if(minCol < col)
            minCol = col;
        if(minRow < 0) {
            minRow *= -1;
        }
        if(minCol < 0) {
            minCol *= -1;
        }
        if(row < 0) {
            row *= -1;
        }
        if(col < 0) {
            col *= -1;
        }
        if(row > col) {
            return minRow;
        }
        else {
            return minCol;
        }
        return count;
    }


    
}