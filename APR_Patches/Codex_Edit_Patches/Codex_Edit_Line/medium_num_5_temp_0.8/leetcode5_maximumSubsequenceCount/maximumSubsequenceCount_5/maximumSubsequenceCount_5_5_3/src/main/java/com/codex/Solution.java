package com.codex;

import java.util.*;

public class Solution {
    public static long maximumSubsequenceCount(String text, String pattern) {
        
        long result = 0;
        Map<Character, List<Integer>> charToIndexes = new HashMap<>();
        for (int i = 0; i < text.length(); i++) {
            char c = text.charAt(i);
            List<Integer> indexes = charToIndexes.get(c);
            if (indexes == null) {
                indexes = new ArrayList<>();
            }
            indexes.add(i);
            charToIndexes.put(c, indexes);
        }

        List<Integer> firstIndexes = charToIndexes.get(pattern.charAt(0));
        List<Integer> secondIndexes = charToIndexes.get(pattern.charAt(1));
        firstIndexes.add(text.length());
        secondIndexes.add(text.length());

        int firstIndex = 0;
        int secondIndex = 0;
        int first = -1;
        int second = -1;
        while (firstIndex < firstIndexes.size() && secondIndex < secondIndexes.size()) {
            if (firstIndexes.get(firstIndex) < secondIndexes.get(secondIndex)) {
                first = firstIndexes.get(firstIndex);
                firstIndex++;
            } else {
                second = secondIndexes.get(secondIndex);
                secondIndex++;
            }
            if (second != -1) {
                result += second - first - 1;
            }
        }

        return result;
    }

    import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class Solution {

    // Complete the countSubstrings function below.
    static int countSubstrings(String s) {
        int[] diff = new int[s.length()];

        diff[0] = 1;
        for (int i = 1; i < s.length(); i++) {
            int prev = diff[i - 1];
            char current = s.charAt(i);
            char prevChar = s.charAt(i - 1);
            if (current == prevChar || current == '0' && prevChar == '1' || current == '1' && prevChar == '0') {
                diff[i] = prev + 1;
            } else {
                diff[i] = prev;
            }
        }

        int result = 0;
        for (int d : diff) {
            result += d;
        }

        return result;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int q = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int qItr = 0; qItr < q; qItr++) {
            String s = scanner.nextLine();

            int result = countSubstrings(s);

            bufferedWriter.write(String.valueOf(result));
            bufferedWriter.newLine();
        }

        bufferedWriter.close();

        scanner.close();
    }
}
}