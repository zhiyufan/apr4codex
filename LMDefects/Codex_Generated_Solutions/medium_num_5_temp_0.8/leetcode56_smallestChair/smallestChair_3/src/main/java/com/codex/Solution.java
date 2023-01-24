package com.codex;

import java.util.*;

public class Solution {
    public static int smallestChair(int[][] times, int targetFriend) {
        /** There is a party where n friends numbered from 0 to n - 1 are attending. There is an infinite number of chairs in this party that are numbered from 0 to infinity. When a friend arrives at the party, they sit on the unoccupied chair with the smallest number.
         * For example, if chairs 0, 1, and 5 are occupied when a friend comes, they will sit on chair number 2.
         * When a friend leaves the party, their chair becomes unoccupied at the moment they leave. If another friend arrives at that same moment, they can sit in that chair.
         * You are given a 0-indexed 2D integer array times where times[i] = [arrivali, leavingi], indicating the arrival and leaving times of the ith friend respectively, and an integer targetFriend. All arrival times are distinct.
         * Return the chair number that the friend numbered targetFriend will sit on.
         */
        Map<Integer, Integer> incoming = new HashMap<>();
        Map<Integer, Integer> outgoing = new HashMap<>();

        for (int i = 0; i < times.length; i++) {
            if (!incoming.containsKey(times[i][0])) {
                incoming.put(times[i][0], i);
            }
            outgoing.put(times[i][1], i);
        }

        Set<Integer> friends = new HashSet<>();
        int chair = 0;

        for (int time : incoming.keySet()) {
            while (outgoing.containsKey(time)) {
                friends.remove(outgoing.get(time));
                outgoing.remove(time);
            }
            if (!friends.contains(incoming.get(time))) {
                friends.add(incoming.get(time));
                if (incoming.get(time) == targetFriend) {
                    return chair;
                }
            }
            chair++;
        }
        return -1;
    }

    }