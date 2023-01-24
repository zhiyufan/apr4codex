package com.codex;

import java.util.*;

public class Solution {
/**
 * Definition of Interval:
 * public class Interval {
 *     int start, end;
 *     Interval(int start, int end) {
 *         this.start = start;
 *         this.end = end;
 *     }
 */
 
public class Solution {
    /**
     * @param intervals: Sorted interval list.
     * @param newInterval: new interval.
     * @return: A new interval list.
     */
     public List<Interval> merge(List<Interval> intervals, Interval newInterval) {
         // write your code here
         
         if(intervals == null || intervals.size() == 0) {
             List<Interval> res = new ArrayList<Interval>();
             res.add(newInterval);
             return res;
         }
         
         List<Interval> res = new ArrayList<Interval>();
         for(int i = 0; i < intervals.size(); ++i) {
             Interval cur = intervals.get(i);
             if(cur.end < newInterval.start) {
                 res.add(cur);
             } else if(newInterval.end < cur.start) {
                 res.add(newInterval);
                 while(i < intervals.size()) {
                     res.add(intervals.get(i++));
                 }
                 return res;
             } else {
                 newInterval.start = Math.min(newInterval.start, cur.start);
                 newInterval.end = Math.max(newInterval.end, cur.end);
             }
         }
         
         res.add(newInterval);
         
         return res;
     }
 }

    
}