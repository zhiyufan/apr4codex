package com.codex;

import java.util.*;

public class Solution {
public class Solution {
    /**
     * @param colors: A list of integer
     * @param k: An integer
     * @return: nothing
     */
    public void sortColors2(int[] colors, int k) {
        // write your code here
        int begin = 0;
        int end = colors.length - 1;
        int len = colors.length - 1;
        while (begin < end) {
            while (colors[begin] <= k && begin < len) {
                begin++;
            }
            while (colors[end] > k && end > 0) {
                end--;
            }
            if (begin < end) {
                swap(colors, begin, end);
                begin++;
                end--;
            }
        }
        if (colors[begin] > k) {
            quicksort(colors, 0, begin - 1, k);
        }
        else {
            quicksort(colors, begin + 1, colors.length - 1, k);
        }
    }
    
    public void quicksort(int[] colors, int begin, int end, int k) {
        if (begin > end) {
            return;
        }
        int pivot = partition(colors, begin, end, k);
        quicksort(colors, begin, pivot - 1, k);
        quicksort(colors, pivot + 1, end, k);
    }
    
    public int partition(int[] colors, int begin, int end, int k) {
        int i = begin;
        int j = end;
        int pivot = colors[i];
        while (i < j) {
            while (i < j && colors[j] > k) {
                j--;
            }
            if (i < j) {
                colors[i] = colors[j];
                i++;
            }
            while (i < j && colors[i] <= k) {
                i++;
            }
            if (i < j) {
                colors[j] = colors[i];
                j--;
            }
        }
        colors[i] = pivot;
        return i;
    }
    
    public void swap(int[] colors, int i, int j) {
        int tmp = colors[i];
        colors[i] = colors[j];
        colors[j] = tmp;
    }
}

/*
public static int maxDistance(int[] colors) {
        int n = colors.length;
        int[][] range = new int[3][2];
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
*/
}