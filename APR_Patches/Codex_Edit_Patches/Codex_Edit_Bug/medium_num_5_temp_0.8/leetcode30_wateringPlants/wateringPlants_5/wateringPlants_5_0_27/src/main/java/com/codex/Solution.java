package com.codex;

import java.util.*;

public class Solution {
function wateringPlants(plants, capacity){
    let steps = 0, currPos = 0, currCapacity = capacity, smallestPlant = 0;
    //Find smallest plant;
    for (let i = 0; i < plants.length; i++){
        if( plants[i] < plants[smallestPlant]){
            smallestPlant = i;
        }
    }
    while(currPos < plants.length){
        if(currCapacity < plants[currPos]){
            currPos = smallestPlant;
            if (currCapacity >= plants[currPos]) break;
            currCapacity = capacity;
            steps++;
        }
        currCapacity -= plants[currPos];
        if(currPos === plants.length - 1){
            for (let i = 0; i < plants.length; i++) {
                if (plants[i] < plants[smallestPlant] && currPos > i) {
                    smallestPlant = i;
                }
            }
        }
        currPos++;
        steps++;
    }
}
}