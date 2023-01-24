package com.codex;

import java.util.*;

public class Solution {
public static int addRungs(int[] rungs, int dist) {
    int count = 0;
    int max = 0;
    for (int i = 0; i < rungs.length; i++) {
        if (rungs[i] > max) {
            if (rungs[i] - max > dist) {
                count++;
                max = max + dist;
            } else if (rungs[i] - max <= dist) {
                max = rungs[i];
            }
        }
    }

    return count;
}

    public static void main(String[] args) {
        int[] arr = new int[] {4, 1, 6, 8, 9, 10, 11, 13, 14, 16, 18, 22, 24, 28, 30, 34, 38, 42, 44};
        int distance = 10;
        System.out.println(addRungs(arr, distance));
        System.out.println(addRungs(new int[] {4, 1, 6, 10, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1}, 3));

    }
}

    public static int addRungs(int[] rungs, int dist) { 
        int min, max;
        if(rungs[0] < rungs[1]) {
            min = rungs[0];
            max = rungs[1];
        } else {
            max = rungs[0];
            min = rungs[1]; 
        }

        int count = 0;
        for(int i = 2; i < rungs.length; i++) {
            if(rungs[i] > max) {
                max = rungs[i];
            } else if(rungs[i] < min) {
                min = rungs[i];
            } else if(rungs[i] - min >= dist) {
                count++;
                min = max;
                max = rungs[i];
            } else {
                int num = rungs[i] + dist;
                if(num < max) {
                    min = rungs[i];
                }
            }
        }
        return count + 1;
    }
}