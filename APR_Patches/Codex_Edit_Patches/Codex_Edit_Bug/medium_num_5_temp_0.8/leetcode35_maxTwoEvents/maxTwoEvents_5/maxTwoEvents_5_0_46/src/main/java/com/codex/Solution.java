package com.codex;

import java.util.*;

public class Solution {
public class Event {
    int startTime;
    int endTime;
    int distance;

    public Event(int startTime, int endTime, int distance) {
        this.startTime = startTime;
        this.endTime = endTime;
        this.distance = distance;
    }

    public int getStartTime() {
        return startTime;
    }

    public int getEndTime() {
        return endTime;
    }

    public int getDistance() {
        return distance;
    }
}

public class Solution {
    public static int maxTwoEvents(Event[] events) {
        Arrays.sort(events, new Comparator<Event>() {
            public int compare(Event a, Event b) {
                return a.getEndTime() - b.getEndTime();
            }
        });
        int N = events.length;
        int[] dp = new int[N + 1];
        for (int i = 1; i <= N; i++) {
            dp[i] = Math.max(dp[i-1], dp[i-1] + events[i-1].getDistance());
        }
        return dp[N];
    }

    public static void main(String args[]) {
        Event event1 = new Event(1, 5, 10);
        Event event2 = new Event(6, 10, 20);
        Event event3 = new Event(10, 13, 30);
        Event event4 = new Event(11, 13, 40);
        Event[] events = {event1, event2, event3, event4};
        System.out.println(maxTwoEvents(events));
    }
}
    
}