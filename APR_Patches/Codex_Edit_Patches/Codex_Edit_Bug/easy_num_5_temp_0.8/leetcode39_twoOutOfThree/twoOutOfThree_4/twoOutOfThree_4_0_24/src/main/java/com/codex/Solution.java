package com.codex;

import java.util.*;

public class Solution {
public static List<Integer> twoOutOfThree(int[] nums1, int[] nums2, int[] nums3) {
        
    Set<Integer> hm1 = new HashSet<>();
    List<Integer> list = new LinkedList<>();
    for(int n : nums1){
        if(hm1.contains(n)){
            hm1.remove(n);
            list.add(n);
        } else {
            hm1.add(n);
    }

    Set<Integer> hm2 = new HashSet<>();
    for(int n : nums2){
        if(hm1.contains(n)){
            hm1.remove(n);
            hm2.add(n);
        }
        if(hm2.contains(n)){
            hm2.remove(n);
            list.add(n);
        } else {
            hm2.add(n);
        }
    }

    for(int n : nums3){
        if(hm1.contains(n)){
            hm1.remove(n);
            list.add(n);
        }
        if(hm2.contains(n)){
            hm2.remove(n);
            list.add(n);
        }
    }
    return list;
}


public static List<Integer> twoOutOfThree(int[] nums1, int[] nums2, int[] nums3) {
    int[] hm1 = new int[3];
    List<Integer> list = new LinkedList<>();

    Set<Integer> hm2 = new HashSet<>();
    Set<Integer> hm3 = new HashSet<>();

    for(int n : nums1){
        hm1[n]++;
    }
    for(int n : nums2){
        hm2.add(n);
    }
    for(int n : nums3){
        hm3.add(n);
    }

    for(int i = 0; i < 3; i++){
        if(hm1[i] > 1) list.add(i);
        else if(hm1[i] == 1){
            if(hm2.contains(i)) list.add(i);
            if(hm3.contains(i)) list.add(i);
        }
    }
    return list;
}






        }

        Set<Integer> hm2 = new HashSet<>();
        for(int n : nums2){
            if(hm1.contains(n) && !list.contains(n)){
                list.add(n);
            }

            if(hm2.contains(n)){
                hm2.remove(n);
                list.add(n);
            } else {
                hm2.add(n);
            }
        }

        for(int n : nums3){
            if(hm1.contains(n) && !list.contains(n)){
                list.add(n);
            }
            if(hm2.contains(n) && !list.contains(n)){
                list.add(n);
            }
        }
        return list;
    }
}