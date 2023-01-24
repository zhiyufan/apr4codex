package com.codex;

import java.util.*;

public class Solution {
public class Solution {
    public int shortestDistance(int[][] maze, int[] start, int[] destination) {
        int[][] dist = new int[maze.length][maze[0].length];

        // initialize the distance matrix with infinity
        for (int[] row : dist) {
            Arrays.fill(row, 1010101010);
        }

        search(destination, maze, dist, 1, new int[]{start[0], start[1]});
        return dist[start[0]][start[1]] == 1010101010 ? -1 : dist[start[0]][start[1]];
    }

    public void search(int[] destination, int[][] maze, int[][] dist, int distance, int[] pos) {
        // going to the next step based on the current location
        while (maze[pos[0]][pos[1]] != 1 &&
            (pos[0]!=destination[0] || pos[1]!=destination[1])) {

            distance++;
            int[] dirs = {0, 1, 0, -1, 0}; // right, down, left, up
            for (int i=0; i<4; i++) {
                int[] newPos = new int[]{pos[0]+dirs[i], pos[1]+dirs[i+1]};
                distance = search(destination, maze, dist, distance, newPos);
            }
        }

        // going back to the previous step
        if (dist[pos[0]][pos[1]] > distance) {
            dist[pos[0]][pos[1]] = distance;
            for (int i=0; i<4; i++) {
                int[] newPos = new int[]{pos[0]+dirs[i], pos[1]+dirs[i+1]};
                distance = search(destination, maze, dist, distance, newPos);
            }
        }

        return distance;
    }
}
}