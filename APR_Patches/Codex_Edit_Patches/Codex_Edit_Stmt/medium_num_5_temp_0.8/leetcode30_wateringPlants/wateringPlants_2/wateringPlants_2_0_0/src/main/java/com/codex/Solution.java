package com.codex;

import java.util.*;

public class Solution {
    public static int wateringPlants(int[] plants, int capacity) {
        
        int steps = 0;
        int i = 0;
        int x = -1;
        int water = capacity;
        while (i < plants.length) {
            if (x >= 0) {
                if (water < plants[i]) {
                    steps++;
                    water = capacity;
                    x = -1;
                } else {
                    steps++;
                    water -= plants[i];
                    i++;
                    x++;
                }
            } else {
                water = capacity;
                steps++;
                x = 0;
            }
        }
        return steps;
    }



public class Main {

    public static int wateringPlants(int[] plants, int capacity) {
        // Write your code here
        int steps = 0;
        int i = 0;
        int x = -1;
        int water = capacity;
        while (i < plants.length) {
            if (x >= 0) {
                if (water < plants[i]) {
                    steps++;
                    water = capacity;
                    x = -1;
                } else {
                    steps++;
                    water -= plants[i];
                    i++;
                    x++;
                }
            } else {
                water = capacity;
                steps++;
                x = 0;
            }
        }
        return steps;
    }

    public static void main(String[] args) throws IOException {
        Scanner in = new Scanner(System.in);
        final String fileName = System.getenv("OUTPUT_PATH");
        BufferedWriter bw = new BufferedWriter(new FileWriter(fileName));
        int res;

        int _plants_size = 0;
        _plants_size = Integer.parseInt(in.nextLine().trim());
        int[] _plants = new int[_plants_size];
        int _plants_item;
        for(int _plants_i = 0; _plants_i < _plants_size; _plants_i++) {
            _plants_item = Integer.parseInt(in.nextLine().trim());
            _plants[_plants_i] = _plants_item;
        }

        int _capacity;
        _capacity = Integer.parseInt(in.nextLine().trim());

        res = wateringPlants(_plants, _capacity);
        bw.write(String.valueOf(res));
        bw.newLine();

        bw.close();
    }
}
}