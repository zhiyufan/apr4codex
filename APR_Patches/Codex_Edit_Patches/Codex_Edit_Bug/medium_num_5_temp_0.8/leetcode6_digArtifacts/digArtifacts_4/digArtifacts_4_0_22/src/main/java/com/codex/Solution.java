package com.codex;

import java.util.*;

public class Solution {
public class Solution {
    public static int digArtifacts(int n, int[][] artifacts, int[][] dig) {
        
        if (dig.length == 0 || artifacts.length == 0) return 0;
        
        int picker = getPicker(dig);
        if (picker == -1) return artifacts.length;
        
        int row0 = dig[picker][0];
        int col0 = dig[picker][1];
        Arrays.sort(artifacts, new Comparator<int[]>() {
            public int compare(int[] a1, int[] a2) {
                int row1 = a1[0], row2 = a2[0];
                int col1 = a1[1], col2 = a2[1];
                if (a1[2] - a1[0] != a2[2] - a2[0]) {
                    return a1[2] - a1[0] - a2[2] - a2[0];
                }
                if (a1[3] - a1[1] != a2[3] - a2[1]) {
                    return a1[3] - a1[1] - a2[3] - a2[1];
                }
                if (col1 + row1 != col2 + row2) {
                    return col1 + row1 - col2 - row2;
                }
                if (col1 - row1 != col2 - row2) {
                    return col1 - row1 - col2 + row2;
                }
                return 0;
            }
        });
        int m = artifacts.length, totalArtifacts = m;
        for (int i = 0; i < artifacts.length; i++) {
            if (artifacts[i][3] >= col0 && artifacts[i][1] <= col0 && artifacts[i][2] >= row0 && artifacts[i][0] <= row0) {
                return digArtifacts(n, artifacts, getDig(dig, artifacts[i]));
            }
        }

        return totalArtifacts;
    }
    
    private static int[][] getDig(int[][] dig, int[] artifact) {
        List<List<Integer>> candidates = new ArrayList<>();
        int row1 = artifact[0], row2 = artifact[2];
        int col1 = artifact[1], col2 = artifact[3];
        for (int i = 0; i < dig.length; i++) {
            int digRow = dig[i][0], digCol = dig[i][1];
            if (digRow > row1) {
                candidates.add(Arrays.asList(new Integer[] {row2 + 1, col1, digRow - 1, col2}));
            }
            if (digRow < row2) {
                candidates.add(Arrays.asList(new Integer[] {row1, col1, digRow + 1, col2}));
            }
            if (digCol > col1) {
                candidates.add(Arrays.asList(new Integer[] {row1, col2 + 1, row2, digCol - 1}));
            }
            if (digCol < col2) {
                candidates.add(Arrays.asList(new Integer[] {row1, digCol + 1, row2, col2}));
            }
        }
        int[][] newDig = new int[0][0];
        if (candidates.size() > 0) {
            newDig = new int[candidates.size()][2];
            for (int i = 0; i < candidates.size(); i++) {
                newDig[i] = candidates.get(i).stream().mapToInt(j->j).toArray();
            }
        }
        return newDig;
    }
    
    private static int getPicker(int[][] dig) {
        int min = Integer.MAX_VALUE;
        int picker = -1;
        for (int i = 0; i < dig.length; i++) {
            int sum = dig[i][0] + dig[i][1];
            if (sum < min) {
                min = sum;
                picker = i;
            }
        }
        return picker;
    }
    
    public static int digArtifacts1(int n, int[][] artifacts, int[][] dig) {
        
        if (dig.length == 0 || artifacts.length == 0) return 0;
        
        int picker = getPicker(dig);
        if (picker == -1) return artifacts.length;
        
        int row0 = dig[picker][0];
        int col0 = dig[picker][1];
        int m = artifacts.length;
        int totalArtifacts = m;
        for (int i = 0; i < artifacts.length; i++) {
            if (artifacts[i][2] >= row0 && artifacts[i][0] <= row0 && artifacts[i][3] >= col0 && artifacts[i][1] <= col0) {
                totalArtifacts = Math.min(totalArtifacts, digArtifacts1(n, artifacts, getDig(dig, artifacts[i])));
            }
        }
        return totalArtifacts;
    }

}
}