package com.codex;

import java.util.*;

public class Solution {
    public boolean isValidSudoku(char[][] board) {
		int r = board.length;
		int c = 0;
		if (r > 0) {
			c = board[0].length;
		}
		int[] v = new int[10];
		for (int i=0; i<r; i++) {
			for (int j=0; j<c; j++) {
				if (board[i][j] != '.') {
					Arrays.fill(v, 0);
					for (int k=0; k<c; k++) {
						if (board[i][k] != '.' && 
							v[Character.getNumericValue(board[i][k])] == 1) {
							return false;
						}	
						v[Character.getNumericValue(board[i][k])] = 1;
					}
					Arrays.fill(v, 0);
					for (int k=0; k<r; k++) {
						if (board[k][j] != '.' &&
							v[Character.getNumericValue(board[k][j])] == 1) {
							return false;
						}
						v[Character.getNumericValue(board[k][j])] = 1;
					}
					Arrays.fill(v, 0);
					int rb = i/3*3;
					int cb = j/3*3;
					for (int r1=rb; r1<rb+3; r1++) {
						for (int c1=cb; c1<cb+3; c1++) {
							if (board[r1][c1] != '.' &&
								v[Character.getNumericValue(board[r1][c1])] == 1) {
								return false;
							}
							v[Character.getNumericValue(board[r1][c1])] = 1;
						}
					}
				}
			}
		}
		return true;
	}
}