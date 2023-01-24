package com.codex;

import java.util.*;

public class Solution {
import java.util.ArrayList;
import java.util.Arrays;

class Main {

    public static void main(String[] args) {
        int[] plants = {2, 4, 5, 1, 2};
        int capacity = 6;
        System.out.println(wateringPlants(plants, capacity));
    }

    static ArrayList<Integer> pos = new ArrayList<>();

    public static int wateringPlants(int[] plants, int capacity) {
       for (int i = 0; i < plants.length; i++) {
            if (plants[i] <= capacity)
                pos.add(i);
        }

        return steps;
    }

    
}