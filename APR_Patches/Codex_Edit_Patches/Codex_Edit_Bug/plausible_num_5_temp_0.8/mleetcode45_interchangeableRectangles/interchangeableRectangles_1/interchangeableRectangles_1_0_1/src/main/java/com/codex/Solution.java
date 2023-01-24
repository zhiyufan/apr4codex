package com.codex;

import java.util.*;

public class Solution {
    public static long interchangeableRectangles(int[][] rectangles) {
        
        HashMap<Double, Long> map = new HashMap<>();
        for (int i = 0; i < rectangles.length; i++){
            for (int j = 0; j < rectangles[0].length; j++){
                if (rectangles[i][0] < rectangles[i][1]){
                    int temp = rectangles[i][0];
                    rectangles[i][0] = rectangles[i][1];
                    rectangles[i][1] = temp;
                }
                Double ratio = (double)rectangles[i][0] / rectangles[i][1];
                map.put(ratio, map.getOrDefault(ratio, 0L) + 1);
            }
        }
        long res = 0;
        for (long l : map.values()){
            res += l * (l - 1) / 2;
        }
        return res;
    }


        for (int i = 0; i < nums.length; i++){
            int curr = nums[i];
            if (curr > 1){ // curr is greater than 1
                if(set.contains(curr - 1)){ // curr - 1 exists
                    res = Math.max(res, map.getOrDefault(curr, 0) + map.get(curr - 1) + 1);
                    map.put(curr, map.get(curr - 1) + map.getOrDefault(curr, 0) + 1);
                    set.add(curr);
                }
                else{  // curr - 1 does not exists
                    map.put(curr, 1);
                    set.add(curr);
                }
            }
            else if(curr == 1){ // curr is equal to 1
                if (set.contains(curr + 1)){ // curr + 1 exists
                    res = Math.max(res, map.getOrDefault(curr, 0) + map.get(curr + 1) + 1);
                    map.put(curr, map.get(curr + 1) + map.getOrDefault(curr, 0) + 1);
                    set.add(curr);
                }
                else{ // curr + 1 does not exists
                    map.put(curr, 1);
                    set.add(curr);
                }
            }
        }


    
}