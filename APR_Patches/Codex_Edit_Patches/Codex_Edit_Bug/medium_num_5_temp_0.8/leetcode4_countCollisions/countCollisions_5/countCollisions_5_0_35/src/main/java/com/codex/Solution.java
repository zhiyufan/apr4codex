package com.codex;

import java.util.*;

public class Solution {
import java.util.*;

public class Solution {
    public static int countCollisions(String directions1, String directions2) {
        int collisions = 0;
        for (int i = 0; i < directions1.length(); i++) {
            collisions += countCollision(directions1.charAt(i), directions2.charAt(i));
        }
        return collisions;
    }

    private static int countCollision(char dir1, char dir2) {
        if (dir1 == 'S' || dir2 == 'S') {
            return 0;
        }
        else if (dir1 != dir2) {
            return 2;
        }
        return 0;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while(t-- > 0) {
            int n = sc.nextInt();
            int m = sc.nextInt();
            String str1 = sc.next();
            String str2 = sc.next();

            System.out.println(countCollisions(str1, str2));
        }
    }
}

public class Solution {
    public static int countCollisions(String directions) {       
        int collisions = 0;
        for (int i = 0; i < directions.length(); i++) {
            if (directions.charAt(i) != 'S') {
                int count = 0;
                for (int j = i + 1; j < directions.length(); j++) {
                    if (directions.charAt(i) == directions.charAt(j) && directions.charAt(j) != 'S') {
                        count += countCollision(directions.charAt(i), directions.charAt(j));
                    }
                }
                collisions += count;
                directions = directions.substring(0, i) + directions.substring(i + 1);
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

    
}