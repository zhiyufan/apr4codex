package com.codex;

import java.util.*;

public class Solution {
 public static int mostFrequent(int[] nums, int key) {
        HashMap<Integer,Integer> map = new HashMap<>();
        int maxcount = 0;
        int maxnum = 0;
        for(int num : nums){
            if(map.containsKey(num)){
                map.put(num,map.get(num)+1);
            } else {
                map.put(num,1);
            }
            if(num == key){
                continue;
            }else{
                if(map.get(num) > maxcount){
                    maxcount = map.get(num);
                    maxnum = num;
                }
            }
        }

        return maxnum;
    }

}