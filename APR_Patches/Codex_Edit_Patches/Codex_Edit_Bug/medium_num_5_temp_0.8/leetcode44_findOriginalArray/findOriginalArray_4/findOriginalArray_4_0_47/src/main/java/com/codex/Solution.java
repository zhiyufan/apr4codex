package com.codex;

import java.util.*;

public class Solution {

    public static int[] findAns(int[] changed) {
        
        if (changed[0] % 2 == 1) {
            return new int[]{};
        }
        
        int[] ans = new int[changed.length/2];
        int[] visited = new int[changed.length/2];
        HashSet<Integer> set = new HashSet<>();
        for (int i = 0; i < changed.length; i++) {
            if (set.contains(changed[i]/2)) {
                set.remove(changed[i]/2);
                visited[changed[i]/2] = 1;
            } else {
                if (changed[i] % 2 == 0) {
                    set.add(changed[i]/2);
                } else {
                    return new int[]{};
                }
            }
        }
        int[] temp = new int[changed.length/2];
        int index = 0;
        for (int i = 0; i < changed.length; i++) {
            if (visited[changed[i]/2] == 0) {
                temp[index] = changed[i]/2;
                index++;
            }
        }
        int prev = temp[0];
        for (int i = 1; i < index; i++) {
            if (temp[i] > prev) {
                return new int[0];
            }
        }
        
        int ind = 0;
        for (int i = 0; i < changed.length; i++) {
            if (visited[changed[i]/2] == 0) {
                ans[ind] = changed[i]/2;
                ind++;
            }
        }
        return ans;
    }
}