package com.codex;

import java.util.*;

public class Solution {
public class Contest2 {
    public int maxDistance(int[] position, int m) {
        int size = position.length;
        int sqrt = (int) Math.sqrt(size);
        int[] counter = new int[sqrt + 1];
        for (int i : position) {
            counter[i / sqrt + 1] += 1;
        }
        int max = counter[sqrt];
        for (int i = sqrt - 1; i >= 1; i--) {
            counter[i] += counter[i + 1];
            max = Math.max(max, counter[i]);
        }
        int result = Integer.MIN_VALUE;
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < position.length; i++) {
            if (counter[position[i] / sqrt + 1] > m / 2) {
                list.add(position[i]);
            }
        }
        for (int i = 0; i < list.size() - 1; i++) {
            for (int j = i + 1; j < list.size(); j++) {
                result = Math.max(result, list.get(j) - list.get(i));
            }
        }
        return result;
    }
        int counter = 0;
        for (int i = 0; i < word.length(); i++){
            char letter = word.charAt(i);
            int index = letters.indexOf(letter);
            int distance = index - letters.indexOf('a');
            if (distance < 0){
                distance += 26;
            }
            if (distance > 13) {
                counter += Math.min(26 - distance, distance);
            }else{
                counter += distance;
            }
        }
        return counter;
    }
}