package com.codex;

import java.util.*;

public class Solution {
	package schems;

	import java.io.BufferedReader;
	import java.io.IOException;
	import java.io.InputStreamReader;

	public class schems {
		public static void main(String[] args) throws IOException 
		{
			char[][] board = new char[8][8];
			for (int i=0; i<8; i++) {
				board[i] = new char[8];
				for (int j=0; j<8; j++) {
					board[i][j] = '.';
				}
			}
			BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
			char player = 'B';
			board[3][3] = 'W';
			board[3][4] = 'B';
			board[4][3] = 'B';
			board[4][4] = 'W';
			printBoard(board);
			while (true) {
				String[] move = in.readLine().split("[ ]+");
				int rMove = Integer.parseInt(move[0]);
				int cMove = Integer.parseInt(move[1]);
				if (checkMove(board, rMove, cMove, player)) {
					System.out.println("You have selected a valid move");
					board[rMove][cMove] = player;
					//TODO: Flip the tiles
					player = (player == 'W' ? 'B' : 'W');
				} else {
					System.out.println("Invalid move");
				}
			}
		}
		public static void printBoard(char[][] board) {
			for (int i=0; i<8; i++) {
				for (int j=0; j<8; j++) {
					System.out.print(board[i][j] + " ");
				}
				System.out.println();
			}
		}
    public static boolean checkMove(char[][] board, int rMove, int cMove, char color) {
        
        if (board[rMove][cMove] != '.')
            return false;
        int r = rMove, c = cMove;
        while (r > 0 && board[r - 1][c] == (color == 'B' ? 'W' : 'B'))
            r--;
        if (r > 1) {
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
            if (r == 8 || c == 8 || board[r][c] != '.')
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
            while (r < 8 && c > -1 && board[r][c] == color) {
                r++;
                c--;
            }
            if (r == 8 || c == -1 || board[r][c] != '.')
                return true;
        }
        return false;
    }


}
}