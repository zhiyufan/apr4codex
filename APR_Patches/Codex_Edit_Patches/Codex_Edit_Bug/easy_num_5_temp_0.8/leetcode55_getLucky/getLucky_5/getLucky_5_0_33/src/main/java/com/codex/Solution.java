package com.codex;

import java.util.*;

public class Solution {
public static int getLucky(String s, int k) {
    
    int convert;
    
    if (s.contains("a")) {
        convert = s.indexOf('a') + 1;
    } else if (s.contains("b")) {
        convert = s.indexOf('b') + 2;
    } else if (s.contains("c")) {
        convert = s.indexOf('c') + 3;
    } else if (s.contains("d")) {
        convert = s.indexOf('d') + 4;
    } else {
    
    return convert;
}
        convert = 0;
    }
}