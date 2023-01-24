package com.codex;

import java.util.*;

public class Solution {
    public static int minDeletion(int[] nums) {
        


        int[] oddList = new int[nums.length];
        int[] evenList = new int[nums.length];
        int oddIndex = 0;
        int evenIndex = 0;
        for (int i = 0; i < nums.length; i++) {
            if (i % 2 == 0) {
                evenList[evenIndex++] = nums[i];
            } else {
                oddList[oddIndex++] = nums[i];
            }
        }

        int oddCount = 0;
        int evenCount = 0;
        for (int i = 0; i < nums.length; i++) {
            if (i % 2 == 0) {
                if (evenCount > 1) {
                    evenList[i - 1] = evenList[i];
                }
                evenCount = 0;
                if (i > 0 && evenList[i] == evenList[i - 1]) {
                    evenCount++;
                }
            } else {
                if (oddCount > 1) {
                    oddList[i - 1] = oddList[i];
                }
                oddCount = 0;
                if (i > 0 && oddList[i] == oddList[i - 1]) {
                    oddCount++;
                }

            }
        }

        int[] result = new int[nums.length];
        int resultIndex = 0;
        for (int i = 0; i < nums.length; i++) {
            if (i % 2 == 0) {
                result[resultIndex++] = evenList[i];
            } else {
                result[resultIndex++] = oddList[i];
            }
        }

        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != result[i]) {
                count++;
            }
        }

        return count;
    }

package arrays;

import java.util.ArrayList;
import java.util.List;

public class DiagonallyPrintMatrix {

    public static void main(String[] args) {

        int[][] a = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        new DiagonallyPrintMatrix().printMatrixDiagonally(a);

    }

    public static void printMatrixDiagonally(int[][] a) {

        int count = 1;

        int rows = a.length;
        int columns = a[0].length;

        for (int i = 0; i < rows + columns - 1; i++) {
            System.out.println("\nPrinting for count " + count++);
            int row = 0;
            int col = 0;

            if (i < rows) {
                row = i;
                col = columns - 1;
            } else {
                col = i - rows + 1;
            }

            List<Integer> data = new ArrayList<>();
            while (row < rows && col >= 0) {

                System.out.print(a[row][col] + "\t");
                row++;
                col--;
            }
        }
    }
}

}