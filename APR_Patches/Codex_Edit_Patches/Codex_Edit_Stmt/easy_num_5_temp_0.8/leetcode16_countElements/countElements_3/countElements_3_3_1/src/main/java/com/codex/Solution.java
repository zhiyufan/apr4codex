package com.codex;

import java.util.*;

public class Solution {
class Solution {
    public int countElements(int[] arr) {
        HashSet<Integer> hset = new HashSet<Integer>();
        int count = 0;
        for(int ele : arr)
            hset.add(ele);
        for(int i=0; i<arr.length; i++){
            if(hset.contains(arr[i]+1))
                count++;
        }
        return count;
    }   
}
}