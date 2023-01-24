package com.codex;

import java.util.*;

public class Solution {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int k = in.nextInt();
        int[] height = new int[n];
        for(int height_i=0; height_i < n; height_i++){
            height[height_i] = in.nextInt();
        }
        int max = height[0];
        for(int i = 1; i < height.length; i++){
            if(height[i] > max){
                max = height[i];
            }
        }
        int result = 0;
        if((max > k)){
           result =  max - k;
        }
        System.out.println(result);

    
}