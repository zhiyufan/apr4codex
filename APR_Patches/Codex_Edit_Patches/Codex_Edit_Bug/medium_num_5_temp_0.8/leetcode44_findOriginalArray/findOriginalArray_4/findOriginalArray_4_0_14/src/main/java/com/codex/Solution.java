package com.codex;

import java.util.*;

public class Solution {
import java.util.HashSet;

public class Reverse {

    public static int[] findOriginalArray(int[] changed) 
    {
        HashSet<Integer> set=new HashSet<>();
        int c=0;
        for (int i=0;i<changed.length;i++)
        {
            if(changed[i]%2==0)
                set.add(changed[i]/2);
            else
                c++;
        }
        if (!set.isEmpty()) {
            return new int[]{};
        }
        int k = 0;
        for (int i = 0; i < changed.length; i++) {
            if (changed[i] % 2 == 0) {
                original[k] = changed[i]/2;
                k++;
            }
        }
        return original;
    }


    
}