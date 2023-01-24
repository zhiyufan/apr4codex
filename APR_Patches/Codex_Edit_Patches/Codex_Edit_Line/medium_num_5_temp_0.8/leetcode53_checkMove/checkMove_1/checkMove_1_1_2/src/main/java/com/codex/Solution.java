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
        }
        return isEligible;
    }



public static void MakeMove(char [][] board , int rMove , int cMove , char colour ){
        if((rMove - 2) > 0 && (cMove - 2) > 0 && board[rMove - 1][cMove - 1] == colour && board[rMove - 2][cMove - 2] != colour) {
            board[rMove][cMove] = colour;
            board[rMove - 1][cMove - 1] = colour;
        }
        if((rMove - 2) > 0 && (cMove + 2) < 8 && board[rMove - 1][cMove + 1] == colour && board[rMove - 2][cMove + 2] != colour) {
            board[rMove][cMove] = colour;
            board[rMove - 1][cMove + 1] = colour;
        }
        if((rMove + 2) < 8 && (cMove - 2) > 0 && board[rMove + 1][cMove - 1] == colour && board[rMove + 2][cMove - 2] != colour) {
            board[rMove][cMove] = colour;
            board[rMove + 1][cMove - 1] = colour;
        }
        if((rMove + 2) < 8 && (cMove + 2) < 8 && board[rMove + 1][cMove + 1] == colour && board[rMove + 2][cMove + 2] != colour) {
            board[rMove][cMove] = colour;
            board[rMove + 1][cMove + 1] = colour;
        }

        if((rMove - 3) > 0 && board[rMove - 1][cMove] == colour && board[rMove - 2][cMove] != colour) {
            board[rMove][cMove] = colour;
            board[rMove - 1][cMove] = colour;
        }
        if((rMove + 3) < 8 && board[rMove + 1][cMove] == colour && board[rMove + 2][cMove] != colour) {
            board[rMove][cMove] = colour;
            board[rMove + 1][cMove] = colour;
        }
        if((cMove - 3) > 0 && board[rMove][cMove - 1] == colour && board[rMove][cMove - 2] != colour) {
            board[rMove][cMove] = colour;
            board[rMove][cMove - 1] = colour;
        }
        if((cMove + 3) < 8 && board[rMove][cMove + 1] == colour && board[rMove][cMove + 2] != colour) {
            board[rMove][cMove] = colour;
            board[rMove][cMove + 1] = colour;
        }
    }


    
}