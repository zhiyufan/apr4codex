package com.codex;

import java.util.*;

public class Solution {
import java.util.*;

/*
Program to find the greatest distance between same colors in an array

Time complexity: O(n)
Space complexity: O(n)

*/

class Main {
    public static int maxDistance(int[] colors) {
        
        int distance = 0;
        HashMap<Integer, Integer> left = new HashMap<>();
        HashMap<Integer, Integer> right = new HashMap<>();

        for (int i = 0; i < colors.length; i++) {
            if (!left.containsKey(colors[i]))
                left.put(colors[i], i);
        }

        for (int i = colors.length - 1; i >= 0; i--) {
            if (!right.containsKey(colors[i]))
                right.put(colors[i], i);
        }

        for (int i = 0; i < colors.length; i++) {
            distance = Math.max(distance, Math.abs(i - left.get(colors[i])));
            distance = Math.max(distance, Math.abs(i - right.get(colors[i])));
        }

        return distance;
    }


  public static void main(String[] args) {
    int[] colors = {2, 1, 4, 1, 1, 2};
    System.out.println(maxDistance(colors));
  }
}
    
}