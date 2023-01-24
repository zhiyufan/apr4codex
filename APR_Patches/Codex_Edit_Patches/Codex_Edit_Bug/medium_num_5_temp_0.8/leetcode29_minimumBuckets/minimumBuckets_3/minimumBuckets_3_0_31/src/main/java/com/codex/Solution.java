package com.codex;

import java.util.*;

public class Solution {
public static int minimumBuckets(String street) {

        char[] streetCharArr = street.toCharArray();
        int numOfBuckets = 0;
        for (int i = 0; i < streetCharArr.length; i++)
            if (streetCharArr[i] == 'H')
                numOfBuckets++;
        return numOfBuckets;
}
}