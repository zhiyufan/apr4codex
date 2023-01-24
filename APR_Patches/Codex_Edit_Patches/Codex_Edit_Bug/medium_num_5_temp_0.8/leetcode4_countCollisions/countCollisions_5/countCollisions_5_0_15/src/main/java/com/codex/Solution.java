package com.codex;

import java.util.*;

public class Solution {
    public static int countCollisions(String directions) {
        
        int collisions = 0;
        for (int i = 0; i < directions.length(); i++) {
            if (directions.charAt(i) == 'S') {
                directions = directions.substring(0, i) + directions.substring(i + 1);
                i--;
            }
            else {
                for (int j = 0; j < directions.length(); j++) {
                    if ((directions.charAt(i) != directions.charAt(j) && directions.charAt(j) != 'S')) {
                        collisions += 2;
                        directions = directions.substring(0, i) + 'S' + directions.substring(i + 1);
                        directions = directions.substring(0, j) + 'S' + directions.substring(j + 1);
                        i--;
                        break;
                    }
                }
            }
        }
        return collisions;
    }
    public static class Pair {
        int x;
        int y;

        Pair(int x, int y) {
            this.x = x;
            this.y = y;
        }

        boolean isGreater(Pair p) {
            return this.x > p.x || (this.x == p.x && this.y >= p.y);
        }

        boolean isEqual(Pair p) {
            return this.x == p.x && this.y == p.y;
        }

        boolean isLess(Pair p) {
            return !isGreater(p) && !isEqual(p);
        }
    }

    public static ArrayList<Pair> findPairs(int[] array) {
        ArrayList<Pair> pairs = new ArrayList<>();
        boolean added = false;
        int n = array.length;
        for (int i = 1; i < n; i++) {
            for (int j = 0; j < i; j++) {
                added = false;
                Pair p = new Pair(array[j], array[i]);
                for (int k = 0; k < pairs.size() && !added; k++) {
                    if (p.isEqual(pairs.get(k))) {
                        pairs.get(k).x += 1;
                        added = true;
                    }
                    else if (p.isGreater(pairs.get(k))) {
                        pairs.add(k, p);
                        added = true;
                    }
                }
                if (!added) {
                    pairs.add(p);
                }
            }
        }
        return pairs;
    }
    public static void printPairs(ArrayList<Pair> pairs) {
        for (int i = 0; i < pairs.size(); i++) {
            System.out.print("(" + pairs.get(i).x + ", " + pairs.get(i).y + ") ");
        }
        System.out.println();
    }

    public static int sum(ArrayList<Pair> pairs) {
        int sum = 0;
        for (int i = 0; i < pairs.size(); i++) {
            sum += pairs.get(i).x;
        }
        return sum;
    }

    public static int sumSquare(ArrayList<Pair> pairs) {
        int sum = 0;
        for (int i = 0; i < pairs.size(); i++) {
            sum += pairs.get(i).x * pairs.get(i).y;
        }
        return sum;
    }

    
}