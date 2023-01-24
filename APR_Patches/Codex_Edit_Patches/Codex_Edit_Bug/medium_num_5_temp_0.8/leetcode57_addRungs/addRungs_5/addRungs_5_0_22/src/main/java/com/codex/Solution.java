package com.codex;

import java.util.*;

public class Solution {
public static int addRungs(int[] rungs, int dist) 
{
    int count = 0;
    int max = 0;
    for (int i = 0; i < rungs.length; i++) 
    {
        if (rungs[i] > max) 
        {
            count++;
            max = rungs[i] + dist;
        else if (rungs[i] > max-dist) 
        {
            max = rungs[i] + dist;
        }
        // else nothing
        }
    }
    return count;
}

    
}