package com.codex;

import java.util.*;

public class Solution {
import java.util.*;
import java.util.Scanner;

class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] dist = new int[n];
        int[] speed = new int[n];
        for (int i = 0; i < n; i++) {
            dist[i] = in.nextInt();
        }
        for (int i = 0; i < n; i++) {
            speed[i] = in.nextInt();
        }

        int result = eliminateMaximum(dist, speed);
        System.out.println(result);

    }

    public static int eliminateMaximum(int[] dist, int[] speed) {
        
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
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
    
}