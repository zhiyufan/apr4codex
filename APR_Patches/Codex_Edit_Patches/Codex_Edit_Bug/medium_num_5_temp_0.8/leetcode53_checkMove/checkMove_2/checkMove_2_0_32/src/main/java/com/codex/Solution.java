package com.codex;

import java.util.*;

public class Solution {
import java.util.Scanner;

public class Reversi {
    public static void main(String[] args) {
        char[][] board = new char[8][8];
        Scanner input = new Scanner(System.in);
        int rMove = 0, cMove = 0;
        char color = 'B';
        
        for (int i = 0; i < 8; i++)
            board[i] = input.nextLine().toCharArray();
        while (input.hasNext()) {
            rMove = input.nextInt();
            cMove = input.nextInt();
            color = input.next().charAt(0);
            if (checkMove(board, rMove, cMove, color)) {
                board[rMove][cMove] = color;
                
            }
        }
        for (int i = 0; i < 8; i++)
            for (int j = 0; j < 8; j++)
                System.out.print(board[i][j] + " ");
    }
    
    public static boolean checkMove(char[][] board, int rMove, int cMove, char color) {        
        
        if (board[rMove][cMove] != '.')
            return false;
        int r = rMove, c = cMove;
        while (rMove > 0 && board[r - 1][c] == (color == 'B' ? 'W' : 'B'))
            r--;
        if (r > 0) {
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