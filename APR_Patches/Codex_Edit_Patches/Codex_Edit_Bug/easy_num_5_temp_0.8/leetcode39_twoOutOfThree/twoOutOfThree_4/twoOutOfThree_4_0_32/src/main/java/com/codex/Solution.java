package com.codex;

import java.util.*;

public class Solution {
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

/**
 *
 * @author Kavita
 */
public class Test {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {   //Given three arrays, find the common element
        // TODO code application logic here
        
        int nums1[] = {1,2,3,4,5,6,7,8,10};
        int nums2[] = {3,4,5,6,7,8,9,10,11,12};
        int nums3[] = {1,2,3,4,5,6,8,9,10,11,12,13,14};
        
        List<Integer> list  = new ArrayList<>();
        
        //list = twoOutOfThre(nums1, nums2, nums3);
        
        list = twoOutOfThree(nums1, nums2, nums3);
        
        for( Integer i : list){
            System.out.println("Common element : " +i);
        }
    }
  
    public static List<Integer> twoOutOfThree(int[] nums1, int[] nums2, int[] nums3) {
        if(nums1==null || nums2==null || nums3==null){
            return null;
         }
        Set<Integer> hm1 = new HashSet<>();
        List<Integer> list = new ArrayList<>();
        for(int n : nums1){
            if(hm1.contains(n)){
                hm1.remove(n);
                list.add(n);
            } else {
                hm1.add(n);
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
    
}