package com.codex;

import java.util.*;

public class Solution {
    public static boolean checkMove(char[][] board, int rMove, int cMove, char color) {
        /** You are given a 0-indexed 8 x 8 grid board, where board[r][c] represents the cell (r, c) on a game board. On the board, free cells are represented by '.', white cells are represented by 'W', and black cells are represented by 'B'.
         * Each move in this game consists of choosing a free cell and changing it to the color you are playing as (either white or black). However, a move is only legal if, after changing it, the cell becomes the endpoint of a good line (horizontal, vertical, or diagonal).
         * A good line is a line of three or more cells (including the endpoints) where the endpoints of the line are one color, and the remaining cells in the middle are the opposite color (no cells in the line are free). You can find examples for good lines in the figure below:
         */

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

    /** You are given a 2D grid of characters, and a list of words. Find all occurrences of given words in the grid. Each letter in the grid is adjacent to the letters immediately above, below, left and right of it, if any. The same letter cell may not be used more than once in a word.
     * Example:
     * Input: grid =
     * [
     * 	["a", "b", "c", "a", "f"],
     * 	["o", "g", "c", "i", "n"],
     * 	["a", "b", "c", "d", "e"],
     * 	["a", "b", "c", "e", "f"],
     * 	["h", "i", "j", "k", "l"]
     * ],
     * words = ["abcdef", "cba", "abc", "cbad", "cod", "cab"]
     *
     * Output:
     * [
     * 	["abcdef", [0, 0]],
     * 	["cba", [1, 0]],
     * 	["cba", [4, 0]],
     * 	["abc", [0, 2]],
     * 	["abc", [0, 3]],
     * 	["cbad", [2, 2]],
     * 	["cab", [2, 0]]
     * ]
     *
     * There are 7 occurrences of the words in the grid.
     */

    }