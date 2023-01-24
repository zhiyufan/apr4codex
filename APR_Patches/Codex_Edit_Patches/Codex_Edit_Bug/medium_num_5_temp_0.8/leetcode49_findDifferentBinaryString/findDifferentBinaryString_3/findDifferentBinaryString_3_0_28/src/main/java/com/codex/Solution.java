package com.codex;

import java.util.*;

public class Solution {
import java.util.*;
import java.lang.*;

public class Main
{
    public static String findDifferentBinaryString(String[] nums)
    {
        String s="";
        for(int i=0;i<nums[0].length();i++)
        {
            int ones=0;
            int zeros=0;
            for(int j=0;j<nums.length;j++)
            {
                if(nums[j].charAt(i)=='1')
                ones++;
                else
                zeros++;
            }
        }
        String s = "";
        for (int i = 0; i < n; i++) {
            int ones = 0;
            for (int j = 0; j < n; j++) {
                if (char2D[j][i] == '1') {
                    ones++;
                }
            }
            if (ones <= n / 2) {
                s += "0";
            } else {
                s += "1";
            }
        }
        return s;
    }

    
}