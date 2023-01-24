package com.codex;

import java.util.*;

public class Solution {
class SortCharactersByFrequency {
    public String frequencySort(String s) {
        int[] charCounts = new int[256];
        for (char c : s.toCharArray()) {
            charCounts[c]++;
        }
        Queue<Character> maxHeap = new PriorityQueue<>(new Comparator<Character>() {
            @Override
            public int compare(Character c1, Character c2) {
                return charCounts[c2] - charCounts[c1];
            }
        });
        for (int i = 0; i < 256; i++) {
            if (charCounts[i] != 0) {
                maxHeap.offer((char) i);
            }
        }
        StringBuilder sb = new StringBuilder();
        while (!maxHeap.isEmpty()) {
            Character cur = maxHeap.poll();
            int count = charCounts[cur];
            while (count > 0) {
                sb.append(cur);
                count--;
            }
        }
        return sb.toString();
    }

}
}