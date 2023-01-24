package com.codex;

import java.util.*;

public class Solution {
 public static int minimumBuckets(String street) {
        int count = 0;        
        char[] streetCharArr = new char[street.length()];
        street.getChars(0,street.length(),streetCharArr,0);
        int len = street.length();
        for (int i = 0; i < len; i++) {
            if (streetCharArr[i] == 'H')
            {
                if (i - 1 >= 0)
                {
                    if (streetCharArr[i - 1] == '.')
                    {
                        streetCharArr[i - 1] = 'B';                            
                        count++;
                    }
                }
                if (i + 1 < len)
                {
                    if (streetCharArr[i + 1] == '.')
                    {
                        streetCharArr[i + 1] = 'B';
                        count++;
                    }
                }
            }
        }
        return count;
    }

    
}