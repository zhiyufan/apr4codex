package com.codex;

import java.util.*;

public class Solution {
    public static boolean checkMove(char[][] board, int rMove, int cMove, char color) {
        /** You are given a 0-indexed 8 x 8 grid board, where board[r][c] represents the cell (r, c) on a game board. On the board, free cells are represented by '.', white cells are represented by 'W', and black cells are represented by 'B'.
         * Each move in this game consists of choosing a free cell and changing it to the color you are playing as (either white or black). However, a move is only legal if, after changing it, the cell becomes the endpoint of a good line (horizontal, vertical, or diagonal).
         * A good line is a line of three or more cells (including the endpoints) where the endpoints of the line are one color, and the remaining cells in the middle are the opposite color (no cells in the line are free). You can find examples for good lines in the figure below:
         */
        return (hasHorizontal(board, rMove, cMove, color) ||
                hasVertical(board, rMove, cMove, color) ||
                hasDiagonal(board, rMove, cMove, color));
    }

    private static boolean hasHorizontal(char[][] board, int rMove, int cMove, char color) {
        boolean result = false;
        if(rMove >= 0 && rMove <= 5){
            int count = 1, i = cMove-1, j = cMove+1;
            while(i >= 0 && board[rMove][i] == color) {
                count++;
                i--;
            }
            while(j < 8 && board[rMove][j] == color) {
                count++;
                j++;
            }
            if(count >= 3) {
                result = true;
            }
        }
        return result;
    }

    private static boolean hasVertical(char[][] board, int rMove, int cMove, char color) {
        boolean result = false;
        if(cMove >= 0 && cMove <= 5){
            int count = 1, i = rMove-1, j = rMove+1;
            while(i >= 0 && board[i][cMove] == color) {
                count++;
                i--;
            }
            while(j < 8 && board[j][cMove] == color) {
                count++;
                j++;
            }
            if(count >= 3) {
                result = true;
            }
        }
        return result;
    }

    private static boolean hasDiagonal(char[][] board, int rMove, int cMove, char color) {
        boolean result = false;
        if(rMove >= 0 && rMove <= 5) {
            int count = 1, i = rMove-1, j = rMove+1, k = cMove-1, l = cMove+1;
            while(i >= 0 && k >= 0 && board[i][k] == color) {
                count++;
                i--;
                k--;
            }
            while(j < 8 && l < 8 && board[j][l] == color) {
                count++;
                j++;
                l++;
            }
            if(count >= 3) {
                result = true;
            }
        }
        if(rMove >= 2 && rMove <= 7) {
            int count = 1, i = rMove-1, j = rMove+1, k = cMove-1, l = cMove+1;
            while(i >= 0 && l < 8 && board[i][l] == color) {
                count++;
                i--;
                l++;
            }
            while(j < 8 && k >= 0 && board[j][k] == color) {
                count++;
                j++;
                k--;
            }
            if(count >= 3) {
                result = true;
            }
        }
        return result;
    }

    /*
    https:}