package com.codex;

import java.util.*;

public class Solution {
    public static int[][] construct2DArray(int[] original, int m, int n) {
        
        int[][] result = new int[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (i * n + j < original.length) {
                    result[i][j] = original[i * n + j];
                }
            }
        }
        return result;
    }



class Solution {
    public int[][] reconstructQueue(int[][] people) {
        //greedy
        //sort based on h first
        //then sort k
        //then from begining, start form first element
        //loop h
        //insert the value from h to current index
        //insert into k position
        //for after k, shift the value
        //return the result
        //Make dic(key - h, value - List of k)
        //this can avoid sorting based on k
        if (people == null || people.length == 0) {
            return people;
        }
        Map<Integer, List<Integer>> hDic = new TreeMap<>((a, b) -> Integer.compare(b, a));
        int[][] result = new int[people.length][people[0].length];
        int[] visited = new int[people.length];
        for (int i = 0; i < people.length; i++) {
            if (hDic.containsKey(people[i][0])) {
                hDic.get(people[i][0]).add(people[i][1]);
                hDic.put(people[i][0], hDic.get(people[i][0]));
            } else {
                List<Integer> list = new ArrayList<>();
                list.add(people[i][1]);
                hDic.put(people[i][0], list);
            }
        }
        int index = 0;
        for (Integer h : hDic.keySet()) {
            List<Integer> list = hDic.get(h);
            Collections.sort(list);
            for (Integer k : list) {
                int count = 0;
                for (int i = 0; i < visited.length; i++) {
                    if (visited[i] == 1) {
                        continue;
                    }
                    if (count == k) {
                        result[i][0] = h;
                        result[i][1] = k;
                        visited[i] = 1;
                        break;
                    }
                    count++; 
                }
            }
        }
        return result;
    }
}
    
}