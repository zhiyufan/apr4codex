package com.codex;

import java.util.*;

public class Solution {
    public static boolean checkMove(char[][] board, int rMove, int cMove, char color) {
        /** You are given a 0-indexed 8 x 8 grid board, where board[r][c] represents the cell (r, c) on a game board. On the board, free cells are represented by '.', white cells are represented by 'W', and black cells are represented by 'B'.
         * Each move in this game consists of choosing a free cell and changing it to the color you are playing as (either white or black). However, a move is only legal if, after changing it, the cell becomes the endpoint of a good line (horizontal, vertical, or diagonal).
         * A good line is a line of three or more cells (including the endpoints) where the endpoints of the line are one color, and the remaining cells in the middle are the opposite color (no cells in the line are free). You can find examples for good lines in the figure below:
         */
        char[][] b = new char[8][8];
        for(int i = 0; i < 8; i++){
            for(int j = 0; j < 8; j++){
                b[i][j] = board[i][j];
            }
        }
        if(b[rMove][cMove] != '.') return false;
        b[rMove][cMove] = color;
        if(!checkLine(b, rMove, cMove, -1, -1, color)){
            return false;
        }

        if(!checkLine(b, rMove, cMove, -1, 0, color)){
            return false;
        }

        if(!checkLine(b, rMove, cMove, -1, 1, color)){
            return false;
        }

        if(!checkLine(b, rMove, cMove, 0, -1, color)){
            return false;
        }

        if(!checkLine(b, rMove, cMove, 0, 1, color)){
            return false;
        }

        if(!checkLine(b, rMove, cMove, 1, -1, color)){
            return false;
        }

        if(!checkLine(b, rMove, cMove, 1, 0, color)){
            return false;
        }

        if(!checkLine(b, rMove, cMove, 1, 1, color)){
            return false;
        }

        return false;
    }

    }