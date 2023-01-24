package com.codex;

import java.util.*;

public class Solution {
//    public static int eliminateMaximum(int[] dist, int[] speed) {
//        
//        int maxIndex = 0;
//        for (int i = 1; i < dist.length; i++) {
//            if (dist[i] > dist[maxIndex]) {
//                maxIndex = i;
//                continue;
//            }
//            if (dist[i] == dist[maxIndex] && speed[i] > speed[maxIndex]) {
//                maxIndex = i;
//            }
//        }
//        int count = 1;
//        for (int i = 0; i < maxIndex; i++) {
//            if (dist[i] - dist[maxIndex] <= speed[i] * speed[maxIndex]) {
//                count++;
//            }
//        }
//        return count;
//    }
//    


//
//int[] dist = {10, 5, 8, 25, 15, 30, 20};
//int[] speed = {2, 1, 2, 3, 1, 3, 2};
//{10, 5, 8, 25, 15, 30, 20}
//{2, 1, 2, 3, 1, 3, 2}


//    public static int eliminateMaximum(int[] dist, int[] speed) {
//        if (dist.length == 0) return 0;
//        int count = 1;
//        int[] maxElem = new int[dist.length];
//        maxElem[0] = dist[0];
//        for (int i = 1; i < maxElem.length; i++) {
//            maxElem[i] = Math.max(dist[i], maxElem[i - 1]);
//        }
//        while (count < dist.length) {
//            int maxIndex = 0;
//            for (int i = 1; i < dist.length; i++) {
//                if (dist[i] > dist[maxIndex]) {
//                    maxIndex = i;
//                    continue;
//                }
//                if (dist[i] == dist[maxIndex] && speed[i] > speed[maxIndex]) {
//                    maxIndex = i;
//                }
//            }
//            int counter = 0;
//            for (int i = 0; i < maxIndex; i++) {
//                if (dist[i] - dist[maxIndex] <= speed[i] * (maxElem[maxIndex] - dist[maxIndex])) {
//                    counter++;
//                }
//            }
//            if (counter < count) break;
//            count++;
//
//            dist = removeIndex(dist, maxIndex);
//            speed = removeIndex(speed, maxIndex);
//            maxElem = removeIndex(maxElem, maxIndex);
//        }
//        return count;
//    }
//
//    private static int[] removeIndex(int[] array, int index) {
//        int[] result = new int[array.length - 1];
//        System.arraycopy(array, 0, result, 0, index);
//        System.arraycopy(array, index + 1, result, index, array.length - index - 1);
//        return result;
//
//    }
//
//    public static void main(String[] args) {
//        int[] dist = {};
//        int[] speed = {};
//        int res = eliminateMaximum(dist, speed);
//        System.out.println(res);
//    }
}