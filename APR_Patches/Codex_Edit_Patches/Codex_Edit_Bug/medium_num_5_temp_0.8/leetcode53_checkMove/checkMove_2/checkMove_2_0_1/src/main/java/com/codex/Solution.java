package com.codex;

import java.util.*;

public class Solution {
    public static void main(String[] args) {
        char[][] board = new char[8][8];
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                board[i][j] = '.';
            }
        }
        board[3][3] = 'W';
        board[3][4] = 'B';
        board[4][3] = 'B';
        board[4][4] = 'W';
        System.out.println(checkMove(board, 2, 3, 'B'));
        System.out.println(checkMove(board, 5, 2, 'B'));
        System.out.println(checkMove(board, 2, 5, 'W'));
        System.out.println(checkMove(board, 5, 2, 'W'));
        System.out.println(checkMove(board, 2, 4, 'B'));
        System.out.println(checkMove(board, 5, 3, 'W'));
    }

    public static boolean checkMove(char[][] board, int rMove, int cMove, char color) {
        
        if (board[rMove][cMove] != '.')
            return false;
        int r = rMove, c = cMove;
        while (r > 0 && board[r - 1][c] == (color == 'B' ? 'W' : 'B'))
            r--;
        if (r > 0) {
            r++;
            while (r < 8 && board[r][c] == color)
                r++;
            if (r == 8 || board[r][c] != '.')
                return true;
        }
        r = rMove;
        while (c > 0 && board[r][c - 1] == (color == 'B' ? 'W' : 'B'))
            c--;
        if (c > 0) {
            c++;
            while (c < 8 && board[r][c] == color)
                c++;
            if (c == 8 || board[r][c] != '.')
                return true;
        }
        r = rMove;
        c = cMove;
        while (r > 0 && c > 0 && board[r - 1][c - 1] == (color == 'B' ? 'W' : 'B')) {
            r--;
            c--;
        }
        if (r > 0 && c > 0) {
            r++;
            c++;
            while (r < 8 && c < 8 && board[r][c] == color) {
                r++;
                c++;
            }
            if (r == 8 || c == 8 || board[r][c] != '.')
                return true;
        }
        r = rMove;
        c = cMove;
        while (r > 0 && c < 7 && board[r - 1][c + 1] == (color == 'B' ? 'W' : 'B')) {
            r--;
            c++;
        }
        if (r > 0 && c < 7) {
            r++;
            c--;
            while (r < 8 && c > 0 && board[r][c] == color) {
                r++;
                c--;
            }
            if (r == 8 || c == 0 || board[r][c] != '.')
                return true;
        }
        return false;
    }

}