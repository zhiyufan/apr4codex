package com.codex;

import java.util.*;

public class Solution {
    public static String maximumNumber(String num, int targ) {
        StringBuilder res = new StringBuilder(num); 
        int i = 0;
        while (i < res.length() - 1) {
            if (res.charAt(i) < res.charAt(i + 1)) {
                if (targ == 0) {
                    res.deleteCharAt(i);
                }
                else {
                    res.deleteCharAt(i + 1);
                }
                targ--;
                i = 0;
            }
            else {
                i++;
            }
        }

        while (targ > 0) {
            res.deleteCharAt(i);
            targ--;
        }

        return res.toString();
    }

    
}