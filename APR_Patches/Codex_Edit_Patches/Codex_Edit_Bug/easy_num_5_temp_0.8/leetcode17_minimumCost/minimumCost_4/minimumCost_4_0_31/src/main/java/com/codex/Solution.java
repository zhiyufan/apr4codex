package com.codex;

import java.util.*;

public class Solution {
public class Solution {
    public int minimumCost(int N, int[][] connections) {
        Arrays.sort(connections, (a, b) -> (a[2] - b[2]));
        int res = 0;
        UnionFind unionFind = new UnionFind(N);
        int index = 0;
        while (!unionFind.isUnion() && index < connections.length) {
            int i = connections[index][0] - 1;
            int j = connections[index][1] - 1;
            if (!unionFind.isConnected(i, j)) {
                res += connections[index][2];
                unionFind.connect(i, j);
            }
            index++;
        }
        if (!unionFind.isUnion()) {
            return -1;
        }
        return res;
    }
}

public class UnionFind {
    private int[] nums;
    
    public UnionFind(int n) {
        nums = new int[n];
        for (int i = 0; i < n; i++) {
            nums[i] = i;
        }
    }
    
    public int find(int i) {
        if (nums[i] == i) {
            return i;
        }
        return find(nums[i]);
    }
    
    public void connect(int i, int j) {
        int iRoot = find(i);
        int jRoot = find(j);
        if (iRoot != jRoot) {
            nums[iRoot] = jRoot;
            nums[i] = jRoot;
        }
        
    }
    
    public boolean isConnected(int i, int j) {
        return find(i) == find(j);
    }
    
    public boolean isUnion() {
        int root = find(nums[0]);
        for (int i = 1; i < nums.length; i++) {
            if (find(nums[i]) != root) {
                return false;
            }
        }
        return true;
    }
}
}