package com.codex;

import java.util.*;

public class Solution {
    /*   
        Coding challenge for CodeSignal:
        You are watering your plants in a row, but you need a method to determine how much water you would have after watering them all, assuming that water can reach the end of the row.
        Given an array of ints, representing the amount of water each plant can hold, as well as the amount of water you are able to carry, determine the total amount of water you would have after watering your plants.
        Example:
        For plants = [0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1] and capacity = 6, the output should be wateringPlants(plants, capacity) = 9.
        In order to water the plants from left to right, you will first have to empty the 3 gallon jug, so you will start with 6 units of water. Then you fill the second jug up to 5. Finally, you will empty the 5 gallon jug and fill it up to 3 again to water the third plant, so the 2nd plant will get 5 units of water, and the 3rd will get 2.
        For plants = [3, 1, 5, 4] and capacity = 7, the answer is 19.
        For plants = [2, 4, 5, 1, 2] and capacity = 10, the answer is 16.
    */

    public static void main(String[] args) {
        int[] array = {0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1};
        System.out.println(wateringPlants(array, 6));
    }


    public static int wateringPlants(int[] plants, int capacity) { //O(N)
        

        int steps = 0;
        int currPos = 0;
        int currCapacity = capacity;
        int smallestPlant = 0; // smallest plant for index
        for (int i = 0; i < plants.length; i++) {
            if (plants[i] < plants[smallestPlant]) { //find the smallest plant, use it as index
                smallestPlant = i;
            }
        }
        while (currPos < plants.length) { //walk through the array
            if (currCapacity < plants[currPos]) {
                currPos = smallestPlant;
                if (currCapacity >= plants[currPos]) {
                    break;
                }
                currCapacity = capacity;
                steps++;
            }
            currCapacity -= plants[currPos];
            currPos++;
            steps++;
        }
        return steps;
    }

    
}