package com.codex;

import java.util.*;

public class Solution {
class Solution {
    public int minTimeToVisitAllPoints(int[][] points) {
        int point1 = points[0][0], point2 = points[0][1];
        int res = 0;
         for(int i = 1; i < points.length; i++) {
             int point3 = points[i][0], point4 = points[i][1];
             res += Math.max(Math.abs(point3 - point1), Math.abs(point4 - point2));
             point1 = point3;
}
             point2 = point4;
        }
        return res;
    }
}