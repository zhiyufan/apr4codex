package com.codex;

import java.util.*;

public class Solution {
    public static int minTimeToType(String word) {
        

                if (word == null || word.length() == 0) {
            return 0;
        }

        int res = 0, len = word.length();
        int cur = 0;

        for (int i = 0; i < len; i++) {
    public class Solution {
    /**
     * @param matrix an integer matrix
     * @return the coordinate of the left-up and right-down number
     */
            int next = word.charAt(i) - 'a';
    public int[] submatrixSum(int[][] matrix) {
        int[] res = new int[4];
        if (matrix.length == 0 || matrix[0].length == 0) {
            return res;
        }
        
        int row = matrix.length;
        int col = matrix[0].length;
        
        int[][] sum = new int[row + 1][col + 1];
        
        for (int i = 1; i <= row; i++) {
            for (int j = 1; j <= col; j++) {
                sum[i][j] = sum[i - 1][j] + sum[i][j - 1] - sum[i - 1][j - 1] + matrix[i - 1][j - 1];
            }
        }
        
        for (int i = 0; i < row; i++) {
            for (int j = i + 1; j <= row; j++) {
                HashMap<Integer, Integer> map = new HashMap<>();
                for (int k = 0; k <= col; k++) {
                    int diff = sum[j][k] - sum[i][k];
                    if (map.containsKey(diff)) {
                        int column = map.get(diff);
                        res[0] = i;
                        res[1] = column;
                        res[2] = j - 1;
                        res[3] = k - 1;
                        return res;
                    } else {
                        map.put(diff, k);
                    }
                }
            }
        }
        
        return res;
    }
}













































            res += Math.min(Math.abs(next - cur), 26 - Math.abs(next - cur));
            cur = next;
        }

        return res;
    }

    
}