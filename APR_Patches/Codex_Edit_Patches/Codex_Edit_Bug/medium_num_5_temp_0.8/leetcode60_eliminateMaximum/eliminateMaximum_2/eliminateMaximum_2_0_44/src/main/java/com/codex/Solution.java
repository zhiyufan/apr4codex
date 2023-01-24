package com.codex;

import java.util.*;

public class Solution {
public static int returnMaximumEliminations(int[] dist, int[] speed) {

        /*
        * 
        * This method in O(n log n) running time.
        * 
        * The first idea is sort the given arrays according to their distance.
        * 
        * After sorting, we will have to find the result.
        * 
        * Which is the number of possible murders.
        * 
        * But, this cannot guarantee that all distances are ordered.
        * 
        * So, to gurantee that all the distances are ordered, I choose to sort the array.
        * 
        * And if we have a murder, just increase the number of possible murders.
        * 
        * We have to gurantee that the distance of murder is ordered.
        * 
        * So, I add the distance to the possible murder charge and I check the charge.
        * 
        * If the charge is negative, that means that the distance of murder is not ordered.
        * 
        * So, return the number of possible murders.
        * 
        * */

        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());

        for (int i = 0; i < dist.length; i++) {
            pq.add(-(dist[i] * speed[i]));
        }

        int count = 0;
        int charge = 0;

        while (!pq.isEmpty()) {

            charge -= pq.poll();

            count++;

            if (charge < 0) {
                break;
            }
            
        }

        return count;
    }

    
}