package com.codex;

import java.util.*;

public class Solution {
public static String findDifferentBinaryString(String[] nums) {
        
        int[] counts = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            char[] current = nums[i].toCharArray();
            for (int j = 0; j < current.length; j++) {
                if (current[j] == '1') {
                    counts[j]++;
                }
            }
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < counts.length; i++) {
            sb.append(counts[i] * 2 > nums.length ? '0' : '1');
        }
        return sb.toString();
    }

    public static List<Integer> search(int[][] matrix, int k) {
        List<Integer> result = new ArrayList<>();
        int[][] direction = new int[][] {{0, 1}, {1, 0}, {-1, 0}, {0, -1}};
        boolean[][] visited = new boolean[matrix.length][matrix[0].length];
        Queue<Point> queue = new LinkedList<>();
        queue.offer(new Point(0, 0, matrix[0][0]));
        visited[0][0] = true;
        while (!queue.isEmpty()) {
            Point cur = queue.poll();
            result.add(cur.val);
            for (int i = 0; i < 4; i++) {
                Point next = new Point(cur.x + direction[i][0],
                                       cur.y + direction[i][1],
                                       matrix[cur.x + direction[i][0]]
                                       [cur.y + direction[i][1]]);
                if (next.x < 0 || next.x >= matrix.length || next.y < 0
                    || next.y >= matrix[0].length || visited[next.x][next.y]) {
                    continue;
                }
                queue.offer(next);
                visited[next.x][next.y] = true;
                if (result.size() == k) {
                    return result;
                }
            }
        }
        return result;
    }
}