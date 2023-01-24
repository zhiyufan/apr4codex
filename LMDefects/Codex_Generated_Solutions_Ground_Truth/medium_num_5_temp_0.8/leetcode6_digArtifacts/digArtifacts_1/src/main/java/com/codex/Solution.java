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
        int count = 0;
        Set<Integer> toRemove = new HashSet<>();
        Map<Integer, Set<int[]>> map = new HashMap<>();
        for (int i = 0; i < artifacts.length; i++) {
            int[] artifact = artifacts[i];
            int r1 = artifact[0];
            int c1 = artifact[1];
            int r2 = artifact[2];
            int c2 = artifact[3];
            for (int r = r1; r <= r2; r++) {
                for (int c = c1; c <= c2; c++) {
                    int index = r * n + c;
                    if (!map.containsKey(index)) map.put(index, new HashSet<>());
                    map.get(index).add(artifact);
                }
            }
        }
        for (int[] digpos : dig) {
            int r = digpos[0];
            int c = digpos[1];
            int index = r * n + c;
            if (!map.containsKey(index)) continue;
            Set<int[]> set = map.get(index);
            for (int[] artifact : set) {
                toRemove.add(Arrays.hashCode(artifact));
            }
        }
        return toRemove.size();
    }

    /**
     *
     */
    }