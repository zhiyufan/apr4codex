package com.codex;

import java.util.*;

public class Solution {

    /**
     * We want to find if there are any collisions between two particles when they meet.
     * We assume that in one second, a particle travels it's speed in a given direction.
     * Thus, two particles will meet if they travel equal distances in opposite directions.
     * For example, particle 1 travels 2 steps to the left, while particle 2 travels two steps to the right will meet.
     * However, two particles traveling to the right will not meet as they are both moving in the same direction
     * The algorithm for this is:
     * Start from the front(i) of the string, and the end(j) of the string.
     * If both are the same direction, we should have a collision.
     * If both are not the same direction, then no collision.
     * If either i or j reaches the middle, we should halt the algorithm.
     * 
     * @param directions
     * @return
     */

    public static int countCollisions(String directions) {

        int collisions = 0;
        if (directions == null || directions.length() == 0 || directions.length() == 1)
            return collisions;

        Set<Character> validDirections = new HashSet<>(Arrays.asList('L', 'R'));
        int i = 0;
        int j = directions.length() - 1;
        while (i <= j) {
            if (i == j) {
                if (validDirections.contains(directions.charAt(i)))
                    collisions++;
                break;
            }
        
            if (directions.charAt(i) == directions.charAt(j) && validDirections.contains(directions.charAt(i)))
                collisions += 2;

            i++;
            j--;
        }

        return collisions;
    }


    public static void main(String[] args) {
        System.out.println(countCollisions(""));
        System.out.println(countCollisions("LLRR"));
        System.out.println(countCollisions("LRLRLRLRL"));
        System.out.println(countCollisions("RRRLLRLLR"));
    }
}