package com.codex;

import java.util.*;

public class Solution {
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class WaterCans {

    public static int wateringPlants(int[] plants, int capacity) {
        if (plants.length == 0) {
            return -1;
        }
        Set<Integer> set = new HashSet<>();
        int i = 0;
        int j = 0;
        int cnt = 0;
        for (; i < plants.length && j < plants.length; i++) {
            if (!set.contains(plants[i])) {
                int waterCap = capacity;
                for (; j < plants.length; j++) {
                    if (set.contains(plants[j])) {
                        cnt++;
                        continue;
                    }
                    if (waterCap == 0) {
                        break;
                    }
                    if (plants[j] > waterCap) {
                        i = j - 1;
                        j = i;
                        set.clear();
                        break;
                    } else {
                        waterCap -= plants[j];
                        set.add(plants[j]);
                        cnt++;
                    }
                }
                if (j == plants.length) {
                    break;
                }
            }
        }
        for (int k = i + 1; k < plants.length; k++) {
            if (!set.contains(plants[k])) {
                return -1;
            }
            cnt++;
        }
        return cnt;
    }


    public static void main(String[] args) {
        System.out.println(wateringPlants(new int[]{2,4,5,1,2}, 6));

    }

}
}