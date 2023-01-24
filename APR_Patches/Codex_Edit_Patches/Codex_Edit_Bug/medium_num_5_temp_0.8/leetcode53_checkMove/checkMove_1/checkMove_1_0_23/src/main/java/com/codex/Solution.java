package com.codex;

import java.util.*;

public class Solution {

public class Dames {
    public static boolean checkMove(char[][] board, int rMove, int cMove, char color) {


        boolean isEligible=false;
        if(board[rMove][cMove]=='.' && color=='b') {
            if ((rMove - 2) > 0 && (cMove - 2) > 0 && board[rMove - 1][cMove - 1] == color && board[rMove - 2][cMove - 2] == 'w')
                isEligible = true;
            if ((rMove - 2) > 0 && (cMove + 2) < 8 && board[rMove - 1][cMove + 1] == color && board[rMove - 2][cMove + 2] == 'w')
                isEligible = true;
            if ((rMove + 2) < 8 && (cMove + 2) < 8 && board[rMove + 1][cMove + 1] == color && board[rMove + 2][cMove + 2] == 'w')
                isEligible = true;
            if ((rMove + 2) < 8 && (cMove - 2) > 0 && board[rMove + 1][cMove - 1] == color && board[rMove + 2][cMove - 2] == 'w')
                isEligible = true;

            if ((rMove - 3) > 0 && board[rMove - 1][cMove] == color && board[rMove - 2][cMove] == 'w')
                isEligible = true;
            if ((rMove + 3) < 8 && board[rMove + 1][cMove] == color && board[rMove + 2][cMove] == 'w')
                isEligible = true;
            if ((cMove - 3) > 0 && board[rMove][cMove - 1] == color && board[rMove][cMove - 2] == 'w')
                isEligible = true;
            if ((cMove + 3) < 8 && board[rMove][cMove + 1] == color && board[rMove][cMove + 2] == 'w')
                isEligible = true;
        }
        if(board[rMove][cMove]=='.' && color=='w') {
            if ((rMove - 2) > 0 && (cMove - 2) > 0 && board[rMove - 1][cMove - 1] == color && board[rMove - 2][cMove - 2] == 'b')
                isEligible = true;
            if ((rMove - 2) > 0 && (cMove + 2) < 8 && board[rMove - 1][cMove + 1] == color && board[rMove - 2][cMove + 2] == 'b')
                isEligible = true;
            if ((rMove + 2) < 8 && (cMove + 2) < 8 && board[rMove + 1][cMove + 1] == color && board[rMove + 2][cMove + 2] == 'b')
                isEligible = true;
            if ((rMove + 2) < 8 && (cMove - 2) > 0 && board[rMove + 1][cMove - 1] == color && board[rMove + 2][cMove - 2] == 'b')
                isEligible = true;

            if ((rMove - 3) > 0 && board[rMove - 1][cMove] == color && board[rMove - 2][cMove] == 'b')
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

    

    
}