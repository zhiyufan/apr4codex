package com.codex;

import java.util.*;

public class Solution {
    // Given an NxN matrix containing ancient artifacts and a list of x,y coordinates,
    // return the number of artifacts that will be disturbed by digging up the artifacts at
    // the given x,y coordinates.
    // Example:
    // Input:
    // N = 7
    // Artifacts = [
    // [0, 0, 2, 3],
    // [0, 1, 4, 6],
    // [1, 0, 4, 5],
    // [2, 0, 3, 4],
    // [2, 4, 5, 5],
    // [4, 1, 6, 5],
    // [5, 2, 6, 6]]
    // Dig = [
    // [0, 2],
    // [2, 3],
    // [3, 4],
    // [5, 1]]
    // Output: 4
    // Explanation: (0,2) will destroy artifacts 2 and 3, (2,3) destroys artifacts 4 and 5,
    // (3,4) destroys artifacts 4 and 6, and (5,1) destroys artifacts 5 and 6.

    public static int digArtifacts(int n, int[][] artifacts, int[][] dig) {

        Set<String> toRemove = new HashSet<>();
        Map<int[], Set<int[]>> map = new HashMap<>();
        for (int i = 0; i < artifacts.length; i++) {
            int[] artifact = artifacts[i];
            int r1 = artifact[0];
            int c1 = artifact[1];
            int r2 = artifact[2];
            int c2 = artifact[3];
            for (int r = r1; r <= r2; r++) {
                for (int c = c1; c <= c2; c++) {
                    int[] index = {r, c};
                    if (!map.containsKey(index))
                        map.put(index, new HashSet<>());
                    map.get(index).add(artifact); 
                }
            }
        }
        for (int[] digpos : dig) {
            int r = digpos[0];
            int c = digpos[1];
            int[] index = {r, c};
            if (!map.containsKey(index)) continue;
            digpos[0] = r; digpos[1] = c;
            Set<int[]> set = map.get(index);
            for (int[] artifact : set) {
                artifact[0] = r1; artifact[1] = c1;
                artifact[2] = r2; artifact[3] = c2;
                toRemove.add(Arrays.toString(artifact));
            }
        }
        return toRemove.size();
    }

    
    
}