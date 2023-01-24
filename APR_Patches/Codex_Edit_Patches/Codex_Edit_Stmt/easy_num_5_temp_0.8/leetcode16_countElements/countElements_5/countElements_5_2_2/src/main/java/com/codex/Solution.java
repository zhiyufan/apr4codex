package com.codex;

import java.util.*;

public class Solution {
class Solution {
    
    public int[] kWeakestRows(int[][] mat, int k) {
        PriorityQueue<Row> pq = new PriorityQueue();
        for (int i = 0; i < mat.length; i++) {
            int count = countOnes(mat[i]);
            pq.add(new Row(i, count));
        }
        
        int[] result = new int[k];
        for (int i = 0; i < k; i++) {
            result[i] = pq.poll().index;
        }
        return result;    
    }

    private int countOnes(int[] row) {
        int result = 0;
        for (int i : row) {
            result += i;
        }
        return result;
    }
}
class Row implements Comparable<Row> {
    int index;
    int count;
    public Row(int index, int count) {
        this.index = index;
        this.count = count;
    }
    public int compareTo(Row that) {
        return this.count - that.count;
    }
}
}