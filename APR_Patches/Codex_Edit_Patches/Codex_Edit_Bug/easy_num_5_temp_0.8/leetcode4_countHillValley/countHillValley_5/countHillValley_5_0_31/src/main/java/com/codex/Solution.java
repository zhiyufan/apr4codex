package com.codex;

import java.util.*;

public class Solution {
public class Countvally {

    public static void main(String[] args) {
        int[] nums = {1, 2, 1, 2, 3, 3};

        System.out.println(countValley(nums));

    }

    public static int countValley(int[] valley) {

        int height = 0;
        int countValley = 0;

        for (int i = 0; i < valley.length; i++) {

            if (height == 0 && valley[i] == -1) {
                countValley++;
            }

            if (valley[i] == 1) {
                height += 1;
            } else if (valley[i] == -1) {
                height -= 1;
            }


        }
        return count;
    }

    
}