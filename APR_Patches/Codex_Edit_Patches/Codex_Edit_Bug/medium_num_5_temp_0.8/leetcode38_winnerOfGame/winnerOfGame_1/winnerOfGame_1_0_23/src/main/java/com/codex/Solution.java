package com.codex;

import java.util.*;

public class Solution {
import java.util.Scanner;

public class Sudoku {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] a = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                a[i][j] = sc.nextInt();
            }
        }
        System.out.println(solve(a, 0, 0, n));
    }

    public static boolean solve(int[][] a, int row, int col, int n) {
        if (row == n) {
            return true;
        }
        if (col == n) {
            return solve(a, row + 1, 0, n);
        }

        if (a[row][col] != 0) {
            return solve(a, row, col + 1, n);
        }

        for (int i = 1; i <= n; i++) {
            if (possible(a, row, col, n, i)) {
                a[row][col] = i;
                if (solve(a, row, col + 1, n)) {
                    return true;
                }
                a[row][col] = 0;
            }
        }
        return false;
    }

    public static boolean possible(int[][] a, int row, int col, int n, int num) {
        for (int i = 0; i < n; i++) {
            if (a[row][i] == num) {
                return false;
            }
        }
        for (int i = 0; i < n; i++) {
            if (a[i][col] == num) {
                return false;
            }
        }

        int x = row / 3;
        int y = col / 3;
        x *= 3;
        y *= 3;

        for (int i = x; i < x + 3; i++) {
            for (int j = y; j < y + 3; j++) {
                if (a[i][j] == num) {
                    return false;
                }
            }
        }
        return true;
    }

    public static boolean winnerOfGame(String colors) {
        
        int i = 0;
        int count = 0;
        while (i < colors.length()) {
            char currentColor = colors.charAt(i);
            if (currentColor == 'A') {
                if (i == colors.length() - 1) {
                    if (i == 1) {
                        if (colors.charAt(i) == colors.charAt(i - 1)) {
                            i -= 2;
                            count++;
                        } else {
                            i--;
                        }
                    } else {
                        if (colors.charAt(i) == colors.charAt(i - 1)) {
                            i -= 2;
                            count++;
                        } else {
                            i = 0;
                        }
                    }
                } else if (i == 0){
                    if (i == colors.length() - 2) {
                        if (colors.charAt(i) == colors.charAt(i + 1)) {
                            i += 2;
                            count++;
                        } else {
                            i++;
                        }
                    } else {
                        if (colors.charAt(i) == colors.charAt(i + 1)) {
                            i += 2;
                            count++;
                        } else {
                            i = colors.length() - 1;
                        }
                    }
                } else {
                    if (colors.charAt(i) == colors.charAt(i - 1) || colors.charAt(i) == colors.charAt(i + 1)) {
                        if (colors.charAt(i) == colors.charAt(i - 1)) {
                            i -= 2;
                        } else {
                            i += 2;
                        }
                        count++;
                    } else {
                        if (i + 1 < colors.length()) {
                            if (colors.charAt(i + 1) == colors.charAt(i + 2)) {
                                i = i + 2;
                            } else {
                                i++;
                            }
                        } else {
                            if (colors.charAt(i - 1) == colors.charAt(i - 2)) {
                                i = i - 2;
                            } else {
                                i--;
                            }
                        }
                    }
                }
            } else {
                i++;
            }
        }
        if (count % 2 == 0) {
            return true;
        } else {
            return false;
        }
}

    
}