package com.codex;

import java.util.*;

public class Solution {
int numberOfOperations = 0;
    public static int minOperations(int[][] grid, int x) {
        int numberOfOperations = 0; //должно быть вне цикла
        for (int i = 0; i < grid.length; i++) { //почему не для каждого grid[0][i]?
            for (int j = 0; j < grid[0].length; j++) { //зачем оба прохода?
                if (grid[i][j] == x) continue; //не понял, зачем это в коде, если условие не от него зависит
                if (grid[i][j] < x) { 
                    if ((x - grid[i][j]) % x != 0) return -1; //для меньшего числа должно быть через -, чтобы не было отрицательного  значения, а не через +
                    numberOfOperations += (x - grid[i][j]) / x; 
                } else { //почему для числа, которое больше, не нужно проверять на 
                    if ((grid[i][j] - x) % x != 0)  return -1;
                    numberOfOperations += (grid[i][j] - x) / x; //через x из предыдущей итерации? 
                }
            }
        }
        return numberOfOperations;
    }

    
}