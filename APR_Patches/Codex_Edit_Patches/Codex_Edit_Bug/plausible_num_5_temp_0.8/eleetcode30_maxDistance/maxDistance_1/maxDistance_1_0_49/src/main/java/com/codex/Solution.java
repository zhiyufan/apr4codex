package com.codex;

import java.util.*;

public class Solution {
import java.awt.*;
import java.util.HashMap;
import java.util.Map;

public class Main{

    public static void main(String []args){
        int arr[] = {1,1,1,1,1};
        int ans = maxDistance(arr);
        System.out.print(ans);
    }

    public static int maxDistance(int[] arr) {

        int distance = 0;
        HashMap<Integer, Integer> left = new HashMap<>();
        HashMap<Integer, Integer> right = new HashMap<>();

        HashMap<Integer, Integer> right = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            if (!left.containsKey(arr[i])) {
                left.put(arr[i], i);
            }
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

    
}