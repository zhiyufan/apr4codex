package com.codex;

import java.util.*;

public class Solution {
    // you can also use imports, for example:
    // import java.util.*;

    // you can write to stdout for debugging purposes, e.g.
    // System.out.println("this is a debug message");

    class Solution {
        public int solution(int[] plants, int capacity1, int capacity2) {
            // write your code in Java SE 8
            int result = 0;

            int curCap1 = capacity1;
            int curCap2 = capacity2;

            for (int i = 0; i < plants.length; i++) {
                if (curCap1 < plants[i] && curCap2 < plants[i]) {
                    return -1;
                }

                if (curCap1 < plants[i]) {
                    curCap2 -= plants[i];
                } else if (curCap2 < plants[i]) {
                    curCap1 -= plants[i];
                } else {
                    if (curCap1 >= curCap2) {
                        curCap2 -= plants[i];
                    } else {
                        curCap1 -= plants[i];
                    }
                }

                result++;

                if (i + 1 == plants.length) {
                    return result;
                }

                int curCap = Math.max(curCap1, curCap2);
                curCap1 = curCap2 = curCap;

                if (curCap1 < plants[i + 1] && curCap2 < plants[i + 1]) {
                    return -1;
                }

                if (curCap1 < plants[i + 1]) {
                    curCap2 -= plants[i + 1];
                } else if (curCap2 < plants[i + 1]) {
                    curCap1 -= plants[i + 1];
                } else {
                    if (curCap1 >= curCap2) {
                        curCap1 -= plants[i + 1];
                    } else {
                        curCap2 -= plants[i + 1];
                    }
                }

                result++;
            }

            return -1;
        }
    }



    public static int wateringPlants(int[] plants, int capacity) {


        int steps = 0;
        int curCap = capacity;

        for (int i = 0; i < plants.length; i++) {
            if (curCap < plants[i]) {
                curCap = capacity;
                steps++;
            }

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