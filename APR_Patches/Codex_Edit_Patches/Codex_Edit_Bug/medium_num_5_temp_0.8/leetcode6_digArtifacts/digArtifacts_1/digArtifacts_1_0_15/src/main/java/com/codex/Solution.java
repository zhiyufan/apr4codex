package com.codex;

import java.util.*;

public class Solution {
    public static int digArtifacts(int n, int[][] artifacts, int[][] dig) {
        
        int count = 0;
        Set<Integer> toRemove = new HashSet<>();
        Map<Integer, Set<int[]>> map = new HashMap<>();
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
                    map.get(index).add(artifact);
                }
            }
        }
        for (int[] digpos : dig) {
            int r = digpos[0];
            int c = digpos[1];
            int index = r * n + c;
            if (!map.containsKey(index)) continue;
            Set<int[]> set = map.get(index);
            for (int[] artifact : set) {
                toRemove.add(Arrays.hashCode(artifact));
            }
        }
        return toRemove.size();
    }

    
    int minimumMoves(vector<string>& grid, int startX, int startY, int goalX, int goalY) {
        int N = grid.size();
        if (N == 0 || startX == goalX && startY == goalY) return 0;
        unordered_set<int> set;
        set.insert(startX * N + startY);

        queue<pair<int, int>> q;
        q.push({startX, startY});
        int ret = 0;
        int x, y;
        while(!q.empty()) {
            int size = q.size();
            while (size--) {
                int x = q.front().first;
                int y = q.front().second;
                q.pop();
                for (int i = 0; i < 4; ++i) {
                    int nx = x + dirX[i];
                    int ny = y + dirY[i];
                    if (nx == goalX && ny == goalY) return ret + 1;
                    if (nx >= 0 && nx < N && ny >= 0 && ny < N && grid[nx][ny] == '.' && set.find(nx * N + ny) == set.end()) {
                        set.insert(nx * N + ny);
                        q.push({nx, ny});
                    }
                }
            }
            ret++;
        }
        return -1;
    }
    
    
    
    
    
}