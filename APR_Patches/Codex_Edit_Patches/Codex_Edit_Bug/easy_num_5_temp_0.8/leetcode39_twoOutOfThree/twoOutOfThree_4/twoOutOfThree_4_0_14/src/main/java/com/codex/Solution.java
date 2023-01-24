package com.codex;

import java.util.*;

public class Solution {
List<Integer> twoOutOfThree(int[] nums1, int[] nums2, int[] nums3){

	//This is 3sum
	Set<Integer> set = new HashSet<>();
	List<Integer> list = new LinkedList<>();
	for(int i: nums1){
		for(int j: nums2){
			for(int k: nums3){

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