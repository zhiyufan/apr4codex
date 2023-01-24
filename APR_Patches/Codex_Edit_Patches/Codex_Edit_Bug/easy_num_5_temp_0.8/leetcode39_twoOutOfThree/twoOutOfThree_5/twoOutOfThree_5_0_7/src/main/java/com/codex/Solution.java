package com.codex;

import java.util.*;

public class Solution {
public static List<Integer> twoOutOfThree(int[] nums1, int[] nums2, int[] nums3) {
    // your code here
    int count = 0;
    List<Integer> lst = new ArrayList<Integer>();
    for(int i=0;i<nums1.length;i++){
        for(int j=0;j<nums2.length;j++){
            if(nums1[i]==nums2[j]){
                count =0;
                for(int k=0;k<nums3.length;k++){
                    if(nums1[i]==nums3[k]){
                        count++;
                    }
                }
                if(count == 1){
                    lst.add(nums1[i]);
                }
                else{
                    count = 0;
                }
            }
        }
    }
    return lst;
}
    
    
}