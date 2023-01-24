package com.codex;

import java.util.*;

public class Solution {
public static int countElements(int[] arr) {
        int count = 0 ;
        List<Integer> list = new ArrayList<>();
        for(int i = 0 ; i < arr.length ; i++){
            list.add(arr[i]);
        }
        for(int j = 0 ; j < arr.length ; j++){
            if(list.contains(arr[j] + 1)){
                    count++;
            }
        }

        return count;
    }
}