package com.codex;

import java.util.*;

public class Solution {
    public static int eliminateMaximum(int[] dist, int[] speed) {
        
        int[] sortedSpeed = new int[speed.length];
        for(int i = 0; i < sortedSpeed.length; i++) {
            sortedSpeed[i] = speed[i];
        }
        Arrays.sort(sortedSpeed);
        
        for(int i = 0; i < dist.length; i++) {
            int temp = 0, temp1 = 0;
            for(int j = 0; j < dist.length; j++) {
                if(sortedSpeed[i] == speed[j]) {
                    temp = j;
                    break;
                }
            }
            
            for(int k = 0; k < dist.length; k++) {
                if( i == 0) {
                    if(speed[k] > speed[temp]) {
                        temp1 = k;
                        break;
                    }
                }
                else {
                    if( sortedSpeed[i-1] < speed[k] && speed[k] < speed[temp]) {
                        temp1 = k;
                        break;
                    }
                }
            }
            
            if(dist[temp] < dist[temp1]) {
                return temp;
            }
            else {
                if( i == 0) {
                    return temp1;
                }
                else {
                    if(dist[temp] == dist[temp1]) {
                        if(speed[temp] > speed[temp1]) {
                            return temp;
                        }
                        else {
                            return temp1;
                        }
                    }
                    else {
                        return temp1;
                    }
                }
            }
            
        }
        return -1;
    }

    /*
        int[] time = new int[dist.length];
        for(int i = 0; i < time.length; i++) {
            time[i] = dist[i] * speed[i];
        }
        Arrays.sort(time);
        int maxIndex = 0;
        for(int i = 0; i < time.length; i++) {
            if(time[i] < 0) {
                maxIndex++;
            }
        }
        return maxIndex;
    }

    */
}