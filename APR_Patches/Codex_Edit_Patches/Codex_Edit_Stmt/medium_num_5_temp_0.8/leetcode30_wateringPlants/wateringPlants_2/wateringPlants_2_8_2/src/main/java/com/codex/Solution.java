package com.codex;

import java.util.*;

public class Solution {
    public static int wateringPlants(int[] plants, int capacity) {
        
        int steps = 0;
        int i = 0;
        int x = -1;
        int water = capacity;
        while (i < plants.length) {
            if (x >= 0) {
                if (water < plants[i]) {
                    steps++;
                    water = capacity;
                    x = -1;
                } else {
                    steps++;
                    water -= plants[i];
                    i++;
                    x++;
                }
            } else {
                water = capacity;
                steps++;
                x = 0;
            }
        }
        return steps;
    }
   
   class BoundedQueue<T> {

    private Object[] queue;
    private int firstIndex;
    private int lastIndex;
    private int size = 0;

    BoundedQueue(int size) {
        this.size = size;
        queue = new Object[size];
        firstIndex = -1;
        lastIndex = -1;
    }

    public void enqueue(T obj) {
        if (isFull()) {
            System.out.println("Queue is Full");
            return;
        }
        if (firstIndex == -1 && lastIndex == -1) {
            firstIndex++;
            lastIndex++;
        } else if (lastIndex == size - 1) {
            lastIndex = 0;
        } else {
            lastIndex++;
        }
        queue[lastIndex] = obj;
    }

    public T dequeue() {
        if (isEmpty()) {
            System.out.println("Queue is Empty");
            return null;
        }
        if (firstIndex == lastIndex) {
            int aux = firstIndex;
            firstIndex = -1;
            lastIndex = -1;
            return (T) queue[aux];
        }
        if (firstIndex == size - 1) {
            firstIndex = 0;
        } else {
            firstIndex++;
        }
        return (T) queue[firstIndex];
    }

    public T first() {
        if (isEmpty()) {
            System.out.println("Queue is Empty");
            return null;
        }
        return (T) queue[lastIndex];
    }

    public T last() {
        if (isEmpty()) {
            System.out.println("Queue is Empty");
            return null;
        }
        return (T) queue[firstIndex];
    }

    public boolean isFull() {
        return (lastIndex + 1 == firstIndex || firstIndex - 1 == lastIndex) ? true : false;
    }

    public boolean isEmpty() {
        return (firstIndex == -1 && lastIndex == -1) ? true : false;
    }
}
}