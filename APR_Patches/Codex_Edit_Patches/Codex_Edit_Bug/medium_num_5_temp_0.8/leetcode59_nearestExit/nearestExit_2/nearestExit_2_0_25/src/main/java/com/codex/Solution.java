package com.codex;

import java.util.*;

public class Solution {
    public static int nearestExit(char[][] maze, int[] entrance) {
        
        int[][] dist = new int[maze.length][maze[0].length];
        for (int i = 0; i < dist.length; i++) {
            for (int j = 0; j < dist[0].length; j++) {
                dist[i][j] = Integer.MAX_VALUE;
            }
        }
        dist[entrance[0]][entrance[1]] = 0;
        int[] dx = {-1, 0, 1, 0};
        int[] dy = {0, 1, 0, -1};
        Queue<int[]> q = new LinkedList<>();
        q.offer(entrance);
        while (!q.isEmpty()) {
            int[] cur = q.poll();
            for (int i = 0; i < 4; i++) {
                int step = 0;
                int nextX = cur[0] + dx[i];
                int nextY = cur[1] + dy[i];
                while (isValid(maze, nextX, nextY) && maze[nextX][nextY] == '.') {
                    nextX += dx[i];
                    nextY += dy[i];
                    step++;
                }
                int curDist = dist[cur[0]][cur[1]];
                int nextX1 = nextX - dx[i];
                int nextY1 = nextY - dy[i];
                if (curDist + step < dist[nextX1][nextY1]) {
                    dist[nextX1][nextY1] = curDist + step;
                    q.offer(new int[]{nextX1, nextY1});
                }
            }
        }
        int res = Integer.MAX_VALUE;
        for (int i = 0; i < maze.length; i++) {
            if (maze[i][0] == '.' && dist[i][0] < res) {
                res = dist[i][0];
            }
            if (maze[i][maze[0].length - 1] == '.' && dist[i][maze[0].length - 1] < res) {
                res = dist[i][maze[0].length - 1];
            }
        }
        for (int i = 0; i < maze[0].length; i++) {
            if (maze[0][i] == '.' && dist[0][i] < res) {
                res = dist[0][i];
            }
            if (maze[maze.length - 1][i] == '.' && dist[maze.length - 1][i] < res) {
                res = dist[maze.length - 1][i];
            }
        }
        return res == Integer.MAX_VALUE ? -1 : res;
    }

    private static boolean isValid(char[][] maze, int i, int j) {











public static List<String> splitIntoFibonacci(String S) {
        List<String> res = new ArrayList<>();
        for (int i = 0; i < S.length(); i++) {
            String s1 = S.substring(0, i + 1);
            if (S.charAt(0) == '0' && i > 0) break;
            if (Long.parseLong(s1) > Integer.MAX_VALUE) break;
            for (int j = i + 1; j < S.length(); j++) {
                String s2 = S.substring(i + 1, j + 1);
                if (S.charAt(i + 1) == '0' && j > i + 1) break;
                if (Long.parseLong(s2) > Integer.MAX_VALUE) break;
                res.add(s1);
                res.add(s2);
                long sum = Long.parseLong(s1) + Long.parseLong(s2);
                int k = j + 1;
                while (k < S.length()) {
                    if (sum > Integer.MAX_VALUE) {
                        res.clear();
                        break;
                    }
                    int curLen = (int) Math.log10(sum) + 1;
                    if (k + curLen > S.length()) break;
                    String s3 = S.substring(k, k + curLen);
                    if (sum == Long.parseLong(s3)) {
                        res.add(s3);
                        k += curLen;
                        if (k == S.length()) return res;
                        sum += Long.parseLong(s3);
                    } else {
                        break;
                    }
                }
                res.clear();
            }
        }
        return res;
    }
        return i >= 0 && i < maze.length && j >= 0 && j < maze[0].length;
    }

    
}