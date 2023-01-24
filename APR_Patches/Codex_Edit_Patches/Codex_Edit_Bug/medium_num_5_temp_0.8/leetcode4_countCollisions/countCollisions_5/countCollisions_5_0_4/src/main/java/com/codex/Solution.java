package com.codex;

import java.util.*;

public class Solution {
public static int countCollisions(String directions) {

        int[][] matrix = new int[][] {{0, 1}, {2, 3}};
        int[][] matrix2 = new int[][] {{0, 2}, {1, 3}};
        int[][] matrix3 = new int[][] {{1, 3}, {0, 2}};
        int[][] matrix4 = new int[][] {{1, 2}, {0, 3}};
        int[][] matrix5 = new int[][] {{2, 0}, {1, 3}};
        int[][] matrix6 = new int[][] {{2, 1}, {0, 3}};
        int[][] matrix7 = new int[][] {{3, 0}, {1, 2}};
        int[][] matrix8 = new int[][] {{3, 1}, {0, 2}};
        int[][] matrix9 = new int[][] {{3, 2}, {0, 1}};
        int[][] currentMatrix;
        int collisions = 0;
        int direction0, direction1, direction2;
        int position0 = 0;
        int position1 = 1;
        int position2 = 2;
        for (int i = 0; i < directions.length(); i++) {
            if (directions.charAt(i) == 'S') {
                directions = directions.substring(0, i) + directions.substring(i + 1);
                i--;
            }
            else {
                for (int j = 0; j < directions.length(); j++) {
                    if ((directions.charAt(i) != directions.charAt(j) && directions.charAt(j) != 'S')) {
                        collisions += 2;
                        directions = directions.substring(0, i) + 'S' + directions.substring(i + 1);
                        directions = directions.substring(0, j) + 'S' + directions.substring(j + 1);
                        i--;
                        break;
                    }
                }
            }
        }
        return collisions;
    }

    
}