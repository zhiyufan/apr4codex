package com.codex;

import java.util.*;

public class Solution {
public static long smallestNumber(long num) {
    
    List<String> list = new ArrayList<>();
    while (num != 0) {
        list.add(String.valueOf(num % 10));
        num /= 10;
    }

    list.sort(String::compareTo);
    return Long.parseLong(String.join("", list));
}
}