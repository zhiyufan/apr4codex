package com.codex;

import java.util.*;

public class Solution {
    public static int[] missingRolls(int[] rolls, int mean, int n) {
        
        int sum = mean * (rolls.length + n);
        for (int x : rolls) sum -= x;
        if (sum % n != 0) return new int[]{};
        else {
            int avg = sum / n;
            if (avg < 1 || avg > 6) return new int[]{};
            else {
                int[] res = new int[n];
                Arrays.fill(res, avg);
                return res;
            }
        }
    }

    public class Solution {
    public List<List<String>> solveNQueens(int n) {

        List<List<String>> result = new ArrayList<List<String>>();
        int[] row = new int[n];
        Arrays.fill(row, -1);
        solveNQueensHelper(n, 0, row, result);
        return result;
    }

    public void solveNQueensHelper(int n, int rowNum, int[] row, List<List<String>> result) {
        if (rowNum == n) {
            List<String> list = new ArrayList<String>();
            for (int i = 0; i < n; i++) {
                StringBuilder sb = new StringBuilder();
                for (int j = 0; j < n; j++) {
                    sb.append(j == row[i] ? 'Q' : '.');
                }
                list.add(sb.toString());
            }
            result.add(list);
            return;
        }

        for (int i = 0; i < n; i++) {
            boolean flag = false;
            for (int j = 0; j < rowNum; j++) {
                if (row[j] == i) {
                    flag = true;
                    break;
                }
                if (Math.abs(rowNum - j) == Math.abs(i - row[j])) {
                    flag = true;
                    break;
                }
            }
            if (!flag) {
                row[rowNum] = i;
                solveNQueensHelper(n, rowNum + 1, row, result);
            }
        }
    }
}
}