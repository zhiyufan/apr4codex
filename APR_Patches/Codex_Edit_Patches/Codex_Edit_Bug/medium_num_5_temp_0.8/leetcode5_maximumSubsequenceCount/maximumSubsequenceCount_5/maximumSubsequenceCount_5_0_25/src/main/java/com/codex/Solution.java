package com.codex;

import java.util.*;

public class Solution {
import java.util.*;
public class MaximumSubsequence {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.next();
        String a = in.next();
        String b = in.next();
        long res = maximumSubsequenceCount(s, a, b);
        System.out.println(res);
    }

    public static long maximumSubsequenceCount(String text, String a, String b) {
        long result = 0;
        Map<Character, List<Integer>> charToIndexes = new HashMap<>();
        for (int i = 0; i < text.length(); i++) {
            if (text.charAt(i) == a.charAt(0) || text.charAt(i) == b.charAt(0)) {
                List<Integer> indexes = charToIndexes.get(text.charAt(i));
                if (indexes == null) {
                    indexes = new ArrayList<>();
                }
                indexes.add(i);
                charToIndexes.put(text.charAt(i), indexes);
            }
        }
        if (charToIndexes.get(a.charAt(0)) == null || charToIndexes.get(b.charAt(0)) == null) {
            return 0;
        }
        List<Integer> firstIndexes = charToIndexes.get(a.charAt(0));
        List<Integer> secondIndexes = charToIndexes.get(b.charAt(0));

        firstIndexes.add(text.length());
        secondIndexes.add(text.length());

        int fIndex = 0;
        int sIndex = 0;
        int first = -1;
        int second = -1;
        while (fIndex < firstIndexes.size() && sIndex < secondIndexes.size()) {
            if (firstIndexes.get(fIndex) < secondIndexes.get(sIndex)) {
                first = firstIndexes.get(fIndex);
                fIndex++;
            } else {
                second = secondIndexes.get(sIndex);
                sIndex++;
            }
            if (second != -1) {
                result += second - first - 1;
            }
        }
        return result;
    }
}
}