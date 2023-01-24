package com.codex;

import java.util.*;

public class Solution {
public class Solution 
{
    public void hIndex(final List<int[]> tupleList, int n)
    {
        int l = tupleList.size();
        if(l == 0)
            return;
        
        Collections.sort(tupleList, (a,b) -> b[0] - a[0]);
        int i = 0;
        while(i < l)
        {
            if(tupleList.get(i)[1] <= i)
                break;
                
            i++;
}
        }
        
        System.out.println(i);
    }
}