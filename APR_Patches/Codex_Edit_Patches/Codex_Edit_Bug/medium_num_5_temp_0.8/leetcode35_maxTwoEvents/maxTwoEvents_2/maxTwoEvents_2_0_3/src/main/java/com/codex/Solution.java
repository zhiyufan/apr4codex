package com.codex;

import java.util.*;

public class Solution {
public class Solution {
    public int maxEvents(int[][] events) {
        //Sorting the intervals based on starting time
        Arrays.sort(events, new Comparator<int[]>(){
            @Override
            public int compare(int[] entry1, int[] entry2) {
                if(entry2[0]>entry1[0])
                    return 1;
                if(entry2[0]<entry1[0])
                    return -1;
                return 0;
            }
        });
        int res=0;
        //Creating a max heap
        Queue<Integer> heap=new PriorityQueue<>(new Comparator<Integer>(){
            @Override
            public int compare(Integer entry1, Integer entry2) {
                if(entry2>entry1)
                    return 1;
                if(entry2<entry1)
                    return -1;
                return 0;
            }
        });
        int i=0;
        for(int d=1; d<=100000; d++) {
            //Adding the events to heap with end time=d
            while(i<events.length && events[i][0]<=d)
                heap.offer(events[i++][1]);
            while(!heap.isEmpty()){
                //Checking if the event is ending before or on that day
                if(heap.peek()<d)
                    heap.poll();
                //else, we attend the event
                else{
                    heap.poll();
                    res++;
                    break;
                }
            }
        }
        return res;
    }

}
}