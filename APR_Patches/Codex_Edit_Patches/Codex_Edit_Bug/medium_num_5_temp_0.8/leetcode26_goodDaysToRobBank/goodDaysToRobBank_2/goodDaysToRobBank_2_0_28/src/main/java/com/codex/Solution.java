package com.codex;

import java.util.*;

public class Solution {

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class GoodDay {


    public static void main(String[] args) {
        List<List<Integer>> result = new ArrayList<>();
        

        result.add(goodDaysToRobBank(new int[]{7, 7, 5, 6, 5}, 1));
        result.add(goodDaysToRobBank(new int[]{5, 2, 0, 2, 4}, 2));
        for (List<Integer> list : result) {
            System.out.println(Arrays.toString(list.toArray()));
        }
    }
    
    public static List<Integer> goodDaysToRobBank(int[] security, int time) {    
        List<Integer> result = new ArrayList<>();
        int startIndex = time-1;
        
        while(startIndex < security.length){
            int endIndex = startIndex + time;
            if(endIndex < security.length){
                if(checkDay(security, startIndex, endIndex)){
                    result.add(startIndex);
                }
            }
            startIndex++;
        }

        return goodDays;
    }

    
}