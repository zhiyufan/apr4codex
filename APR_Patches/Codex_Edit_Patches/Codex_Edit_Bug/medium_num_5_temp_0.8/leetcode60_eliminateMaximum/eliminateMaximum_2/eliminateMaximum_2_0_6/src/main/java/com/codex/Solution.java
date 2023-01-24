package com.codex;

import java.util.*;

public class Solution {
    public static int eliminateMaximum(int[] dist, int[] speed) {
        //Sort the speed array in a decreasing order
        Arrays.sort(speed);
        //Reverse the speed array
        reverse(speed);
        //Track the number of car in charge
        int count = 0;
        //Track the distance
        int sum = 0;
        //Iterate the distance array
        for (int i = 0; i < dist.length; i++) {
            pq.add(dist[i] * speed[i]);
        }
        int count = 0;
        int charge = 0;
        while (!pq.isEmpty()) {
            charge += pq.poll();
            count++;
            if (charge < 0) {
                break;
            }
        }
        return count;
    }

    
}