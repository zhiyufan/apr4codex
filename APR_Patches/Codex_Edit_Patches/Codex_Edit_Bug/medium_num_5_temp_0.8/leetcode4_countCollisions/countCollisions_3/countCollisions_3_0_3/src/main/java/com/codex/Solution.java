package com.codex;

import java.util.*;

public class Solution {
public static int countCollisions(String directions) {
        
    int collisions = 0;
    if (directions == null || directions.length() == 0)
        return collisions;
    int i = 0;
    int j = directions.length() - 1;
    while (i < j) {
        if (directions.charAt(i) == 'L' && directions.charAt(j) == 'L') {
            collisions += 2;
        } else if (directions.charAt(i) == 'L' && directions.charAt(j) == 'R') {
            collisions++;
        } else if (directions.charAt(i) == 'R' && directions.charAt(j) == 'R') {
            collisions += 2;
        } else if (directions.charAt(i) == 'R' && directions.charAt(j) == 'L') {
            collisions++;
        }
        i++;
        j--;
    }

    return collisions;
}



Given:

    1
    4
    3
    4
    3
    1

    1
    2
    3
    4
    5
    6





public static int countCollisions(String directions) {
    // for every L find an R
    int collisions = 0;
    if (directions == null || directions.length() == 0)
        return collisions;
    int i = 0;
    int j = directions.length() - 1;
    while (i < j) {
        if (directions.charAt(i) == 'L' && directions.charAt(j) == 'L') {
            collisions += 2;
        } else if (directions.charAt(i) == 'L' && directions.charAt(j) == 'R') {
            collisions++;
        } else if (directions.charAt(i) == 'R' && directions.charAt(j) == 'R') {
            collisions += 2;
        } else if (directions.charAt(i) == 'R' && directions.charAt(j) == 'L') {
            collisions++;
        }
        i++;
        j--;
    }

    return collisions;
}




public static int countCollisions(String directions) {
    // for every L find an R
    int collisions = 0;
    if (directions == null || directions.length() == 0)
        return collisions;
    int i = 0;
    int j = directions.length() - 1;
    while (i < j) {
        if (directions.charAt(i) == 'L' && directions.charAt(j) == 'L') {
            collisions += 2;
        } else if (directions.charAt(i) == 'L' && directions.charAt(j) == 'R') {
            collisions++;
        } else if (directions.charAt(i) == 'R' && directions.charAt(j) == 'R') {
            collisions += 2;
        } else if (directions.charAt(i) == 'R' && directions.charAt(j) == 'L') {
            collisions++;
        }
        i++;
        j--;
    }

    return collisions;
}








public static int countCollisions(String directions) {
    // for every L find an R
    int collisions = 0;
    if (directions == null || directions.length() == 0)
        return collisions;
    int i = 0;
    int j = directions.length() - 1;
    while (i < j) {
        if (directions.charAt(i) == 'L' && directions.charAt(j) == 'L') {
            collisions += 2;
        } else if (directions.charAt(i) == 'L' && directions.charAt(j) == 'R') {
            collisions++;
        } else if (directions.charAt(i) == 'R' && directions.charAt(j) == 'R') {
            collisions += 2;
        } else if (directions.charAt(i) == 'R' && directions.charAt(j) == 'L') {
            collisions++;
        }
        i++;
        j--;
    }

    return collisions;
}












    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < n; i++) {
            int data = scanner.nextInt();
            if (data > max)
                max = data;
            if (data < min)
                min = data;
            }
        System.out.println(min + " " + max);
    }
















































public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int n = scanner.nextInt();
    int max = Integer.MIN_VALUE;
    int min = Integer.MAX_VALUE;
    for (int i = 0; i < n; i++) {
        int data = scanner.nextInt();
        if (data > max)
            max = data;
        if (data < min)
            min = data;
    }
    System.out.println(min + " " + max);
}

















































Given

    5
    1
    4
    3
    2
    5

Output

    1 5



    public static int countCollisions(String directions) {
        // for every L find an R
        int collisions = 0;
        if (directions == null || directions.length() == 0)
            return collisions;
        int i = 0;
        int j = directions.length() -
    
}