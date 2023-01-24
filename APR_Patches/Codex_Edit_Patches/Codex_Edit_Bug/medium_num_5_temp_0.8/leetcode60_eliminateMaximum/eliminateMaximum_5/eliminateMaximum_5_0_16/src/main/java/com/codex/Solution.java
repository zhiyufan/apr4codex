package com.codex;

import java.util.*;

public class Solution {
import java.util.*;
import java.io.*;
public class Main{
    public static void main(String[] args)throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int[][] arr = new int[n][2];
        for(int i = 0 ;i<arr.length;i++){
            st = new StringTokenizer(br.readLine());
            arr[i][0] =Integer.parseInt(st.nextToken());
            arr[i][1] = Integer.parseInt(st.nextToken());
        }
        System.out.println(eliminateMaximum(arr));
        
    }
    
    private static int eliminateMaximum(int[][] arr) {
        
        int max = 0;
        int maxIndex = 0;
        for(int i =0;i<arr.length;i++){
            if( arr[i][0] > max){
                max = arr[i][0];
                maxIndex = i;
            }
        }
        int count =0;
        int speed = arr[maxIndex][1];
        for(int i =0;i<arr.length;i++){
            if( arr[i][1] >= speed){
                count++;
            }else if(arr[i][0] >= speed){
                count++;
            }
        }
        return count;
        
    }
}
}