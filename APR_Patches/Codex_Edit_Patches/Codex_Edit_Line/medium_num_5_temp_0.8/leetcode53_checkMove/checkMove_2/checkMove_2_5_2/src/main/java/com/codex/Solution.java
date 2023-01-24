package com.codex;

import java.util.*;

public class Solution {
public class MyClass {
    
    public static boolean checkMove(char[][] board, int rMove, int cMove, char color) {
        if (board[rMove][cMove] != '.')
            return false;
        int r = rMove, c = cMove;
        while (r > 0 && board[r - 1][c] == (color == 'B' ? 'W' : 'B'))
            r--;
        if (r > 1) {
            r++;
            while (r < board.length && board[r][c] == color)
                r++;
            if (r == board.length || board[r][c] != '.')
                return true;
        }
        r = rMove;
        while (c > 0 && board[r][c - 1] == (color == 'B' ? 'W' : 'B'))
            c--;
        if (c > 1) {
            c++;
            while (c < board.length && board[r][c] == color)
                c++;
            if (c == board.length || board[r][c] != '.')
                return true;
        }
        r = rMove;
        c = cMove;
        while (r > 0 && c > 0 && board[r - 1][c - 1] == (color == 'B' ? 'W' : 'B')) {
            r--;
            c--;
        }
        if (r > 1 && c > 1) {
            r++;
            c++;
            while (r < board.length && c < board.length && board[r][c] == color) {
                r++;
                c++;
            }
            if (r == board.length || c == board.length || board[r][c] != '.')
                return true;
        }
        r = rMove;
        c = cMove;
        while (r > 0 && c < 7 && board[r - 1][c + 1] == (color == 'B' ? 'W' : 'B')) {
            r--;
            c++;
        }
        if (r > 1 && c < 6) {
            r++;
            c--;
            while (r < board.length && c > -1 && board[r][c] == color) {
                r++;
                c--;
            }
            if (r == board.length || c == -1 || board[r][c] != '.')
                return true;
        }
        return false;
    }

    public static void makeMove(char[][] board, int rMove, int cMove, char color) {
        board[rMove][cMove] = color;
        int r = rMove, c = cMove;
        while (r > 0 && board[r - 1][c] == (color == 'B' ? 'W' : 'B'))
            r--;
        if (r > 1) {
            r++;
            while (r < 8 && board[r][c] == color)
                r++;
            if (r == 8 || board[r][c] != '.')
                r = rMove;
            else
                return;
            r--;
            while (r > rMove) {
                board[r][c] = color;
                r--;
            }
        }
        r = rMove;
        while (c > 0 && board[r][c - 1] == (color == 'B' ? 'W' : 'B'))
            c--;
        if (c > 1) {
            c++;
            while (c < 8 && board[r][c] == color)
                c++;
            if (c == 8 || board[r][c] != '.')
                c = cMove;
            else
                return;
            c--;
            while (c > cMove) {
                board[r][c] = color;
                c--;
            }
        }
        r = rMove;
        c = cMove;
        while (r > 0 && c > 0 && board[r - 1][c - 1] == (color == 'B' ? 'W' : 'B')) {
            r--;
            c--;
        }
        if (r > 1 && c > 1) {
            r++;
            c++;
            while (r < 8 && c < 8 && board[r][c] == color) {
                r++;
                c++;
            }
            if (r == 8 || c == 8 || board[r][c] != '.') {
                r = rMove;
                c = cMove;
            } else
                return;
            r--;
            c--;
            while (r > rMove && c > cMove) {
                board[r][c] = color;
                r--;
                c--;
            }
        }
        r = rMove;
        c = cMove;
        while (r > 0 && c < 7 && board[r - 1][c + 1] == (color == 'B' ? 'W' : 'B')) {
            r--;
            c++;
        }
        if (r > 1 && c < 6) {
            r++;
            c--;
            while (r < 8 && c > -1 && board[r][c] == color) {
                r++;
                c--;
            }
            if (r == 8 || c == -1 || board[r][c] != '.') {
                r = rMove;
                c = cMove;
            } else
                return;
            r--;
            c++;
            while (r > rMove && c < cMove) {
                board[r][c] = color;
                r--;
                c++;
            }
        }
    }

}
}