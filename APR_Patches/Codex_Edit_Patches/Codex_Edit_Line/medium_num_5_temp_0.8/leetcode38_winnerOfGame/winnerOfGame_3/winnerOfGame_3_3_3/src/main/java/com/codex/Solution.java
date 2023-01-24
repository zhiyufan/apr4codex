package com.codex;

import java.util.*;

public class Solution {
import java.util.Arrays;

public class solution {

    public static int[] sortScores(int[] unorderedScores, int highestPossibleScore) {

    // Sort the scores in O(n) time
     int[] counts = new int[highestPossibleScore+1];

     for(int score : unorderedScores) {
      counts[score]++;
     }

     int[] sortedScores = new int[unorderedScores.length];
     int currentSortedIndex = 0;

     // For each item in counts
     for(int i=0; i<counts.length; i++) {
       int count = counts[i];

       // For the number of times the item occurs
       for (int j=0; j<count; j++) {
         // Add it to the sorted array
         sortedScores[currentSortedIndex] = i;
         currentSortedIndex++;
       }
        }

     return sortedScores;
    }

    public static void main(String[] args) {
        int[] sortedScores = sortScores(new int[]{3,5,3,9,7,5,3,5,3,1,6,3}, 10);
        System.out.println(Arrays.toString(sortedScores));
    }
}
    
}