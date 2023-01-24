package com.codex;

import java.util.*;

public class Solution {
import java.util.*;
public class findDifference{
    public static void main(String[] args) {
        int [] num1={1,2,2,1};
        int[] num2={2,2};

        List<List<Integer>> list = findTheDifference(num1,num2);

        for (List<Integer> l : list){
            for(Integer i: l ){
                System.out.print(i+" ");
            }
            System.out.println();
        }
    }
}