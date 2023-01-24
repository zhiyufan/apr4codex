package com.codex;

import java.util.*;

public class Solution {
import java.util.*;

public class Main {
    public static int wateringPlants(int[] plants, int capacity) {
        int current = capacity;
        int round = 0;
        for (int i = 0; i < plants.length; ++i) {
            if (plants[i] <= current) {
                current -= plants[i];
            } else if (plants[i] > current) {
                round++;
                current = capacity - plants[i];
                if (current < 0) {
                    return -1;
                }
            }
            if (i == plants.length - 1) {
                round++;
                if (plants[plants.length - 1] <= capacity / 2) {
                    return round;
                }
                current = capacity;
                i = -1;
            } else {
                continue;
            }
        }
        return round;
    }


    // public static int wateringPlants(int[] plants, int capacity) {
    //     int steps = 0;
    //     int currWater = capacity;
    //     for (int i = 0; i < plants.length; i++) {
    //         steps++;
    //         if (plants[i] > currWater) {
    //             steps += (i - 1) * 2;
    //             currWater = capacity;
    //             i--;
    //         } else {
    //             currWater -= plants[i];
    //         }
    //     }
    //     return steps;
    // }


  public static void main(String[] args) {
      int[] plants = {2, 4, 5, 1, 2};
      int cap = 6;
      System.out.println(wateringPlants(plants, cap));
  }
}
}