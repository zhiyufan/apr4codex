package com.codex;

import java.util.*;

public class Solution {
import java.util.HashMap;
import java.util.LinkedList;
import java.util.PriorityQueue;


public class Main {


    public static int smallestChair(int[][] times, int targetFriend) {
        LinkedList<Interval> list = new LinkedList<>();
        PriorityQueue<Integer> heap = new PriorityQueue<>();
        int currMax = 0;
        for (int[] time : times) {
            currMax = Math.max(currMax, time[0]);
            currMax = Math.max(currMax, time[1]);
        }
        //int[] chairs = new int[currMax+1];
        for (int[] time : times) {
            list.add(new Interval(time[0], time[1]));
            //for (int i = time[0]; i < time[1]; i++) chairs[i]++;
        }
        /*
        for (int i = 0; i < chairs.length; i++) {
            if (chairs[i] == targetFriend) return i;
        }
        */
        int start = currMax;
        int end = currMax;
        int mid = 0;
        while (start < end) {
            mid = (start + end)/2;
            int count = 0;
            for (Interval inter : list) {
                if (inter.end >= mid && inter.start <= mid) count++;
                if (count > targetFriend) {
                    start = mid+1;
                    break;
                }
            }
            if (count <= targetFriend) {
                end = mid;
            }
        }
        return start;
    }

    public static void main(String[] args) {
        int[][] times = {{1,100},{100,200}};
        int targetFriend = 3;
        System.out.println(smallestChair(times, targetFriend));
    }
}


class Interval {
    int start;
    int end;
    Interval(int start, int end) {
        this.start = start;
        this.end = end;
    }
}
}