package com.codex;

import java.util.*;

public class Solution {
public class Main {

    public static void main(String[] args) {
        int[] one = {1,2,3,4,5,6,7,8,9};
        int[][] result = Main.construct2DArray(one, 3, 3);
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(result[i][j] + "\t");
            }
            System.out.println();
        }
    }   

    public static int[][] construct2DArray(int[] original, int m, int n) {
        
        int[][] result = new int[m][n];
        if (original.length != m * n) return result;
        int count = 0;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                result[i][j] = original[count];
                count++;
            }
        }
        return result;
    }

}
}