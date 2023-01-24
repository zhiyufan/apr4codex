package com.codex;

import java.util.*;

public class Solution {
//Implement a friend class that is comparable to the Chair class

public class Friend implements Comparable<Friend> {

    //time[0] is the time of arrival, time[1] is the time of departure
    private final int[] time;
    private final int id;


    public Friend(int[] time, int id) {
        this.time = time;
        this.id = id;
    }

    public int[] getTime() {
        return time;
    }

    public int getId() {
        return id;
    }

    @Override
    public int compareTo(Friend other) {
        return time[0] - other.getTime()[0];
    }
}


//Function to allocate chairs to the friends

public static int smallestChair(int[][] times, int targetFriend) {

    ArrayList<Friend> friends = new ArrayList<>();
    for (int i = 0; i < times.length; i++) {
        friends.add(new Friend(times[i], i));
    }
    Collections.sort(friends);
    int currMax = 0;
    for (Friend friend : friends) {
        currMax = Math.max(currMax, friend.getTime()[0]);
        currMax = Math.max(currMax, friend.getTime()[1]);
    }
    int[] chairs = new int[currMax+1];
    for (Friend friend : friends) {
        for (int i = friend.getTime()[0]; i < friend.getTime()[1]; i++) chairs[i]++;
    }
    for (int i = 0; i < chairs.length; i++) {
        if (chairs[i] == targetFriend) return i;
    }
    return -1;
}


//Function to allocate chairs to the friends without sorting

public static int smallestChair(int[][] times, int targetFriend) {
    int currMax = 0;
    for (int[] time : times) {
        currMax = Math.max(currMax, time[0]);
        currMax = Math.max(currMax, time[1]);
    }
    int[] chairs = new int[currMax+1];
    for (int[] time : times) {
        for (int i = time[0]; i < time[1]; i++) chairs[i]++;
        }
    for (int i = 0; i < chairs.length; i++) {
        if (chairs[i] == targetFriend) return i;
    }

    return -1;
}
}