package com.codex;

import java.util.*;

public class Solution {
public static long maximumSubsequenceCount(String text, String pattern) {

    long result = 0;
    List<Integer> firstOfPairIndexes = new ArrayList<>();
    List<Integer> secondOfPairIndexes = new ArrayList<>();
    for (int i = 0; i < text.length(); i++) {
        char c = text.charAt(i);
        if (c == pattern.charAt(0)) {
            firstOfPairIndexes.add(i);
        } else if (c == pattern.charAt(1)) {
            secondOfPairIndexes.add(i);
        }
    }

    int firstIndex = 0;
    int secondIndex = 0;
    while (firstIndex < firstOfPairIndexes.size() && secondIndex < secondOfPairIndexes.size()) {
        int x = firstOfPairIndexes.get(firstIndex);
        int y = secondOfPairIndexes.get(secondIndex);
        if (x < y) {
            result += secondOfPairIndexes.size() - secondIndex;
            firstIndex++;
        } else {
            secondIndex++;
        }
    }

    return result;
}

public static void main(String[] args) throws IOException{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    String[] parts = br.readLine().split(" ");
    int n = Integer.parseInt(parts[0]);
    int k = Integer.parseInt(parts[1]);
    List<Integer> numbers = new ArrayList<>(n);
    for (int i = 0; i < n; i++) {
        numbers.add(Integer.parseInt(br.readLine()));
    }

    long result = 0;
    int firstIndex = 0;
    int secondIndex = firstIndex + 1;
    while (firstIndex < n - 1) {
        while (secondIndex < n &&
            (numbers.get(secondIndex) - numbers.get(firstIndex) >= k ||
                secondIndex - firstIndex < 2)) {
            secondIndex++;
        }

        if (secondIndex < n && secondIndex > firstIndex + 1) {
            int numberOfPairs = secondIndex - firstIndex - 1;
            result += ((long) numberOfPairs) * (numberOfPairs - 1) / 2;
        }

        firstIndex++;
        if (firstIndex == secondIndex) {
            secondIndex++;
        }
    }

    System.out.println(result);
}

public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    String[] parts = br.readLine().split(" ");
    int n = Integer.parseInt(parts[0]);
    int k = Integer.parseInt(parts[1]);
    List<Integer> numbers = new ArrayList<>(n);
    for (int i = 0; i < n; i++) {
        numbers.add(Integer.parseInt(br.readLine()));
    }

    long result = 0;
    int firstIndex = 0;
    int secondIndex = firstIndex + 1;
    while (firstIndex < n - 1) {
        while (secondIndex < n &&
            (numbers.get(secondIndex) - numbers.get(firstIndex) >= k ||
                secondIndex - firstIndex < 2)) {
            secondIndex++;
        }

        if (secondIndex < n && secondIndex > firstIndex + 1) {
            int numberOfPairs = secondIndex - firstIndex - 1;
            result += ((long) numberOfPairs) * (numberOfPairs - 1) / 2;
        }

        firstIndex++;
        if (firstIndex == secondIndex) {
            secondIndex++;
        }
    }

    System.out.println(result);
}

public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    String[] parts = br.readLine().split(" ");
    int n = Integer.parseInt(parts[0]);
    int k = Integer.parseInt(parts[1]);
    List<Integer> numbers = new ArrayList<>(n);
    for (int i = 0; i < n; i++) {
        numbers.add(Integer.parseInt(br.readLine()));
    }

    long result = 0;
    Collections.sort(numbers);

    int firstIndex = 0;
    int secondIndex = firstIndex + 1;
    int thirdIndex = secondIndex + 1;
    while (secondIndex < n - 1) {
        while (thirdIndex < n &&
            numbers.get(thirdIndex) - numbers.get(firstIndex) < k) {
            result += thirdIndex - secondIndex;
            thirdIndex++;
        }

        if (firstIndex == secondIndex) {
            secondIndex++;
            thirdIndex = secondIndex + 1;
        } else {
            firstIndex++;
            }
        }

    }

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

    
}