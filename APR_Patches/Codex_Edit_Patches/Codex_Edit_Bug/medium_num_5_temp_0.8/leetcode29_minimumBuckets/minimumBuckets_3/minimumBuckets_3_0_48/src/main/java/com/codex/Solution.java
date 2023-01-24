package com.codex;

import java.util.*;

public class Solution {
    public static int minimumBuckets(String street) {
        

        char[] streetCharArr = street.toCharArray();
        int count = 0;
        for (int i = 0; i < streetCharArr.length; i++) {
            if (streetCharArr[i] == 'H') {
                if (i - 1 >= 0) {
                    if (streetCharArr[i - 1] == '.') {
                        streetCharArr[i - 1] = 'B';
                        count++;
                    }
                }
                if (i + 1 < streetCharArr.length) {
                    if (streetCharArr[i + 1] == '.') {
                        streetCharArr[i + 1] = 'B';
                        count++;
                    }
                }
            }
        }
        return count;
    }

    def minimum_buckets(street):
    street = ['B' if x=='H' else x for x in street ]
    street = list(street)

    for i in range(1,len(street)-1):
        if street[i] == 'H':
            if street[i-1] == '.':
                street[i-1] = 'B'
            if street[i+1] == '.':
                street[i+1] = 'B'

    return street.count('B')
    

    
}