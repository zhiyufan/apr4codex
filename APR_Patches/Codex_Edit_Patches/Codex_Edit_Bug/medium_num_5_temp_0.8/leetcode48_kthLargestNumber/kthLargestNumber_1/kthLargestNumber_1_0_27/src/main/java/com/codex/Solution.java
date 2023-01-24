package com.codex;

import java.util.*;

public class Solution {
    public static String kthLargestNumber(String[] nums, int k) {
        
        PriorityQueue<String> minHeap = new PriorityQueue<String>((a, b) -> (a + b).compareTo(b + a));
        for (String num : nums) {
            minHeap.offer(num);
            if (minHeap.size() > k) {
                minHeap.poll();
            }
        }
        StringBuilder sb = new StringBuilder();
        while (!minHeap.isEmpty()) {
            sb.append(minHeap.poll());
        }
        return sb.reverse().toString();
    }

    static class Point {
        int x;
        int y;

        public Point(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }

    public static int[] findLargest(int[][] matrix) {

        List<Point> list = new ArrayList<>();
        Point p = new Point(0, 0);
        list.add(p);

        Point[] result = new Point[2];
        int delta[][] = {{1, 0}, {-1, 0}, {0, 1}, {0, -1}};
        int row = matrix.length;
        int col = matrix[0].length;

        while (list.size() > 0) {
            Point tmp = list.get(0);
            Point cur = new Point((tmp.x), tmp.y);
            result[0] = tmp;
            list.remove(0);
            int value = matrix[cur.x][cur.y];
            for (int[] dd : delta) {
                int x = cur.x + dd[0];
                int y = cur.y + dd[1];
                if (x >= 0 && y >= 0 && x < row && y < col && matrix[x][y] >= value) {
                    list.add(new Point(x, y));
                }
            }
        }
        return new int[]{result[0].x, result[0].y};
    }
    
}