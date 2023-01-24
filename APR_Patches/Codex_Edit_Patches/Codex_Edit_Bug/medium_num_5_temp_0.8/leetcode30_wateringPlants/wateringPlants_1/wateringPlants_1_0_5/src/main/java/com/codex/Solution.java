package com.codex;

import java.util.*;

public class Solution {
public static int wateringPlants(int[] plants, int capacity) {
        int i = 1;
        int steps = 1;
        int remaining = capacity - plants[0];
        while (i < plants.length) {
        	if (remaining < plants[i]) {
        		if (i == 1) {
        			return -1;
        		}
        		remaining = capacity - plants[i];
        		steps++;
        	} else {
        		remaining -= plants[i];
        	}
        	
        	i++;
        }
        return steps;
    }

    public static int wateringPlants1(int[] plants, int capacity) {
        int i = 1;
        int steps = 1;
        int remaining = capacity - plants[0];
        while (i < plants.length) {
        	if (remaining < plants[i]) {
                return -1;
        	} else {
        		remaining -= plants[i];
        	}
        	
        	i++;
        }
        return steps;
    }

    
}