package com.codex;

import java.util.*;

public class Solution {
public static boolean checkMove(char[][] board, int rMove, int cMove, char color) {
        if (board[rMove][cMove] != '.')
            return false;
        // check vertical and horizontal
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
        if (c > 1) {
            c++;
            while (c < 8 && board[r][c] == color)
                c++;
            if (c == 8 || board[r][c] != '.')
                return true;
        }
        // check diagonal
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
}