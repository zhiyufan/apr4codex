package com.codex;

import java.util.*;

public class Solution {
public static HashSet<String> allUniqueSubstrings(String text, int length) {
    HashSet<String> substrings = new HashSet<>();
    for (int i = 0; i < text.length(); i++) {
        if (i + length <= text.length())
            substrings.add(text.substring(i, i + length));
        else
            substrings.add(text.substring(i));
    }

    return substrings;
}
}