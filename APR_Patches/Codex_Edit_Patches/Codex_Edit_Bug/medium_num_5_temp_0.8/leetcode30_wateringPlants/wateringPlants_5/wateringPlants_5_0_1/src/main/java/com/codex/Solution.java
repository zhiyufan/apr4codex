package com.codex;

import java.util.*;

public class Solution {
    public static int wateringPlants(int[] plants, int capacity) {
        

        int steps = 0;
        int currPos = 0;
        int currCapacity = capacity;
        int smallestPlant = 0;
        for (int i = 0; i < plants.length; i++) {
            if (plants[i] < plants[smallestPlant]) {
                smallestPlant = i;
            }
        }
        while (currPos < plants.length) {
            if (currCapacity < plants[currPos]) {
                currPos = smallestPlant;
                if (currCapacity >= plants[currPos]) {
                    break;
                }
                currCapacity = capacity;
                steps++;
            }
            currCapacity -= plants[currPos];
            currPos++;
            steps++;
        }
        return steps;
    }

    public static int wateringPlants(int[] plants, int capacity) {
        int steps = 0;
        Deque<Integer> deque = new LinkedList<>();
        int currCapacity = capacity;
        int currPos = 0;
        int smallestPlant = 0;
        while (currPos < plants.length) {
            if (currCapacity < plants[currPos]) {
                if (currPos == 0) {
                    return -1;
                }
                steps++;
                currPos = smallestPlant;
                currCapacity = capacity;
                if (currPos != 0) {
                    deque.addFirst(currPos);
                }
            }
            currCapacity -= plants[currPos];
            for (int i = 0; i < plants.length; i++) {
                if (plants[i] < plants[smallestPlant]) {
                    smallestPlant = i;
                }
            }
            currPos++;
        }
        while (deque.peekLast() != null) {
            currPos = deque.pollLast();
            currCapacity = capacity;
            while (currPos < plants.length) {
                if (currCapacity < plants[currPos]) {
                    steps++;
                    currPos = smallestPlant;
                    currCapacity = capacity;
                    if (currPos != 0) {
                        deque.addFirst(currPos);
                    }
                }
                currCapacity -= plants[currPos];
                for (int i = 0; i < plants.length; i++) {
                    if (plants[i] < plants[smallestPlant]) {
                        smallestPlant = i;
                    }
                }
                currPos++;
            }
        }
        return steps;
    }
}