package com.codex;

import java.util.*;

public class Solution {
public class MinimumHouses {
    public static int mininumHouses(String street) {
        int count = 1;
        for (int i = 1; i < street.length(); i++) {
            if (i == 0) {
                count = 2;
                break;
            }
            else if (street.charAt(i) == 'H' && street.charAt(i - 1) == 'H') {
                count--;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        int minimum = mininumHouses("HOH");
        System.out.println(minimum);
    }
}
}