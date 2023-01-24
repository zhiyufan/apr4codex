package com.codex;

import java.util.*;

public class Solution {
    public static boolean checkMove(char[][] board, int rMove, int cMove, char color) {
        
        if (board[rMove][cMove] != '.')
            return false;
        int r = rMove, c = cMove;
        while (r > 0 && board[r - 1][c] == (color == 'B' ? 'W' : 'B'))
            r--;
        if (r > 1) {
            r++;
            while (r < 8 && board[r][c] == color)
                r++;
            if (r == 8 || board[r][c] != '.')
                return true;
        }
     
       
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
    }

    
}