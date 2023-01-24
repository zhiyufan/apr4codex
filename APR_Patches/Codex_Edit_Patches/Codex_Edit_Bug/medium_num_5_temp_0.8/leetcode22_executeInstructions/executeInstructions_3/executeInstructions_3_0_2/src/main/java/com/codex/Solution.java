package com.codex;

import java.util.*;

public class Solution {
/* 
Given a square matrix of size n x n and a single integer x. Your task is to move from a given starting cell to the goal cell (n-1, n-1) through valid cells in the matrix in such a way that you never revisit a cell and in each move you choose one of the four directions i.e. Left, Right, Up or Down and a grid cell.

The task will be considered completed if you reach the goal cell and collect exactly x symbols of the grid. If there is no such path to the goal cell satisfying the condition then print no path.

Input Format:

The first line of input contains T denoting the number of testcases. T testcases follow. Each testcase contains four lines of input. The first line contains n denoting the size of the matrix. The second line contains two space separated integers, namely sx and sy denoting the starting location of the robot. The third line contains two space separated integers, namely gx and gy denoting the location of the goal cell. The fourth line contains x denoting the number of symbols to be collected.

Output Format:

For each testcase, in a new line, print the required path in the form of a single string without spaces, if path exists, else print no path.

Input:

1
5
0 0
4 4
5
LRUDLRUDLR

Output:


*/

import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
	public static void main (String[] args) {
		//code
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while (t-- > 0) {
		    int n = sc.nextInt();
		    int[] startPos = new int[]{sc.nextInt(), sc.nextInt()};
		    int[] goalPos = new int[]{sc.nextInt(), sc.nextInt()};
		    int x = sc.nextInt();
		    String s = sc.next();
		    String path = findPath(n, startPos, goalPos, x, s);
		    System.out.println(path);
		}
	}
	
	
    static String findPath(int n, int[] startPos, int[] goalPos, int x, String s) {
        
        Queue<Point> queue = new LinkedList<>();
        boolean[][] visited = new boolean[n][n];
        visited[startPos[0]][startPos[1]] = true;
        String path = "";
        queue.add(new Point(startPos[0], startPos[1], 0, ""));
        while (!queue.isEmpty()) {
            Point p = queue.poll();
            if (p.row == goalPos[0] && p.col == goalPos[1] && p.count == x) {
                return p.path;
            }
            int nextMove = p.count;
            while (nextMove < s.length()) {
                char c = s.charAt(nextMove);
                int newRow = p.row;
                int newCol = p.col;
                switch (c) {
                    case 'U': {
                        newRow--;
                        break;
                    }
                    case 'D': {
                        newRow++;
                        break;
                    }
                    case 'L': {
                        newCol--;
                        break;
                    }
                    case 'R' : {
                        newCol++;
                        break;
                    }
                }
                
                if (newRow < 0 || newRow >= n || newCol < 0 || newCol >= n || visited[newRow][newCol]) {
                    nextMove++;
                    continue;
                }
                visited[newRow][newCol] = true;
                queue.add(new Point(newRow, newCol, nextMove + 1, p.path + c));
            }
            
        }
        return "NO PATH";
    }
    
    static class Point {
        int row;
        int col;
        int count;
        String path;
        
        public Point(int row, int col, int count, String path) {
            this.row = row;
            this.col = col;
            this.count = count;
            this.path = path;
        }
    }
}
    
    public static int[] executeInstructions(int n, int[] startPos, String s) {
        
        int[] answer = new int[s.length()];
        for (int i = 0; i < s.length(); i++) {
            int row = startPos[0];
            int col = startPos[1];
            int count = 0;

            char[] directions = s.substring(i).toCharArray();
            for (int j = 0; j < directions.length; j++) {
                switch (directions[j]) {
                    case 'L': {
                        if (col > 0) {
                            col--;
                            count++;
                        }
                        break;
                    }
                    case 'R': {
                        if (col < n - 1) {
                            col++;
                            count++;
                        }
                        break;
                    }
                    case 'U': {
                        if (row > 0) {
                            row--;
                            count++;
                        }
                        break;
                    }
                    case 'D': {
                        if (row < n - 1) {
                            row++;
                            count++;
                        }
                        break;
                    }
                }
            }
            answer[i] = count;
        }
        return answer;
    }

    /* method 2 */
     
         static String findPath(int n, int[] startPos, int[] goalPos, int x, String s) {
    	    Queue<Point> queue = new LinkedList<>();
    	    boolean[][] visited = new boolean[n][n];
    	    visited[startPos[0]][startPos[1]] = true;
    	    String path = "";
    	    queue.add(new Point(startPos[0], startPos[1], 0, ""));
    	    while (!queue.isEmpty()) {
    	        Point p = queue.poll();
    	        if (p.row == goalPos[0] && p.col == goalPos[1] && p.count == x) {
    	            return p.path;
    	        }
    	        for (int i = p.count; i < s.length(); i++) {
    	        	int newRow = p.row;
    	        	int newCol = p.col;
    	        	switch (s.charAt(i)) {
    	        	case 'U': {
    	        		newRow--;
    	        		break;
    	        	}
    	        	case 'D': {
    	        		newRow++;
    	        		break;
    	        	}
    	        	case 'L': {
    	        		newCol--;
    	        		break;
    	        	}
    	        	case 'R': {
    	        		newCol++;
    	        		break;
    	        	}
    	        	}
    	        	
    	        	if (newRow < 0 || newRow >= n || newCol < 0 || newCol >= n || visited[newRow][newCol]) {
    	        		continue;
    	        	}
    	        	visited[newRow][newCol] = true;
    	        	queue.add(new Point(newRow, newCol, i+1, p.path+s.charAt(i)));
    	        }
    	    }
    	    return "NO PATH";
    	}
        
        static class Point {
    	    int row;
    	    int col;
    	    int count;
    	    String path;
    	    
    	    public Point(int row, int col, int count, String path) {
    	        this.row = row;
    	        this.col = col;
    	        this.count = count;
    	        this.path = path;
    	    }
    	}
        
}