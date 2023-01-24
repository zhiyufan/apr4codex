package com.codex;

import java.util.*;

public class Solution {
import java.util.*;

    public static int numOfPairs(String[] nums, String target) {

        int count = 0;

        for (String num1 : nums) {
            for (String num2 : nums) {
                String pair1 = String.valueOf(num1) + String.valueOf(num2);
                String pair2 = String.valueOf(num2) + String.valueOf(num1);

                if(isPair(pair1, pair2, target)){
                    count++;
                }
            }
        }
        return count;
    }

    public static boolean isPair(String pair1, String pair2, String target){
            if (Integer.parseInt(pair1) > Integer.parseInt(target)) {
                return false;
            }
            else if(Integer.parseInt(pair1) == Integer.parseInt(target)){
                return true;
            }
            else if (Integer.parseInt(pair2) > Integer.parseInt(target)) {
                return false;
            }
            else if(Integer.parseInt(pair2) == Integer.parseInt(target)){
                return true;
            }
        return false;
    }

    
}