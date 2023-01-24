package com.codex;

import java.util.*;

public class Solution {
import java.util.Scanner;

    public static int minMoves(int target, int maxDoubles) {
        Scanner scanner = new Scanner(System.in);
        target = scanner.nextInt();
        maxDoubles = scanner.nextInt();

        int moves = 0;
        while (target > 0) {
            if (target % 2 == 0 && maxDoubles > 0) {
                target /= 2;
                maxDoubles--;
            } else {
                target -= 1;
            }
            moves++;
        }
        return moves;

    }

    public static void main(String[] args) {
        
        System.out.println(minMoves(2, 3));
    }

    
}