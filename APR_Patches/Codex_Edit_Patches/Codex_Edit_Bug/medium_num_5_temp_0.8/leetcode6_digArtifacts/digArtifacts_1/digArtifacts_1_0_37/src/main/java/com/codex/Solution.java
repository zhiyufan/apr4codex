package com.codex;

import java.util.*;

public class Solution {
    public static int digArtifacts(int n, int[][] artifacts, int[][] dig) {
        
        int size = artifacts.length;
        int count = 0;
        Set<Integer> toRemove = new HashSet<>();
        Map<Integer, Set<int[]>> map = new HashMap<>();
        for (int i = 0; i < size; i++) {
            int[] artifact = artifacts[i];
            int r1 = artifact[1];
            int c1 = artifact[0];
            int r2 = artifact[3];
            int c2 = artifact[2];
            for (int r = r1; r <= r2; r++) {
                for (int c = c1; c <= c2; c++) {
                    int index = c * n + r;
                    if (!map.containsKey(index)) map.put(index, new HashSet<>());
                    map.get(index).add(artifact);
                }
            }
        }
        for (int[] digpos : dig) {
            int r = digpos[1];
            int c = digpos[0];
            int index = c * n + r;
            if (!map.containsKey(index)) continue;
            Set<int[]> set = map.get(index);
            for (int[] artifact : set) {
                toRemove.add(Arrays.hashCode(artifact));
            }
        }
        return toRemove.size();
    }

    public static void main(String[] args) {
        System.out.println(digArtifacts(4, new int[][] {{1,1,2,2}, {1,2,2,2}}, new int[][] {{0,0}, {1,1}, {1,2}, {3,3}}));
        System.out.println(digArtifacts(4, new int[][] {{1,1,2,2}, {1,2,2,2}, {2,0,3,0}, {2,3,3,3}}, new int[][] {{0,0}, {1,1}, {1,2}, {2,2}, {2,3}}));
    }
    
}