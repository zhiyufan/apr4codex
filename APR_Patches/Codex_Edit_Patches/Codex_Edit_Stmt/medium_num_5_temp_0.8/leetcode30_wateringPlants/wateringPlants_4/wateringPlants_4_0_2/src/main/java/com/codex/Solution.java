package com.codex;

import java.util.*;

public class Solution {
    public class Solution {

        int steps = 0;
        public int solution(int[] plants, int capacity) {

            int curCap = capacity;

            for (int i = 0; i < plants.length; i++) {
                if (curCap < plants[i]) {
                    curCap = capacity;
                    steps++;
                }

                curCap -= plants[i];
                steps++;

            curCap -= plants[i];
            steps++;

            if (i + 1 < plants.length) {
                if (curCap < plants[i + 1]) {
                    curCap = capacity;
                    steps++;
                }
            }
        }

        return steps;
    }

    
}