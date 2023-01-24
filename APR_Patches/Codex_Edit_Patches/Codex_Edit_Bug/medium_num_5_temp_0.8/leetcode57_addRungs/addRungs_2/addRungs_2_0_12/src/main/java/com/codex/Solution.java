package com.codex;

import java.util.*;

public class Solution {

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author tdr
 */
public class Solution {
    
    /**
     *
     * @param rungs
     * @param dist
     * @return
     */
    public static int addRungs(int[] rungs, int dist) 
    {
        
        int add = 0;
        for (int i = 1; i < rungs.length; ) 
        {
            if (rungs[i] - rungs[i - 1] > dist) 
            {
                add++;
                rungs[i] = rungs[i - 1] + dist;
            } 
            else 
            {
                i++;
            }
        }
        return add;
    }
}


    
}