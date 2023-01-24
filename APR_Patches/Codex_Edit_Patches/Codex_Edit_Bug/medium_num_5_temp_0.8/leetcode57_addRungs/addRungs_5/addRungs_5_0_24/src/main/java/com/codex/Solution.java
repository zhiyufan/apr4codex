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
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        int s = scanner.nextInt();
        for (int i = 0; i < s; i++) {
            int n = scanner.nextInt();
            int k = scanner.nextInt();
            int[] arr = new int[n];
            for (int j = 0; j < n; j++) {
                arr[j] = scanner.nextInt();
            }
            System.out.println(addRungs(arr, k));
        }

    }
    }

    
}