package com.codex;

import java.util.*;

public class Solution {
    private boolean validTicTacToe(String[] board) {
        int size = board.length;
        int[] countX = new int[3], countO = new int[3];
         for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                if (board[i].charAt(j) == 'X') {
                    countX[0]++;
                    countX[1] += (i == j ? 1 : 0);
                    countX[2] += (i + j == size - 1 ? 1 : 0);
                }
                else if (board[i].charAt(j) == 'O') {
                    countO[0]++;
                    countO[1] += (i == j ? 1 : 0);
                    countO[2] += (i + j == size - 1 ? 1 : 0);
                }
            }
        }
        for (int i = 0; i < change.length; i++) {
            count_change[change[i]]++;
        }
        for (int i = 9; i >= 0; i--) {
            while (count_change[i] > 0 && count_num[i] > 0) {
                changed.append(i);
                count_num[i]--;
                count_change[i]--;
            }
        }
        for (int i = 0; i < 10; i++) {
            for (int j = count_num[i]; j > 0; j--) {
                number.append(i);
            }
        }
        return changed.length() > 0 ? changed.toString() : number.toString();
    }

    
}