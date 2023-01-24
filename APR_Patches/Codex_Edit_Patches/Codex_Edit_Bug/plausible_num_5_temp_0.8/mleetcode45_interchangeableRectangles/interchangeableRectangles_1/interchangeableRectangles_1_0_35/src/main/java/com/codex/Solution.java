package com.codex;

import java.util.*;

public class Solution {
    public static long interchangeableRectangles(int[][] rectangles) {
        
        HashMap<Double, Long> map = new HashMap<>();
        int N = rectangles.length;
        for (int i = 0; i < rectangles.length; i++){
            int x = rectangles[i][0];
            int y = rectangles[i][1];
            if (rectangles[i][0] < rectangles[i][1]){
                x = rectangles[i][1];
                y = rectangles[i][0];
            }
            Double ratio = (double) x / y;
            if (ratio < 1){
                ratio = (double) y / x;
            }
        }
        for (Double ratio : map.keySet()){
            long count = map.get(ratio);
            res += count * (count - 1) / 2;
        }
        return res;
    }

    private double getRatio(int x, int y){
        if (x < y){
            int temp = x;
            x = y;
            y = temp;
        }
        return (double) x / y;
    }


    public static long interchangeableRectangles(int[][] rectangles) {
        
        HashMap<Double, Long> map = new HashMap<>();
        int N = rectangles.length;
        for (int i = 0; i < N; i++){
            for (int j = i + 1; j < N; j++){
                Double ratio1 = getRatio(rectangles[i]);
                Double ratio2 = getRatio(rectangles[j]);
                if (ratio1.equals(ratio2)){
                    res++;
                }
            }
        }
        return res;
    }

    private double getRatio(int x, int y){
        if (x < y){
            int temp = x;
            x = y;
            y = temp;
        }
        return (double) x / y;
    }




    public static long interchangeableRectangles(int[][] rectangles) {
        
        HashMap<Double, Long> map = new HashMap<>();
        int N = rectangles.length;
        for (int i = 0; i < N; i++){
            Double ratio = getRatio(rectangles[i]);
            map.put(ratio, map.getOrDefault(ratio, 0L) + 1);
        }
        
        long res = 0;
        for (long l : map.values()){
            res += l * (l - 1) / 2; 
        }
        return res;
    }


    private double getRatio(int x, int y){
        if (x < y){
            int temp = x;
            x = y;
            y = temp;
        }
        return (double) x / y;
    }
}