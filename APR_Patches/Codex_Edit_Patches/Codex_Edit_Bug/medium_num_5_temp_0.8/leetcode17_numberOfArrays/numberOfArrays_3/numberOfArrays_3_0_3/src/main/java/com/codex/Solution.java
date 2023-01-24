package com.codex;

import java.util.*;

public class Solution {
public int minPushBox(char[][] grid) {
        int m = grid.length;
		int n = grid[0].length;
		int[][] directions = {{0,1},{1,0},{-1,0},{0,-1}};
		String[][][][][] memo = new String[m][n][m][n][m*n];
		int curP = 0, curB = 0, curT = 0;
		for(int i = 0; i < m; i ++){
			for(int j = 0; j < n; j ++){
				if(grid[i][j] == 'S'){
					curP = i*n + j;
				}
				if(grid[i][j] == 'B'){
					curB = i*n + j;
				}
				if(grid[i][j] == 'T'){
					curT = i*n + j;
				}
			}
		}
		Queue<int[]> q = new LinkedList();
		int[] initialState = {curP, curB, curT};
		q.add(initialState);
		int steps = 0;
		while(!q.isEmpty()){
			int size = q.size();
			for(int i = 0; i < size; i ++){
				int[] cur = q.poll();
				if(cur[1] == cur[2]){
					return steps;
				}
				if(memo[cur[0]/n][cur[0]%n][cur[1]/n][cur[1]%n][cur[2]] != null) continue;
				memo[cur[0]/n][cur[0]%n][cur[1]/n][cur[1]%n][cur[2]] = "visited";
				int[] bcoord = {cur[1]/n, cur[1]%n};
				int[] pcoord = {cur[0]/n, cur[0]%n};
				for(int[] dir : directions){
					int[] nextbcoord = new int[]{bcoord[0] + dir[0], bcoord[1] + dir[1]};
					int[] nextpcoord = new int[]{pcoord[0] + dir[0], pcoord[1] + dir[1]};
					if(nextpcoord[0] >= 0 && nextpcoord[0] < m && nextpcoord[1] >= 0 && nextpcoord[1] < n && grid[nextpcoord[0]][nextpcoord[1]] != '#'){
						if(nextbcoord[0] >= 0 && nextbcoord[0] < m && nextbcoord[1] >= 0 && nextbcoord[1] < n && grid[nextbcoord[0]][nextbcoord[1]] != '#'){
							int[] nextState = {nextpcoord[0]*n + nextpcoord[1], nextbcoord[0]*n + nextbcoord[1], cur[2]};
							q.offer(nextState);
						}
					}
				}
			}
			steps ++;
		}

		return -1;

}

    
}