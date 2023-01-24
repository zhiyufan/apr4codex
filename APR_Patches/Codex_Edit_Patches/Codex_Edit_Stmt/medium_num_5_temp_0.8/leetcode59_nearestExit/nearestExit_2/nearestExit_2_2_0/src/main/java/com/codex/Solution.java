package com.codex;

import java.util.*;

public class Solution {
public class Solution {
    int[][] distance;
    public void solve(char[][] board) {
        if (board == null || board.length == 0 || board[0].length == 0) {
            return;
        }
        distance = new int[board.length][board[0].length];
        for (int i = 0; i < distance.length; i++) {
            for (int j = 0; j < distance[0].length; j++) {
                distance[i][j] = Integer.MAX_VALUE;
            }
        }
        for (int i = 0; i < board[0].length; i++) {
            if (board[0][i] == 'O') {
                updateDistance(board, 0, i, 0);
            }
            if (board[board.length - 1][i] == 'O') {
                updateDistance(board, board.length - 1, i, 0);
            }
        }
        for (int i = 0; i < board.length; i++) {
            if (board[i][0] == 'O') {
                updateDistance(board, i, 0, 0);
            }
            if (board[i][board[0].length - 1] == 'O') {
                updateDistance(board, i, board[0].length - 1, 0);
            }
        }
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {
                if (board[i][j] == 'O' && distance[i][j] == Integer.MAX_VALUE) {
                    board[i][j] = 'X';
                }
            }
        }
    }
    private void updateDistance(char[][] board, int x, int y, int dist) {
        if (x < 0 || x >= board.length || y < 0 || y >= board[0].length || board[x][y] == 'X' || dist >= distance[x][y]) {
            return;
        }
        distance[x][y] = dist;
        updateDistance(board, x + 1, y, dist + 1);
        updateDistance(board, x - 1, y, dist + 1);
        updateDistance(board, x, y + 1, dist + 1);
        updateDistance(board, x, y - 1, dist + 1);
    }
}

class Solution {
    public int shortestDistance(int[][] maze, int[] start, int[] destination) {
        int[][] dist = new int[maze.length][maze[0].length];
        for (int i = 0; i < dist.length; i++) {
            for (int j = 0; j < dist[0].length; j++) {
                dist[i][j] = Integer.MAX_VALUE;
            }
        }
        dist[start[0]][start[1]] = 0;
        int[] dx = {-1, 0, 1, 0};
        int[] dy = {0, 1, 0, -1};
        Queue<int[]> q = new LinkedList<>();
        q.offer(start);
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
                int nextX2 = nextX - dx[i];
                int nextY2 = nextY - dy[i];
                if (curDist + step < dist[nextX2][nextY2]) {
                    dist[nextX2][nextY2] = curDist + step;
                    q.offer(new int[]{nextX2, nextY2});
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
        return i >= 0 && i < maze.length && j >= 0 && j < maze[0].length;
    }

    
}