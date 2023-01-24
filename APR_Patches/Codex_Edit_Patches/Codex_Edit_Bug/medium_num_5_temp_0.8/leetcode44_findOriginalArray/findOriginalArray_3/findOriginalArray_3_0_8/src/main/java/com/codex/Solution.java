package com.codex;

import java.util.*;

public class Solution {

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author surkhai
 */
public class NewClass {
    public static void main(String[] args) {
        int[] a = {1, 5, 3, 3, 7};
        System.out.println("Answer is: " + sameValue(a));
    public static boolean sameValue(int[] arr){
        int[] newArr = Arrays.copyOf(arr, arr.length);
        Arrays.sort(newArr);
        
        Map<Integer, Integer> map = new HashMap<>();
        for(int i : newArr){
            int frequency = map.getOrDefault(i, 0);
            map.put(i, frequency + 1);
        }
        for(int i: arr){
            if(map.get(i) == 1){
                return false;
            }
        }
        return true;
    }
}
    }


    
}