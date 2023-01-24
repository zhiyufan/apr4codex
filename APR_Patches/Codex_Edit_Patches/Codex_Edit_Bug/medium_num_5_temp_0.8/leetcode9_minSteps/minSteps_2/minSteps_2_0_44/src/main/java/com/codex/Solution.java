package com.codex;

import java.util.*;

public class Solution {
    public static int minSteps(String s, String t) {
        
        int[] sArray = new int[26];
        int[] tArray = new int[26];
        for (int i = 0; i < s.length(); i++) {
            sArray[s.charAt(i) - 'a']++;
            tArray[t.charAt(i) - 'a']++;
        }
        int result = 0;
        for (int i = 0; i < 26; i++) {
            result += Math.abs(sArray[i] - tArray[i]);
        }
        return result / 2;
    }

    public static long countTriplets(List<Long> arr, long r) {
        HashMap<Long, Long> rightMap = new HashMap<>();
        HashMap<Long, Long> leftMap = new HashMap<>();
        long triplets = 0;
        for (int i = 0; i < arr.size(); i++) {
            rightMap.put(arr.get(i), rightMap.getOrDefault(arr.get(i), 0L) + 1);
        }

        for (int i = 0; i < arr.size(); i++) {
            long currentElement = arr.get(i);
            long elementsInRight = rightMap.get(currentElement);
            rightMap.put(currentElement, elementsInRight - 1);

            long middleElement = currentElement * r;
            long lastElement = currentElement * r * r;
            if (lastElement > Collections.max(arr)) {
                break;
            }

            if (rightMap.containsKey(lastElement) && middleElement != lastElement) {
                long leftElements = leftMap.getOrDefault(middleElement, 0L);
                long rightElements = rightMap.getOrDefault(lastElement, 0L);
                triplets += leftElements * rightElements;
            }

            if (rightMap.containsKey(middleElement)) {
                long leftElements = leftMap.getOrDefault(currentElement, 0L);
                long rightElements = rightMap.getOrDefault(middleElement, 0L);
                triplets += leftElements * rightElements;
            }

            leftMap.put(currentElement, leftMap.getOrDefault(currentElement, 0L) + 1);

        }
        return triplets;
    }

    
}