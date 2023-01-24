package com.codex;

import java.util.*;

public class Solution {
import java.util.*;
class Solution {
    static int V;
    static int E;
    static int k;
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for(int tc=1; tc<=T; tc++) {
            V = sc.nextInt();
            E = sc.nextInt();
            k = sc.nextInt();
            int[][] graph = new int[V+1][V+1];
            for(int i=0; i<E; i++) {
                int v1 = sc.nextInt();
                int v2 = sc.nextInt();
                graph[v1][v2] = 1;
                graph[v2][v1] = 1;
            }
            if(dfs(graph, new boolean[V+1], k, V)) {
                System.out.println("#"+tc+" YES");
            } else {
                System.out.println("#"+tc+" NO");
            }
        }
    }

    static boolean dfs(int[][] graph, boolean[] visited, int k, int v) {
        if(k==0) return false;
        visited[v] = true;
        k--;
        for(int i=1; i<=V; i++) {
            if(!visited[i] && graph[v][i]==1) {
                if(dfs(graph, visited, k, i)) return true;
            }
        }
        return false;
    }
}
}