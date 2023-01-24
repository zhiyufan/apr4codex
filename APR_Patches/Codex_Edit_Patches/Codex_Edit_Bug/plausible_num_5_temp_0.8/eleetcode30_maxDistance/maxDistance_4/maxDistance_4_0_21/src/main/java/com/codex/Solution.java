package com.codex;

import java.util.*;

public class Solution {
    #include <stdio.h>
    #include <pthread.h>
    #include <stdlib.h>
    
    void* threadFunc(void* arg){
      printf("Hola desde hilo %d\n", (int)arg);
      pthread_exit(NULL);
    }
    
    int main(int argc, char* argv[]){
    
      int n = atoi(argv[1]);
      pthread_t hilos[n];
    
      for(int i=0; i<n; i++){
        pthread_create(&hilos[i], NULL, threadFunc, (void*)i);
      }
    
      for(int i=0; i<n; i++){
        pthread_join(hilos[i], NULL);
      }
    
      return 0;
    }
    
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
}