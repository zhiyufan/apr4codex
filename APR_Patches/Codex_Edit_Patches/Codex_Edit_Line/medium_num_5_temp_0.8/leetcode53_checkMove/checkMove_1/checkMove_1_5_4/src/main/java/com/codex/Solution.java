package com.codex;

import java.util.*;

public class Solution {
    public static boolean checkMove(char[][] board, int rMove, int cMove, char playerColor) {
        

        boolean isEligible=false;
        if(board[rMove][cMove]=='.') {
            if ((rMove - 2) > 0 && (cMove - 2) > 0 && board[rMove - 1][cMove - 1] == playerColor && board[rMove - 2][cMove - 2] != playerColor)
                isEligible = true;
            if ((rMove - 2) > 0 && (cMove + 2) < 8 && board[rMove - 1][cMove + 1] == playerColor && board[rMove - 2][cMove + 2] != playerColor)
                isEligible = true;
            if ((rMove + 2) < 8 && (cMove - 2) > 0 && board[rMove + 1][cMove - 1] == playerColor && board[rMove + 2][cMove - 2] != playerColor)
                isEligible = true;
            if ((rMove + 2) < 8 && (cMove + 2) < 8 && board[rMove + 1][cMove + 1] == playerColor && board[rMove + 2][cMove + 2] != playerColor)
                isEligible = true;

            if ((rMove - 3) > 0 && board[rMove - 1][cMove] == playerColor && board[rMove - 2][cMove] != playerColor)
                isEligible = true;
            if ((rMove + 3) < 8 && board[rMove + 1][cMove] == playerColor && board[rMove + 2][cMove] != playerColor)
                isEligible = true;
            if ((cMove - 3) > 0 && board[rMove][cMove - 1] == playerColor && board[rMove][cMove - 2] != playerColor)
                isEligible = true;
            if ((cMove + 3) < 8 && board[rMove][cMove + 1] == playerColor && board[rMove][cMove + 2] != playerColor)
                isEligible = true;
        }
        return isEligible;
    }

    

    
}