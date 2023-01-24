package com.codex;

import java.util.*;

public class Solution {
        public static int[] findEvenNumbers(int[] digits) {
        return Arrays.stream(digits)
                .boxed()
                .flatMap(a -> Arrays.stream(digits).boxed().flatMap(b -> Arrays.stream(digits).boxed().map(c -> a + "" + b + "" + c)))
                .mapToInt(Integer::parseInt)
                .filter(a -> a % 2 == 0)
                .sorted()
                .toArray();
}
}