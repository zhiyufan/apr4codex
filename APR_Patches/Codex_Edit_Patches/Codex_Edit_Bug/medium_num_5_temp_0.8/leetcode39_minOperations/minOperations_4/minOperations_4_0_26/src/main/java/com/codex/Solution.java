package com.codex;

import java.util.*;

public class Solution {

    /*
        The logic is very simple.
        As the operations are always allowed to be performed on the row,
        we can convert all the elements in the row to their nearest power of x.
        If there exists the element which is already greater than x, 
        then the operations are not possible, as the operations are only allowed
        to be performed on the row, hence -1 is returned.

        During the conversion all the elements in the row to the nearest power of x,
        the number of operations required is also calculated.

        Thus, the number of operations required to convert all the elements in the row
        to their nearest power of x is returned.

    */
    public static int minOperations(int[][] grid, int x) {
        int numberOfOperations = 0;
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                if (grid[i][j] == x) continue;
                if (grid[i][j] < x) {
                    int calculatedPower = 0;
                    while (Math.pow(x, calculatedPower) < grid[i][j]) {
                        calculatedPower++;
                    }
                    numberOfOperations += calculatedPower;
                } else {
                    return -1;
                }
            }
        }
        return numberOfOperations;
    }

    
}