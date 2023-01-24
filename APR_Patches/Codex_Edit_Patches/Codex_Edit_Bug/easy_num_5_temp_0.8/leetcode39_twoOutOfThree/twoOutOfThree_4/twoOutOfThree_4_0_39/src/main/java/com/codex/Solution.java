package com.codex;

import java.util.*;

public class Solution {
public class Solution {
    public int[] findOrder(int numCourses, int[][] prerequisites) {
        if(numCourses==0) return new int[0];
        if(prerequisites==null || prerequisites.length==0) {
            int[] re = new int[numCourses];
            for(int i=0;i<numCourses;i++) {
                re[i] = i;
            }
            return re;
        }

        List[] graph = new List[numCourses];
        for(int i=0;i<numCourses;i++) {
            graph[i] = new ArrayList<Integer>();
        }
        Set<Integer> set = new HashSet<>();
        for(int i=0;i<prerequisites.length;i++){
            int[] edge = prerequisites[i];
            graph[edge[1]].add(edge[0]);
            set.add(edge[0]);
        }

        Set<Integer> visited = new HashSet<>();
        Stack<Integer> stack = new Stack<>();
        for(int i=0;i<graph.length;i++) {
            if(!dfs(i, graph, visited, stack)) return new int[0];
        }

        int[] res = new int[numCourses];
        int i=0;
        while(!stack.isEmpty()) {
            res[i++] = stack.pop();
        }

        if(i<numCourses) {
            while(i<numCourses){
                if(!set.contains(res[i])) return new int[0];
                i++;
            }
        }

        return res;
    }

    boolean dfs(int node, List<Integer>[] graph, Set<Integer> visited, Stack<Integer> stack) {
        if(visited.contains(node)) return true;

        List<Integer> list = graph[node];
        for(int n: list) {
            if(visited.contains(n)) return false;
            if(!dfs(n, graph, visited, stack)) return false;
        }

        visited.add(node);
        stack.push(node);
        return true;
    }

}
}