package com.codex;

import java.util.*;

public class Solution {
public class Solution {
  public int minimumCost(int[][] costs) {
        
        if (costs == null || costs.length == 0) {
            return 0;
        }
        int red = costs[0][0];
        int blue = costs[0][1];
        int green = costs[0][2];
        for (int i = 1; i < costs.length; i++) {
            int originalRed = red;
            int originalBlue = blue;
            int originalGreen = green;
            red = Math.min(originalBlue, originalGreen) + costs[i][0];
            blue = Math.min(originalRed, originalGreen) + costs[i][1];
            green = Math.min(originalRed, originalBlue) + costs[i][2];
        }
        return Math.min(red, Math.min(blue, green));
  }
}


public class Solution {
  public int minimumCost(int[][] costs) {
        
        if (costs == null || costs.length == 0) {
            return 0;
        }
        for (int i = 1; i < costs.length; i++) {
            costs[i][0] += Math.min(costs[i - 1][1], costs[i - 1][2]);
            costs[i][1] += Math.min(costs[i - 1][0], costs[i - 1][2]);
            costs[i][2] += Math.min(costs[i - 1][0], costs[i - 1][1]);
        }
        int n = costs.length;
        return Math.min(costs[n - 1][0], Math.min(costs[n - 1][1], costs[n - 1][2]));
  }
}



public class Solution {
     public int minimumCost(int[][] costs) {
        if (costs == null || costs.length == 0) {
            return 0;
        }
        int[][] res = new int[2][3];
        int old = 0;
        int current = 0;
        for (int i = 0; i < costs.length; i++) {
            old = current;
            current = 1 - current;
            res[current][0] = Math.min(res[old][1], res[old][2]) + costs[i][0];
            res[current][1] = Math.min(res[old][0], res[old][2]) + costs[i][1];
            res[current][2] = Math.min(res[old][0], res[old][1]) + costs[i][2];
        }
        int n = costs.length - 1;
        return Math.min(res[current][0], Math.min(res[current][1], res[current][2]));
     }
}
            }
        }
        return res;
    }
}