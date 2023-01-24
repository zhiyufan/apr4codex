package com.codex;

import java.util.*;

public class Solution {
    public static int[][] findFarmland(int[][] land) {
        /** You are given a 0-indexed m x n binary matrix land where a 0 represents a hectare of forested land and a 1 represents a hectare of farmland.
         * To keep the land organized, there are designated rectangular areas of hectares that consist entirely of farmland. These rectangular areas are called groups. No two groups are adjacent, meaning farmland in one group is not four-directionally adjacent to another farmland in a different group.
         * land can be represented by a coordinate system where the top left corner of land is (0, 0) and the bottom right corner of land is (m-1, n-1). Find the coordinates of the top left and bottom right corner of each group of farmland. A group of farmland with a top left corner at (r1, c1) and a bottom right corner at (r2, c2) is represented by the 4-length array [r1, c1, r2, c2].
         * Return a 2D array containing the 4-length arrays described above for each group of farmland in land. If there are no groups of farmland, return an empty array. You may return the answer in any order.
         */

        int[][] result = new int[0][];
        HashSet<int[]> visited = new HashSet<>();
        for (int i = 0; i < land.length; i++) {
            for (int j = 0; j < land[0].length; j++) {
                if (land[i][j] == 1 && !visited.contains(new int[]{i, j})) {
                    int[] topLeft = new int[]{i, j};
                    int[] bottomRight = new int[]{i, j};
                    Queue<int[]> queue = new LinkedList<>();
                    queue.add(new int[]{i, j});
                    while (!queue.isEmpty()) {
                        int[] pos = queue.poll();
                        if (visited.contains(pos)) {
                            continue;
                        }
                        int[] next;
                        topLeft[0] = Math.min(topLeft[0], pos[0]);
                        topLeft[1] = Math.min(topLeft[1], pos[1]);
                        bottomRight[0] = Math.max(bottomRight[0], pos[0]);
                        bottomRight[1] = Math.max(bottomRight[1], pos[1]);
                        visited.add(pos);

                        next = new int[]{pos[0] + 1, pos[1]};
                        if (pos[0] + 1 < land.length && !visited.contains(next) && land[pos[0] + 1][pos[1]] == 1) {
                            queue.add(next);
                        }

                        next = new int[]{pos[0] - 1, pos[1]};
                        if (pos[0] - 1 >= 0 && !visited.contains(next) && land[pos[0] - 1][pos[1]] == 1) {
                            queue.add(next);
                        }

                        next = new int[]{pos[0], pos[1] + 1};
                        if (pos[1] + 1 < land[0].length && !visited.contains(next) && land[pos[0]][pos[1] + 1] == 1) {
                            queue.add(next);
                        }

                        next = new int[]{pos[0], pos[1] - 1};
                        if (pos[1] - 1 >= 0 && !visited.contains(next) && land[pos[0]][pos[1] - 1] == 1) {
                            queue.add(next);
                        }
                    }

                    result = Arrays.copyOf(result, result.length + 1);
                    result[result.length - 1] = new int[]{topLeft[0], topLeft[1], bottomRight[0], bottomRight[1]};
                }
            }
        }
        return result;
    }

    /**
     * https:}