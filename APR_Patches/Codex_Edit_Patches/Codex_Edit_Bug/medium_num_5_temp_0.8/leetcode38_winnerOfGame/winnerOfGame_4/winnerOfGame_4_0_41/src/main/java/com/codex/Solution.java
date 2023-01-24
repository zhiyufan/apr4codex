package com.codex;

import java.util.*;

public class Solution {
public class Game {

    public static void main(String[] args) {
        char[][] table = new char[8][9];
        table[2][2] = 'R';
        table[2][3] = 'R';
        table[2][4] = 'R';
        table[2][5] = 'R';
        table[2][6] = 'B';
        table[2][7] = 'B';

        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 9; j++) {
                System.out.print(table[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static int win(char[][] table) {

        for (int i = 0; i < table.length; i++) {
            for (int j = 0; j < table[i].length; j++) {
                if (table[i][j] != 0) {
                    if (fifthInARow(table, i, j) || fifthInAColumn(table, i, j) || fifthInADiagonal(table, i, j)) {
                        return table[i][j];
                    }
                }
            }
        }
        return 0;
    }

    private static boolean fifthInADiagonal(char[][] table, int i, int j) {
        int count = 1;
        int row = i;
        int col = j;
        int maxDiagonalLength = Math.min(table.length - i, j + 1);
        while (count < 5 && maxDiagonalLength > 0) {
            maxDiagonalLength--;
            if (table[row][col] == table[row + 1][col - 1]) {
                count++;
            } else {
                break;
            }
        }
        if (count == 5) {
            return true;
        } else {
            count = 1;
            row = i;
            col = j;
            maxDiagonalLength = Math.min(table.length - i, table[i].length - j);
            while (count < 5 && maxDiagonalLength > 0) {
                maxDiagonalLength--;
                if (table[row][col] == table[row + 1][col + 1]) {
                    count++;
                } else {
                    break;
                }
            }
        }

    private static boolean fifthInAColumn(char[][] table, int i, int j) {
        int count = 1;
        int row = i;
        int col = j;
        while (count < 5 && row < table.length - 1) {
            row++;
            if (table[row][col] == table[row - 1][col]) {
                count++;
            } else {
                break;
            }
        }
        return count == 5;
    }

    private static boolean fifthInARow(char[][] table, int i, int j) {
        int count = 1;
        int row = i;
        int col = j;
        while (count < 5 && col < table[i].length - 1) {
            col++;
            if (table[row][col] == table[row][col - 1]) {
                count++;
            } else {
                break;
            }
        }
        return count == 5;
    }
}
        return count == 5;
    }
}