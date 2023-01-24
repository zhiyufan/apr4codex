package com.codex;

import java.util.*;

public class Solution {
import java.util.*;

public static long gridGame(int[][] grid) {

    int[] first = new int[grid[0].length];
    int[] second = new int[grid[0].length];
    for (int i = 0; i < grid[0].length; i++)
        first[i] = grid[0][i];
    for (int i = 0; i < grid[0].length; i++)
        second[i] = grid[1][i];
    Arrays.sort(first);
    Arrays.sort(second);
    int sum = 0;
    boolean swap = true;
    for (int i = 0; i < grid[0].length; i++) {
        if (swap) {
            sum += second[grid[0].length - i - 1];
            swap = false;
        } else {
            sum += first[grid[0].length - i - 1];
            swap = true;
        }
    }
    return sum;
}


import java.util.*;

public static boolean canTwoMoviesFillFlight(int[] movieLengths, int flightLength) {
    Map<Integer, Integer> moviesSeen = new HashMap<>();
    for (int i = 0; i < movieLengths.length; i++) {
        if (moviesSeen.containsKey(flightLength - movieLengths[i])) {
            return true;
        } else {
            moviesSeen.put(movieLengths[i], 1);
        }
    }
    return false;
}


import java.util.*;

public static class Movie {
    private int movieLength;
    private int flightLength;
    private int[] flightLength;
    private int movieLength;

    public boolean canTwoMoviesFillFlight(int movieLengths, int flightLength) {
        Map<Integer, Integer> moviesSeen = new HashMap<>();
        for (int i = 0; i < movieLengths.length; i++) {
            if (moviesSeen.containsKey(flightLength - movieLengths[i])) {
                return true;
            } else {
                moviesSeen.put(movieLengths[i], 1);
            }
            }
        return false;
        }
    }



}
}