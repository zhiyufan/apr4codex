package com.codex;

import java.util.*;

public class Solution {
int maxDistToClosest(vector<int>& seats) {
        int len = seats.size();
        vector<int> dist(len, -1);
        int last = len;
        for (int i = 0; i < len; i++) {
            if (seats[i] == 1) {
                
                for(int j = i; j < len; j++) {
                    if(dist[j] == -1)
                        dist[j] = i;
                }
                last = i;
            }
        }
        
        for (int i = 0; i < len; i++) {
            if (dist[i] == -1)
                dist[i] = last;
        }
        
        int max = -1;
        for(int i = 0; i < len; i++) {
            if(seats[i] == 0) {
                if(abs(i - dist[i]) > max) {
                    max = abs(i - dist[i]);
                }
            }
        }
        return max;
    }    
}