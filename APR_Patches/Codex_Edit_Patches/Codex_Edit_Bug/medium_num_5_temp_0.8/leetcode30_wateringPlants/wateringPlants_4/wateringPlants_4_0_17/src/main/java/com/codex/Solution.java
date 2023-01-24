package com.codex;

import java.util.*;

public class Solution {
package codingBat;

public class CodingBat {

	public static int wateringPlants(int[] plants, int capacity) {
        int steps = 0;
        int curCap = capacity;


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