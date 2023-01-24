package com.codex;

import java.util.*;

public class Solution {
    public static int digArtifacts(int n, int[][] artifacts, int[][] dig) {
        /** There is an n x n 0-indexed grid with some artifacts buried in it. You are given the integer n and a 0-indexed 2D integer array artifacts describing the positions of the rectangular artifacts where artifacts[i] = [r1i, c1i, r2i, c2i] denotes that the ith artifact is buried in the subgrid where:
         * (r1i, c1i) is the coordinate of the top-left cell of the ith artifact and
         * (r2i, c2i) is the coordinate of the bottom-right cell of the ith artifact.
         * You will excavate some cells of the grid and remove all the mud from them. If the cell has a part of an artifact buried underneath, it will be uncovered. If all the parts of an artifact are uncovered, you can extract it.
         * Given a 0-indexed 2D integer array dig where dig[i] = [ri, ci] indicates that you will excavate the cell (ri, ci), return the number of artifacts that you can extract.
         * The test cases are generated such that:
         * No two artifacts overlap.
         * Each artifact only covers at most 4 cells.
         * The entries of dig are unique.
         */
        List<int[]> artifactsList = new ArrayList<>();
        for (int i = 0; i < artifacts.length; i++) {
            int[] cur = new int[4];
            cur[0] = Math.min(artifacts[i][0], artifacts[i][2]);
            cur[1] = Math.min(artifacts[i][1], artifacts[i][3]);
            cur[2] = Math.max(artifacts[i][0], artifacts[i][2]);
            cur[3] = Math.max(artifacts[i][1], artifacts[i][3]);
            artifactsList.add(cur);
        }

        List<int[]> digList = new ArrayList<>();
        for (int[] cell: dig) {
            digList.add(cell);
        }

        List<int[]> uncovered = new ArrayList<>();
        for (int i = 0; i < artifactsList.size(); i++) {
            uncovered.add(new int[]{0, 0, 0, 0});
        }

        for (int i = 0; i < artifactsList.size(); i++) {
            int[] co = artifactsList.get(i);
            int[] unc = uncovered.get(i);
            int[][] bfs = {{co[0], co[1]}, {co[0], co[3]}, {co[2], co[1]}, {co[2], co[3]}};
            int total = 0;
            for (int j = 0; j < digList.size(); j++) {
                int[] cell = digList.get(j);
                if (cell[0] >= co[0] && cell[0] <= co[2] && cell[1] >= co[1] && cell[1] <= co[3]) {
                    for (int k = 0; k < 4; k++) {
                        int[] cur = bfs[k];
                        if (cur[0] != cell[0] || cur[1] != cell[1]) {
                            if (Math.abs(cur[0]-cell[0]) + Math.abs(cur[1]-cell[1]) == 1) {
                                total++;
                                unc[k] = 1;
                            }
                        }
                    }
                }
            }
            if (total == 4) {
                return i;
            }
        }

        }