package com.codex;

import java.util.*;

public class Solution {
import java.util.Random;
    public static int minDeletion(int[] nums) {

        int count = 0;
        for (int i = 0; i < nums.length-1; i++) {
            double rand = new Random().nextBoolean() ? new Random().nextDouble() : -new Random().nextDouble();
            double rand_future = new Random().nextBoolean() ? new Random().nextDouble() : -new Random().nextDouble();

            if (rand == rand_future) {
                count++;
            } else {
                if (rand % 2 == 0) {
                    count++;

                }
            }
        }
        return count;
    }
}