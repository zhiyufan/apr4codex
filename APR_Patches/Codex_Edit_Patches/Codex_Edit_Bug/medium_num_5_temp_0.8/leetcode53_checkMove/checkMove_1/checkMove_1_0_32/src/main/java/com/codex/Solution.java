package com.codex;

import java.util.*;

public class Solution {
public class CheckMoveTest {

    public static void main(String[] args) {
        char[][] board = new char[7][7];
        for (int i = 0; i < 7; i++) {
            for (int j = 0; j < 7; j++) {
                board[i][j] = '.';
            }
        }
        board[2][2] = 'w';
        board[3][3] = 'b';
        board[1][1] = 'w';
        board[3][1] = 'b';
        board[1][3] = 'w';
        board[1][5] = 'w';
        board[2][4] = 'b';
        board[5][5] = 'w';
        CheckMove.checkMove(board,4,4,'w');
    }
}

    public static boolean checkMove(char[][] board, int rMove, int cMove, char color) {
        if (board[rMove][cMove] == '.') {
            for (int i = 0; i < 7; i++) {
                for (int j = 0; j < 7; j++) {
                    System.out.print(board[i][j] + " ");
                }
                System.out.println();
            }
            System.out.println();
            if ((rMove - 2) > 0
                    && (cMove - 2) > 0
                    && board[rMove - 1][cMove - 1] == color
                    && board[rMove - 2][cMove - 2] != color) {
                board[rMove][cMove] = color;
                board[rMove - 2][cMove - 2] = color;
                board[rMove - 1][cMove - 1] = '.';
                return true;
            }
            if ((rMove - 2) > 0
                    && (cMove + 2) < 7
                    && board[rMove - 1][cMove + 1] == color
                    && board[rMove - 2][cMove + 2] != color) {
                board[rMove][cMove] = color;
                board[rMove - 2][cMove + 2] = color;
                board[rMove - 1][cMove + 1] = '.';
                return true;
            }
            if ((rMove + 2) < 7
                    && (cMove - 2) > 0
                    && board[rMove + 1][cMove - 1] == color
                    && board[rMove + 2][cMove - 2] != color) {
                board[rMove][cMove] = color;
                board[rMove + 2][cMove - 2] = color;
                board[rMove + 1][cMove - 1] = '.';
                return true;
            }
            if ((rMove + 2) < 7
                    && (cMove + 2) < 7
                    && board[rMove + 1][cMove + 1] == color
                    && board[rMove + 2][cMove + 2] != color) {
                board[rMove][cMove] = color;
                board[rMove + 2][cMove + 2] = color;
                board[rMove + 1][cMove + 1] = '.';
                return true;
            }
            if ((rMove - 3) > 0 && board[rMove - 1][cMove] == color && board[rMove - 2][cMove] != color) {
                board[rMove][cMove] = color;
                board[rMove - 2][cMove] = color;
                board[rMove - 1][cMove] = '.';
                return true;
            }
            if ((rMove + 3) < 7 && board[rMove + 1][cMove] == color && board[rMove + 2][cMove] != color) {
                board[rMove][cMove] = color;
                board[rMove + 2][cMove] = color;
                board[rMove + 1][cMove] = '.';
                return true;
            }
            if ((cMove - 3) > 0 && board[rMove][cMove - 1] == color && board[rMove][cMove - 2] != color) {
                board[rMove][cMove] = color;
                board[rMove][cMove - 2] = color;
                board[rMove][cMove - 1] = '.';
                return true;
            }
            if ((cMove + 3) < 7 && board[rMove][cMove + 1] == color && board[rMove][cMove + 2] != color) {
                board[rMove][cMove] = color;
                board[rMove][cMove + 2] = color;
                board[rMove][cMove + 1] = '.';
                return true;
            }
        }
        return false;
    }

}

    
}