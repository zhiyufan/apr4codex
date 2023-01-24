package com.codex;

import java.util.*;

public class Solution {


static int delete(int a[]){
   int count = 0;
        for(int i = 0;i<a.length;i++)
        {
            if(a[i]==a[i+1])
                count++;
        }
        return count;
}
    
 public static int delete(int [] nums) {
        
       
        return delete(nums);
 }

    
    
}