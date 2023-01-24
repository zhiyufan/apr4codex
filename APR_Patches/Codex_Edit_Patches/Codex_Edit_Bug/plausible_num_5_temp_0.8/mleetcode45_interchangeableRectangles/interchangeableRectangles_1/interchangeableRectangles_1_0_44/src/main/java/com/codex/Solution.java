package com.codex;

import java.util.*;

public class Solution {
public static long interchangeableRectangles(int[][] rectangles) {
    Map<String, Integer> map = new HashMap<>();
    for (int i = 0; i < rectangles.length; i++){
        String shape = getShape(rectangles[i][0], rectangles[i][1]);
        map.put(shape, map.getOrDefault(shape, 0) + 1);
    }
    long res = 0;
    for (int l : map.values()){
        res += l * (l - 1) / 2;
    }
    return res;
}
private static String getShape(int l, int w){
    if (l > w) return w + ";" + l;
    return l + ";" + w;
}
}