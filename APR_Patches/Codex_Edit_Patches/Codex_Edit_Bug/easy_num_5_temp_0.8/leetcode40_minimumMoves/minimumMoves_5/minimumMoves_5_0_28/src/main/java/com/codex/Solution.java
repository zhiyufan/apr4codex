package com.codex;

import java.util.*;

public class Solution {
import java.util.Scanner;

public class MinimumMoves {

    private static final Scanner scanner = new Scanner(System.in);
    
    public static int minimumMoves(String s) {

        if (s.length() < 3 && s.contains("X")) {
            return 0;
        }
        int moves = 0;
        int consecutiveX = 1;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 'X') {
                consecutiveX++;
            } else {
                consecutiveX = 1;
            }
            if (consecutiveX == 3) {
                moves++;
                consecutiveX = 1;
            }
        }
        return moves;
    }

    public static void main(String[] args) {
        // BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int sCount = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        String s = scanner.nextLine();

        int result = minimumMoves(s);
        System.out.println(result);
        // bufferedWriter.write(String.valueOf(result));
        // bufferedWriter.newLine();
        //
        // bufferedWriter.close();

        scanner.close();
    }

}

    
}