package com.codex;

import java.util.*;

public class Solution {
import java.io.IOException;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) throws IOException {
        
        int[] nums = {1, 1, 2, 2};
        System.out.println(countElements(nums));
    }


    public static int countElements(int[] nums) {

         int count = 0;
         HashMap<Integer, Integer> map = new HashMap<>();
         for (int i = 0; i < nums.length; i++) {
             if(map.containsKey(nums[i])) {
                 map.put(nums[i], map.get(nums[i]) + 1);
             } else {
                 map.put(nums[i], 1);
             }
         }
         for (int i = 0; i < nums.length; i++) {
             if(map.containsKey(nums[i] + 1)) {
                 count += 1;
             }
         }
         return count;
     }
 
 }
}