package com.codex;

import java.util.*;

public class Solution {
import java.util.*;

public class Main {

    public static void main(String[] args) {

        // Create an array of integers and use it to test targetIndices
        int[] nums = {1, 5, 7, 8, 3, 5, 4, 5};
        System.out.println(targetIndices(nums, 5));
    }

    /*
     * Write a method targetIndices that takes in a int array and an int target, and
     * return a List<Integer> that contains the index of the target
     */
    public static List<Integer> targetIndices (int[] nums, int target) {
        
        List<Integer> indicesList = new ArrayList<>();

        for (int i = 0; i < nums.length; i++){
            if(nums[i] == target){
                indicesList.add(i);

            }
        }
        return indicesList;

    }


}
}