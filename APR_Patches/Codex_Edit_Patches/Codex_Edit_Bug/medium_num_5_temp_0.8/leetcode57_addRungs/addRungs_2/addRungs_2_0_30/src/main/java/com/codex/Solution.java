package com.codex;

import java.util.*;

public class Solution {
    public static int addRungs(int[] rungs, int dist) {
        
        int add = 0;
        int  i=1,j=0;
        while(i<rungs.length) {
            if(rungs[i]-rungs[j]<=dist)
             i++;
            else {
                j++;
                if(i-j==1) 
                 add++;
                else
                 add+=(i-j);
                 
             }

        }
        return add;
    }

    
}