package com.codex;

import java.util.*;

public class Solution {
    public static int eliminateMaximum(int[] dist, int[] speed) {
        

        PriorityQueue<Double> pq = new PriorityQueue<>();
        for (int i = 0; i < dist.length; i++) {
            pq.add((double) dist[i] / speed[i]);
        }
        double cur = pq.poll();
        int count = 0;
        while (!pq.isEmpty() && pq.peek() - cur <= 1) {
            count++;
            pq.poll();
        }
        if (pq.isEmpty()) return dist.length;
        return count;


    public static void main(String[] args) {
        Time t = new Time(14, 30);
        Time t2 = new Time(14, 30);
        System.out.println(t.timeCompare(t2));
    }

}

class Time {
    private int minutes;
    int hours;

    public Time(int hours, int minutes) {
        this.minutes = hours * 60 + minutes;
    }
    
    public int timeCompare(Time t) {
        if (this.minutes > t.minutes) return 1;
        if (this.minutes < t.minutes) return -1;
        return 0;
    }
}
    }

    
}