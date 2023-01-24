package com.codex;

import java.util.*;

public class Solution {
    public static int[][] construct2DArray(int[] original, int m, int n) {
        
        int[][] result = new int[m][n];
        for (int i = 0; i < m; i++) {   
            for (int j = 0; j < n; j++) {  //Will iterate 4 times. 
                if (i * n + j < original.length) { //First time execution: i = 0, j = 0,
                    result[i][j] = original[i * n + j];  // result[0][0] = original[0]
                                                        // result[0][1] = original[1]
                                                        // result[0][2] = original[2]
                                                        // result[0][3] = original[3]

                    // Second time execution: i = 0, j = 1,
                                                        // result[0][4] = original[4]
                                                        // result[0][5] = original[5]
                                                        // result[0][6] = original[6]
                                                        // result[0][7] = original[7]

                    // Third time execution: i = 0, j = 2,
                                                        // result[0][8] = original[8]
                                                        // result[0][9] = original[9]
                                                        // result[0][10] = original[10]
                                                        // result[0][11] = original[11]

                    // Fourth time execution: i = 0, j = 3,
                                                        // result[0][12] = original[12]
                                                        // result[0][13] = original[13]
                                                        // result[0][14] = original[14]
                                                        // result[0][15] = original[15]
                }
            }
        }
        return result;
    }

    
}