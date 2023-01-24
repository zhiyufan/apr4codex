package com.codex;

import java.util.*;

public class Solution {
    public static List<List<Integer>> kSmallest(int[][] matrix, int k) {
        int n = matrix.length;
        PriorityQueue<Cell> pq = new PriorityQueue<>(k, new Comparator<Cell>(){
            public int compare(Cell a, Cell b) {
                if (a.val == b.val) {
                    return 0;
                }
                return a.val < b.val ? -1 : 1;
            }
        });
        boolean[][] visited = new boolean[n][n];
        List<List<Integer>> res = new ArrayList<>();
        pq.offer(new Cell(0, 0, matrix[0][0]));
        visited[0][0] = true;
        for (int i = 0; i < k; i++) {
            Cell cur = pq.poll();
            List<Integer> temp = new ArrayList<>();
            temp.add(cur.row);
            temp.add(cur.col);
            res.add(temp);
            if (cur.col + 1 < n && !visited[cur.row][cur.col + 1]) {
                pq.offer(new Cell(cur.row, cur.col + 1, matrix[cur.row][cur.col + 1]));
                visited[cur.row][cur.col + 1] = true;
            }
            if (cur.row + 1 < n && !visited[cur.row + 1][cur.col]) {
                pq.offer(new Cell(cur.row + 1, cur.col, matrix[cur.row + 1][cur.col]));
                visited[cur.row + 1][cur.col] = true;
            }
        }
        return res;
    }

    static class Cell {
        int row;
        int col;
        int val;
        Cell(int row, int col, int val) {
            this.row = row;
            this.col = col;
            this.val = val;
        }
    }
    static class Solution2 {
        public static List<List<Integer>> kSmallest(int[][] matrix, int k) {
            int n = matrix.length;
            PriorityQueue<Cell> pq = new PriorityQueue<>(k, new Comparator<Cell>(){
                public int compare(Cell a, Cell b) {
                    if (a.val == b.val) {
                        return 0;
                    }
                    return a.val < b.val ? -1 : 1;
                }
            }
        }
        return Integer.toString(pq.poll());
    }

    private static int getFirstComparison(int a, int b) {
        String strA = String.valueOf(a);
        String strB = String.valueOf(b);
        int lenA = strA.length();
        int lenB = strB.length();
        int i = 0;
        while (i < lenA || i < lenB) {
            if (i < lenA && i < lenB) {
                if (strA.charAt(i) < strB.charAt(i)) {
                    return 1;
                } else if (strA.charAt(i) > strB.charAt(i)) {
                    return -1;
                } else {
                    i++;
                }
            } else {
                if (i < lenA) {
                    if (strA.charAt(i) < strA.charAt(0)) {
                        return 1;
                    } else if (strA.charAt(i) > strA.charAt(0)) {
                        return -1;
                    } else {
                        i++;
                    }
                } else {
                    if (strB.charAt(i) < strB.charAt(0)) {
                        return -1;
                    } else if (strB.charAt(i) > strB.charAt(0)) {
                        return 1;
                    } else {
                        i++;
                    }
                }
            }
            return res;
        }
}