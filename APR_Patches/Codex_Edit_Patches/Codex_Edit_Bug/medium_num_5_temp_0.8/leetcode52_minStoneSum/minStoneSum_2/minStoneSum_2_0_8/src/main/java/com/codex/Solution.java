package com.codex;

import java.util.*;

public class Solution {
    public class Solution {
    public int minMeetingRooms(int[][] intervals) {
        if(intervals.length == 0 || intervals == null) return 0;
        int[] start = new int[intervals.length];
        int[] end = new int[intervals.length];
        for(int i = 0; i < intervals.length; i++){
            start[i] = intervals[i][0];
            end[i] = intervals[i][1];
        }
        Arrays.sort(start);
        Arrays.sort(end);
        int room = 0;
        int endIndex = 0;
        for(int i = 0;  i< intervals.length; i++){
            if(start[i] < end[endIndex]){
                room++;
            }else{
                endIndex++;
            }
        }
        return room;
    }
}
}