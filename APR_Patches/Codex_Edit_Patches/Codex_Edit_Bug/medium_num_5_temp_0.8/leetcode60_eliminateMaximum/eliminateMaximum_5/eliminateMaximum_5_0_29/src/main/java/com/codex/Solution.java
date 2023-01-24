package com.codex;

import java.util.*;

public class Solution {
    public static int eliminateMaximum(int[] dist, int[] speed) {
        
        int maxIndex = 0;
        for (int i = 1; i < dist.length; i++) {
            if (dist[i] > dist[maxIndex]) {
                maxIndex = i;
                continue;
            }
            if (dist[i] == dist[maxIndex] && speed[i] > speed[maxIndex]) {
                maxIndex = i;
            }
        }
        int count = 1;
        for (int i = 0; i < maxIndex; i++) {
            if (dist[i] - dist[maxIndex] <= speed[i] * speed[maxIndex]) {
                count++;
            }
        }
        return count;
    }
    
 public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] dist = new int[n];
        int[] speed = new int[n];

        for (int i = 0; i < n; i++) {
            dist[i] = scanner.nextInt();
            speed[i] = scanner.nextInt();
        }
        int result = eliminateMaximum(dist, speed);
        System.out.println(result);
    }
}
}