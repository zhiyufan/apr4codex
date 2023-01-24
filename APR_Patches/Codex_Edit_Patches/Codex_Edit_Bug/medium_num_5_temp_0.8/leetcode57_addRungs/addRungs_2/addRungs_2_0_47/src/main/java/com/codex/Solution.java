package com.codex;

import java.util.*;

public class Solution {
    public static int addRungs(int[] rungs, int dist) {
        
       if(Math.abs(rungs[0]) > dist)
    	   return -1;
       int add = 0;
        for (int i = 1; i < rungs.length; i++) {
        	if(Math.abs(rungs[i]-rungs[i-1])>dist){
        		add++;
        		rungs[i]=rungs[i-1]+dist;
        	}
        }
        return add;
    }

    
}