package com.codex;

import java.util.*;

public class Solution {
    public static void main(String args[]) {

        Scanner keyboardInput = new Scanner(System.in);
        char[][] board = new char[8][8];
        for (int i = 0; i < 8; i++)
            for (int j = 0; j < 8; j++)
                board[i][j] = '.';

        int rMove, cMove;
        char color = 'B';
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 4; j++) {
                board[i][j * 2 + 1] = 'B';
                board[i + 5][j * 2] = 'W';
            }
        }

        boolean isDone = false, isMoved = false;
        int nB, nW;
        nB = nW = 0;
        while (!isDone) {
            nB = 0;
            nW = 0;
            printBoard(board);
            do {
                System.out.printf("%c player move (row column):", color);
                rMove = keyboardInput.nextInt();
                cMove = keyboardInput.nextInt();
                isMoved = checkMove(board, rMove, cMove, color);
            } while (isMoved == false);

            move(board, rMove, cMove, color);

            for (int i = 0; i < 8; i++)
                for (int j = 0; j < 8; j++) {
                    if (board[i][j] == 'B')
                        nB++;
                    else if (board[i][j] == 'W')
                        nW++;
                }
            
            if (nB * nW == 0) {
    
                if (nW > nB)
                    System.out.println("W Won");
                else
                    System.out.println("B Won");
                isDone = true;
            }

            if (color == 'B')
                color = 'W';
            else
                color = 'B';
        }
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
        }
        return isEligible;
    }    
}