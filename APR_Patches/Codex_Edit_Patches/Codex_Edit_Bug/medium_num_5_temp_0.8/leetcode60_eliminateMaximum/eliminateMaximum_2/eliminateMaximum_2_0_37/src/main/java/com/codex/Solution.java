package com.codex;

import java.util.*;

public class Solution {
    public static int eliminateMaximum(int[] dist, int[] speed) {
        
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        for (int i = 0; i < dist.length; i++) {
            pq.add(dist[i] * speed[i]);
        }
        int count = 0;
        int charge = 0;
        while (!pq.isEmpty()) {
            charge += pq.poll();
            count++;
            if (charge < 0) {
                break;
            }
        }
        return count;
    }


        /**
     * put count of each character in the map
     * @param s
     * @return
     */
    private static  Map<Character,Integer> getCountMap(String s) {
        Map<Character, Integer> countMap = new HashMap<>();
        for(char c: s.toCharArray()) {
            countMap.put(c, countMap.getOrDefault(c, 0) + 1);
        }
        return countMap;
    }

    /**
     * get the count of character in the map
     * @param c
     * @param countMap
     * @return
     */
    private static int getCount(char c, Map<Character, Integer> countMap) {
        return countMap.getOrDefault(c, 0);
    }

    static int anagram(String s) {
        if(s.length() % 2 == 1) {
            return -1;
        }

        String first = s.substring(0, s.length()/2);
        String second = s.substring(s.length()/2);
        Map<Character, Integer> countMap = getCountMap(first);

        int count = 0;
        for(char c: second.toCharArray()) {
            if(getCount(c, countMap) > 0) {
                countMap.put(c, getCount(c, countMap) - 1);
            } else {
                count++;
            }
        }
        return count;
    }
    
}