package com.codex;

import java.util.*;

public class Solution {
    public static int maxDistance(int[] colors) {
        
        int n = colors.length;

		// java 初始化二维数组，有三种方法：
		// 创建一个二维数组：
		// 方法一：
        int[][] range = new int[3][2];
		// 方法二：
		// int[][] range = new int[3][];
		// 方法三：
		// int[][] range;
		// ...
		// range = new int[3][];
		// java 数组初始化
		// 初始化一维数组：
		// int[] arr = new int[3] {1,2,3};
		// 初始化二维数组：
		// int[][] arr = new int[3][]{ {1,2,3}, {4,5,6}, {7,8,9} };

        for (int i = 0; i < 3; i++) {
            range[i] = new int[]{n, -1};
        }
        for (int i = 0; i < n; i++) {
            range[colors[i]][0] = Math.min(range[colors[i]][0], i);
            range[colors[i]][1] = Math.max(range[colors[i]][1], i);
        }
        int minDis = n - 1;
        for (int i = 0; i < 3; i++) {
            for (int j = i + 1; j < 3; j++) {
                minDis = Math.min(minDis, Math.abs(range[i][0] - range[j][1]));
                minDis = Math.min(minDis, Math.abs(range[j][0] - range[i][1]));
            }
        }
        return minDis;
    }
}