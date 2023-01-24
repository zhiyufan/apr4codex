package com.codex;

import java.util.*;

public class Solution {
import java.util.*;

public class Testing {
    public static void main(String[] args) {
        int[][] artifacts = {{2,1,3,3}, {3,1,4,2}, {1,3,2,4}, {2,2,3,3}};
        int[][] dig = {{2,2}};
        System.out.println(digArtifacts(4, artifacts, dig));
    }


    public static int digArtifacts(int n, int[][] artifacts, int[][] dig) { 
        Set<Integer> removed = new HashSet<>();
        Map<Integer, Set<Integer>> map = new HashMap<>();
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
                    map.get(index).add(i);
                } 
            } 
        } 
        for (int[] digpos : dig) { 
            int r = digpos[0]; 
            int c = digpos[1]; 
            int index = r * n + c; 
            if (!map.containsKey(index)) continue; 
            Set<Integer> set = map.get(index); 
            for (int artifact : set) { 
                if (!removed.contains(artifact)) removed.add(artifact);
            } 
        }
        return removed.size();
    }

}
    
}