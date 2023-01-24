package com.codex;

import java.util.*;

public class Solution {
    public static boolean checkMove(char[][] board, int rMove, int cMove, char color) {
        

        boolean isEligible=false;
        if(board[rMove][cMove]=='.') {
            if ((rMove - 2) > 0 && (cMove - 2) > 0 && board[rMove - 1][cMove - 1] == color && board[rMove - 2][cMove - 2] != color)
                isEligible = true;
            if ((rMove - 2) > 0 && (cMove + 2) < 8 && board[rMove - 1][cMove + 1] == color && board[rMove - 2][cMove + 2] != color)
                isEligible = true;
            if ((rMove + 2) < 8 && (cMove - 2) > 0 && board[rMove + 1][cMove - 1] == color && board[rMove + 2][cMove - 2] != color)
                isEligible = true;
            if ((rMove + 2) < 8 && (cMove - 2) < 8 && board[rMove + 1][cMove - 1] == color && board[rMove + 2][cMove - 2] != color)
                isEligible = true;

            if ((rMove - 3) > 0 && board[rMove - 1][cMove] == color && board[rMove - 2][cMove] != color)
                isEligible = true;
            if ((rMove + 3) < 8 && board[rMove + 1][cMove] == color && board[rMove + 2][cMove] != color)
                isEligible = true;
            if ((cMove - 3) > 0 && board[rMove][cMove - 1] == color && board[rMove][cMove - 2] != color)
                isEligible = true;
            if ((cMove + 3) < 8 && board[rMove][cMove + 1] == color && board[rMove][cMove + 2] != color)
                isEligible = true;
        }
        return isEligible;
    }

    private boolean isEligible(char[][] board, int i, int j, char color) {
        if(board[i][j] != '.') return false;
        if(isMoveEligible(board,i-1,j-1,color)) return true;
        if(isMoveEligible(board,i-1,j+1,color)) return true;
        if(isMoveEligible(board,i+1,j-1,color)) return true;
        if(isMoveEligible(board,i+1,j+1,color)) return true;

        if(isMoveEligible(board,i,j-1,color)) return true;
        if(isMoveEligible(board,i,j+1,color)) return true;
        if(isMoveEligible(board,i+1,j,color)) return true;
        if(isMoveEligible(board,i-1,j,color)) return true;

        return false;
    }

    private boolean isMoveEligible(char[][] board,int i,int j,char color){
        if(i<0 || i>7 || j<0 || j>7) return false;
        if(board[i][j] == color) return true;
        else return false;
    }
}

    
}