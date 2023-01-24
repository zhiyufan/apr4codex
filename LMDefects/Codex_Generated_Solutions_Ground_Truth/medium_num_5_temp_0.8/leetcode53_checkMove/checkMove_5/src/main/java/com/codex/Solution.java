package com.codex;

import java.util.*;

public class Solution {
    public static boolean checkMove(char[][] board, int rMove, int cMove, char color) {
        /** You are given a 0-indexed 8 x 8 grid board, where board[r][c] represents the cell (r, c) on a game board. On the board, free cells are represented by '.', white cells are represented by 'W', and black cells are represented by 'B'.
         * Each move in this game consists of choosing a free cell and changing it to the color you are playing as (either white or black). However, a move is only legal if, after changing it, the cell becomes the endpoint of a good line (horizontal, vertical, or diagonal).
         * A good line is a line of three or more cells (including the endpoints) where the endpoints of the line are one color, and the remaining cells in the middle are the opposite color (no cells in the line are free). You can find examples for good lines in the figure below:
         */
        if (rMove < 0 || rMove > 7 || cMove < 0 || cMove > 7) {
            return false;
        }
        if (board[rMove][cMove] != '.') {
            return false;
        }
        int[] firstCoord = new int[]{rMove - 2, rMove - 1, rMove + 1, rMove + 2};
        int[] secondCoord = new int[]{cMove - 2, cMove - 1, cMove + 1, cMove + 2};
        for (int i = 0; i < firstCoord.length; i++) {
            int r = firstCoord[i];
            if (r >= 0 && r < 8) {
                for (int j = 0; j < secondCoord.length; j++) {
                    int c = secondCoord[j];
                    if (c >= 0 && c < 8) {
                        char ch = board[r][c];
                        if (ch == color) {
                            int colorCount = 0;
                            int otherColorCount = 0;
                            int[] rowIncrement = new int[]{rMove - r, rMove - r};
                            int[] colIncrement = new int[]{cMove - c, cMove - c};
                            int k = 0;
                            while (k < 2) {
                                int row = r + rowIncrement[k];
                                int col = c + colIncrement[k];
                                if (row >= 0 && row < 8 && col >= 0 && col < 8) {
                                    char cellValue = board[row][col];
                                    if (cellValue == color) {
                                        colorCount++;
                                    } else if (cellValue == '.') {
                                        }