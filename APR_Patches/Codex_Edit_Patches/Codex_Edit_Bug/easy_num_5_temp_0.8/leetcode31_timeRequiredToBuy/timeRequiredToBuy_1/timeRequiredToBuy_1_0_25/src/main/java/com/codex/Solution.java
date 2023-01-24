package com.codex;

import java.util.*;

public class Solution {
    //Taken from https://github.com/matthewsamuel95/Codility-Problems-and-Solutions/blob/master/Lesson1/perm_missing_elem.cpp    
    public static int solution(int[] A) {
        int n = A.length;
        int sum = 0;
        for (int i=0; i<n; i++) {
            sum += A[i];
        }
        return n+1 - (sum - (n+1)*(n+2)/2);
    }


    //Taken from https://github.com/matthewsamuel95/Codility-Problems-and-Solutions/blob/master/Lesson2/perm_check.cpp
    public int solution(int[] A) {
        int n = A.length;
        int[] counter = new int[n];
        for (int i=0; i<n; i++) {
            if (A[i] > n) {
                return 0;
            }
            else {
                counter[A[i]-1] = 1;
            }
        }
        int result = 1;
        for (int i=0; i<n; i++) {
            result = result & counter[i];
        }
        return result;
    }

    //Taken from https://github.com/matthewsamuel95/Codility-Problems-and-Solutions/blob/master/Lesson3/frog_jmp.cpp
    public int solution(int X, int Y, int D) {
        return (Y-X)/D + (((Y-X)%D) == 0 ? 0 : 1);
    }

    //Taken from https://github.com/matthewsamuel95/Codility-Problems-and-Solutions/tree/master/Lesson4
    public int solution(int[] A) {
        int n = A.length;
        if (n == 0)
            return -1;
        if (n == 1)
            return 0;
        int[] prefixes = new int[n+1];
        for (int i=0; i<n; i++) {
            prefixes[i+1] = prefixes[i] + A[i];
        }
        int minDiff = prefixes[n]-prefixes[0];
        int result = 0;
        for (int i=1; i<n; i++) {
            int diff = Math.abs(prefixes[i-1] - (prefixes[n]-prefixes[i]));
            if (diff < minDiff) {
                minDiff = diff;
                result = i;
            }
        }
        return result;
    }

    //Taken from https://github.com/matthewsamuel95/Codility-Problems-and-Solutions/blob/master/Lesson5/passing_cars.cpp
    public int solution(int[] A) {
        int n = A.length;
        int[] prefixes = new int[n+1];
        for (int i=0; i<n; i++) {
            prefixes[i+1] = prefixes[i] + A[i];
        }
        int count = 0;
        for (int i=0; i<n; i++) {
            if (A[i] == 0) {
                count += (prefixes[n] - prefixes[i+1]);
                if (count > 1000000000)
                    return -1;
            }
        }
        return count;
    }


    //Taken from https://github.com/matthewsamuel95/Codility-Problems-and-Solutions/blob/master/Lesson6/number_of_disc_intersections.cpp

    public int solution(int[] A) {
        int n = A.length;
        Point[] points = new Point[2*n];
        for (int i=0; i<n; i++) {
            points[2*i] = new Point(i-A[i], false);
            points[2*i+1] = new Point(i+A[i], true);
        }
        Arrays.sort(points);
        int c = 0;
        int r = 0;
        for (int i=0; i<2*n; i++) {
            if (!points[i].open)
                c++;
            else
                r++;
            if (points[i].open && c > 0) {
                if (c < r)
                    r -= c;
                else
                    r = 0;
                c = 0;
            }
        }
        return r;
    }


    //Taken from https://github.com/matthewsamuel95/Codility-Problems-and-Solutions/blob/master/Lesson7/fish.java
    public int solution(int[] A, int[] B) {
        int n = A.length;
        int count = 0;
        if (n == 0)
            return 0;
        Stack<Integer> stack = new Stack<Integer>();
        int i = 0;
        while (i<n) {
            if (B[i] == 1) {
                stack.push(i);
                count++;
            }
            else {
                while (stack.size() > 0) {
                    int p = stack.peek();
                    if (B[p] == 1 && A[p] < A[i]) {
                        stack.pop();
                        count--;
                    }
                    else if (B[p] == 1 && A[p] > A[i]) {
                        count--;
                        break;
                    }
                }
                if (stack.size() == 0)
                    count++;
            }
            i++;
        }
        return count;
    }


    //Taken from https://github.com/matthewsamuel95/Codility-Problems-and-Solutions/blob/master/Lesson8/dominator.cpp

    public int solution(int[] A) {
        int n = A.length;
        if (n == 0)
            return -1;
        if (n == 1)
            return 0;
        int value = -1;
        int size = 0;
        for (int i=0; i<n; i++) {
            if (size == 0) {
                size++;
                value = A[i];
            }
            else {
                if (value != A[i])
                    size--;
                else
                    size++;
            }
        }
        int candidate = -1;
        if (size > 0)
            candidate = value;
        int count = 0;
        int index = 0;
        for (int i=0; i<n; i++) {
            if (A[i] == candidate) {
                count++;
                index = i;
            }
        }
        if (count > n/2)
            return index;
        else
            return -1;
    }


    public static int timeRequiredToBuy(int[] tickets, int k) {
        
        int[] counter = new int[tickets.length];
        for (int i = 0; i < tickets.length; i++) {
            counter[i] = tickets[i];
        }
        int time = 0;
        while (counter[k] > 0) {
            time++;
            for (int i = 0; i < counter.length; i++) {
                if (counter[i] > 0) {
                    counter[i]--;
                }
            }
        }
        return time;
    }

    
}