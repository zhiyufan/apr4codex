package com.codex;

import java.util.*;

public class Solution {
public class Solution {
    public int[][] reconstructQueue(int[][] people) {
        if (people == null || people.length == 0 || people[0].length == 0) {
            return new int[0][0];
        }
        Arrays.sort(people, new Comparator<int[]>() {
            public int compare(int[] a, int[] b) {
                if (b[0] == a[0]) {
                    return a[1] - b[1];
                }
                return b[0] - a[0];
            }
        });
        int n = people.length;
        List<int[]> res = new ArrayList<int[]>();
        for (int i = 0; i < n; i++) {
            res.add(people[i][1], new int[]{people[i][0], people[i][1]});
        }    
        return res.toArray(new int[people.length][]);
    }
}
    
}