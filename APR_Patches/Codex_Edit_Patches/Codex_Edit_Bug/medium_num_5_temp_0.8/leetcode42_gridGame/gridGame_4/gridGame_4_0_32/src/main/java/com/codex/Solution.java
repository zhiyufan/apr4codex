package com.codex;

import java.util.*;

public class Solution {

    public static long gridGame(int grid[][],int moves[],int res[]){
        int len = grid[0].length;
        while(moves[0]!=0){
            int max=0;
            int index=0;
            for(int i=0;i<len;i++){
                if(grid[0][i]>max){
                    max=grid[0][i];
                    index=i;
                }
            }
            grid[0][index]=0;
            moves[0]--;
        }
        while(moves[1]!=0){
            int max=0;
            int index=0;
            for(int i=0;i<len;i++){
                if(grid[1][i]>max){
                    max=grid[1][i];
                    index=i;
                }
            }
            grid[1][index]=0;
            moves[1]--;
        }
        for(int i=0;i<len;i++){
            res[i]=grid[0][i]+grid[1][i];
        }
        sort(res,len);
        long ans=0;
        for(int i=0;i<len/2;i++){
            if(i%2==0){
                ans+=res[len-i-1];
            } else {
                ans+=res[i];
            }
        }
        return sum;
    }

    
}