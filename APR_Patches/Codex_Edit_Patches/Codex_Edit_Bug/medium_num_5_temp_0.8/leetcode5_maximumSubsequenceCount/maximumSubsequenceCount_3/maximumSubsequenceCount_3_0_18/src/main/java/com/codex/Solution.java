package com.codex;

import java.util.*;

public class Solution {
public static long maximumSubsequenceCount(String text, String pattern) {
    long result = 0;
    int index = 0;

    while (index < text.length()) {
        index = text.indexOf(pattern, index);
        if (index == -1)
            break;
        index++;
        result++;
    }
    return result;
}
}