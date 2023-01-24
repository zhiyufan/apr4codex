package com.codex;

import java.util.*;

public class Solution {
    public static void main(String[] args) {
       int[] prices = new int[]{1,5,8,9,10,17,17,20};
        int size = prices.length;
        System.out.println(rodCutting(prices, size));
    }
    
    public static int rodCutting(int[] arr, int n){
        int[] val= new int[n+1];
        int[] cuts= new int[n+1];
        val[0]=0;
        for(int i=1;i<=n;i++){
            int maxVal = Integer.MIN_VALUE;
            for(int j=0;j<i;j++){
                if(maxVal < arr[j] + val[i-j-1]){
                    maxVal = arr[j] + val[i-j-1];
                    val[i] = maxVal;
                    cuts[i] = j+1;
                }
            }
        }
        
        return val[n];
    }

    
}