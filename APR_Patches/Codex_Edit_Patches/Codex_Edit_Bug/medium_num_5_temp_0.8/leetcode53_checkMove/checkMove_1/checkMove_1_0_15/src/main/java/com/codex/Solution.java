package com.codex;

import java.util.*;

public class Solution {
    public static boolean isValid(char[][] board, int rMove, int cMove) {

        boolean isValid=false;
     
        if(rMove>=0 && rMove<board.length && cMove>=0 && cMove<board[0].length && board[rMove][cMove]=='.')
            isValid=true;

        return isValid;
    }

    public static boolean checkMove(char[][] board, int rMove, int cMove, char color) {
        

        boolean isEligible=false;
        if(board[rMove][cMove]=='.') {
            if ((rMove - 2) > 0 && (cMove - 2) > 0 && board[rMove - 1][cMove - 1] == color && board[rMove - 2][cMove - 2] != color)
                isEligible = true;
            if ((rMove - 2) > 0 && (cMove + 2) < 8 && board[rMove - 1][cMove + 1] == color && board[rMove - 2][cMove + 2] != color)
                isEligible = true;
            if ((rMove + 2) < 8 && (cMove - 2) > 0 && board[rMove + 1][cMove - 1] == color && board[rMove + 2][cMove - 2] != color)
                isEligible = true;
            if ((rMove + 2) < 8 && (cMove + 2) < 8 && board[rMove + 1][cMove + 1] == color && board[rMove + 2][cMove + 2] != color)
                isEligible = true;

            if ((rMove - 3) > 0 && board[rMove - 1][cMove] == color && board[rMove - 2][cMove] != color)
                isEligible = true;
            if ((rMove + 3) < 8 && board[rMove + 1][cMove] == color && board[rMove + 2][cMove] != color)
                isEligible = true;
            if ((cMove - 3) > 0 && board[rMove][cMove - 1] == color && board[rMove][cMove - 2] != color)
                isEligible = true;
            if ((cMove + 3) < 8 && board[rMove][cMove + 1] == color && board[rMove][cMove + 2] != color)
                isEligible = true;

            if ((rMove - 3) > 0 && (cMove - 3) > 0 && board[rMove - 1][cMove - 1] == color && board[rMove - 2][cMove - 2] != color)
                isEligible = true;
            if ((rMove + 3) < 8 && (cMove + 3) < 8 && board[rMove + 1][cMove + 1] == color && board[rMove + 2][cMove + 2] != color)
                isEligible = true;
            if ((rMove - 3) > 0 && (cMove + 3) < 8 && board[rMove - 1][cMove + 1] == color && board[rMove - 2][cMove + 2] != color)
                isEligible = true;
            if ((rMove + 3) < 8 && (cMove - 3) > 0 && board[rMove + 1][cMove - 1] == color && board[rMove + 2][cMove - 2] != color)
                isEligible = true;
        }
        else
            isEligible=false;
            return isEligible;
    }

    

    
}