package com.codex;

import java.util.*;

public class Solution {
        int count = 0; 
        for (int i = 0; i < nums.length; i++) 
        { 
  
            for (int j = i + 1; j < nums.length; j++) 
            { 
                if ((nums[i] + nums[j]) == k) 
            //return count; 
                { 
                    count++; 
                } 
            }
        }
        if(count == 0)
        {
            return -1;
        }
  
        return count; 
    } 

    
}