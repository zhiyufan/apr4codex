package com.codex;

import java.util.*;

public class Solution {
    public static int minTimeToType(String word) {
        

        int minTime = 0;
        HashMap<Character, Integer> letterPosition = new HashMap<>();
        char[] letters = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'};

        for(int i = 0; i < letters.length; i++) {
            letterPosition.put(letters[i], i);
        }

        for(int i = 0; i < word.length()-1; i++) {
            char current = word.charAt(i);
            char next = word.charAt(i+1);
            int currentPosition = letterPosition.get(current);
            int nextPosition = letterPosition.get(next);
            minTime += Math.min(Math.abs(nextPosition - currentPosition), 26 - Math.abs(nextPosition - currentPosition));
        }

    public static int findRepeatNumber(int[] arr) {
        
        int[] result = new int[arr.length];

        for(int i = 0; i < arr.length; i++) {
            result[arr[i]] += 1;
        }

        for(int i = 0; i < arr.length; i++) {
            if(result[i] > 1) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = {2, 3, 1, 0, 2, 5, 3};
        int[] arr2 = {0, 1, 2, 3, 4, 11, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15};
        System.out.println(findRepeatNumber(arr));
    }


    
        return minTime;
    }

    
}