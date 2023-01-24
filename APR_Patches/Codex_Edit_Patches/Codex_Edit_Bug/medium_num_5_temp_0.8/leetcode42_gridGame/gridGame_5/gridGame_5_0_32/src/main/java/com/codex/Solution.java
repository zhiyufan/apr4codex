package com.codex;

import java.util.*;

public class Solution {
public static boolean checkStraightLine(int[][] coordinates) {
        
        int n = coordinates.length;
        
        if(n<=2){
            return true;
        }
        
        int x0 = coordinates[0][0];
        int y0 = coordinates[0][1];
        int x1 = coordinates[1][0];
        int y1 = coordinates[1][1];
        
        for (int i = 2; i < n; i++) {
            int xi = coordinates[i][0];
            int yi = coordinates[i][1];
            if (x1 - x0 != 0) {
                if ((xi - x0) * (y1 - y0) != (yi - y0) * (x1 - x0)) {
                    return false;
                }
            } else if (x0 - x1 != 0) {
                if ((xi - x1) * (y0 - y1) != (yi - y1) * (x0 - x1)) {
                    return false;
                }
            } else if (x1 - x0 == 0 && x0 - x1 == 0) {
                if (xi - x1 != 0 || x0 - xi != 0) {
                    return false;
                }
            }
        }
        return true;
    }
	
	
	public class Solution {
    Map<Integer, Integer> parent;
    public int makeConnected(int n, int[][] connections) {
        
        if(connections.length<n-1){
            return -1;
        }
        
        parent = new HashMap<>();
        for (int i = 0; i < n; i++) {
            parent.put(i, i);
        }
        
        int connectedComponents = n;
        
        for (int[] connection : connections) {
            int parent1 = find(connection[0]);
            int parent2 = find(connection[1]);
            if (parent1 != parent2) {
                parent.put(parent1, parent2);
                connectedComponents -= 1;
            }
        }
        return connectedComponents - 1;
    }
    
    private int find(int p) {
        while (p != parent.get(p)) {
            parent.put(p, parent.get(parent.get(p)));
            p = parent.get(p);
        }
        return p;
    }
}


	
	
	class Solution {
    public int findMaxLength(int[] nums) {
        
        if(nums.length<2){
            return 0;
        }
        
        Map<Integer, Integer> map = new HashMap<>();
        int maxLength = 0;
        int count = 0;
        
        for (int i = 0; i < nums.length; i++) {
            if(nums[i]==1){
                count += 1;
            }else{
                count -= 1;
            }
            
            if(count==0){
                maxLength = Math.max(maxLength, i+1);
            }
            
            if(map.containsKey(count)){
                maxLength = Math.max(maxLength, i-map.get(count));
            }else{
                map.put(count, i);
            }
        }
        
        return maxLength;
    }
}


class Solution {
    public boolean isPowerOfTwo(int n) {
        
        if (n == 0) return false;
        
        while (n != 1) {
            if (n%2 != 0) return false;
            n = n/2;
        }
        
        return true;
    }
}






public static long gridGame(int[][] grid) {
        
        int m = grid[0].length;
        int[] grid1 = new int[m];
        int[] grid2 = new int[m];
        for (int i = 0; i < m; i++) {
            grid1[i] = grid[0][i];
            grid2[i] = grid[1][i];
        }
        Arrays.sort(grid1);
        Arrays.sort(grid2);
        int sum = 0;
        for (int i = 0; i < m; i++) {
            if (grid1[i] > grid2[i]) {
                sum += grid2[i];
            } else {
                sum += grid1[i];
            }
        }
        return sum;
    }

    
}