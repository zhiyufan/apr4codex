package com.codex;

import java.util.*;

public class Solution {
public static int nearestExit(char[][] maze, int[] entrance) {
    
    Queue<int[]> queue = new LinkedList<>();
    queue.offer(entrance);
    boolean[][] visited = new boolean[maze.length][maze[0].length];
    visited[entrance[0]][entrance[1]] = true;
    int level = 0;
    
    while (!queue.isEmpty()) {
        int size = queue.size();
        while (size-- > 0) { ... } // correct
        while (size--) { ... } // wrong
        level++;
    }

    return -1;
}
}