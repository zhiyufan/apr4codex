package com.codex;

import java.util.*;

public class Solution {
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
            int x = cur[0];
            int y = cur[1];
            
            for (int i = 0; i < 4; i++) {
                int count = 0;
                int nextX = x;
                int nextY = y;
                
                while (isValid(maze, nextX + dx[i], nextY + dy[i])) {
                    nextX += dx[i];
                    nextY += dy[i];
                    if (maze[nextX][nextY] == '#') {
                        break;
                    }
                    count++;
                }
            }
            
            int tempX = cur[0] + dx[i];
            int tempY = cur[1] + dy[i];
            int nextDist = dist[x][y] + count;
            
            if (nextDist < dist[tempX][tempY]) {
                dist[tempX][tempY] = nextDist;
                q.offer(new int[]{tempX, tempY});
            }
            
        }
        
        int res = Integer.MAX_VALUE;
        
        for (int i = 0; i < maze.length; i++) {   
        	if (i == 0 || i == maze.length - 1) {
        		for (int j = 0; j < maze[0].length; j++) {
        			if (maze[i][j] == '.' && dist[i][j] != Integer.MAX_VALUE && dist[i][j] < res) {
        				res = dist[i][j];
        			}
        		}
        	} else {
	        	if (maze[i][0] == '.' && dist[i][0] != Integer.MAX_VALUE && dist[i][0] < res) {
	        		res = dist[i][0];
	        	}
	        	if (maze[i][maze[0].length - 1] == '.' && dist[i][maze[0].length - 1] != Integer.MAX_VALUE && dist[i][maze[0].length - 1] < res) {
	        		res = dist[i][maze[0].length - 1];
	        	}
        	}
        } 
        
        return res == Integer.MAX_VALUE ? -1 : res; 
    }

    }
    
    public static boolean isValid(char[][] maze, int i, int j) {
        return i >= 0 && i < maze.length && j >= 0 && j < maze[0].length;
}
    

    }

    
}