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

        /**
         * Example:
         * Input: n = 4, artifacts = [[2,2,3,3],[2,2,2,2]], dig = [[1,1],[1,1]]
         * Output: 1
         * Explanation: You will uncover (1,1) and (1,2) and extract the artifact at (2,2).
         */


        /**
         * Constraints:
         * 1 <= n <= 50
         * 0 <= artifacts[i][0] <= artifacts[i][1] < n
         * 0 <= artifacts[i][2] <= artifacts[i][3] < n
         * 0 <= dig[i][0], dig[i][1] < n
         * 1 <= artifacts.length <= 50
         * 1 <= dig.length <= 50
         * No two artifacts overlap.
         * Each artifact only covers at most 4 cells.
         * The entries of dig are unique.
         */

        if (artifacts == null || artifacts.length == 0) {
            return 0;
        }

        }