package com.codex;

import java.util.*;

public class Solution {
int i = 0;
int position = capacity;
int steps = 1;
int maxPlantsPosition = 0;
while (i < plants.length) {
if (plants[i] > capacity) {
return -1;
}
if (position < 0) {
steps++;
position = capacity;
}
if ((plants[i] > capacity - position) && (i != maxPlantsPosition)) {
steps++;
position = capacity;
}
position -= plants[i];
i++;
}
return steps;
}
public static int wateringPlants(int[] plants, int capacity) {
    
}