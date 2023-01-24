package com.codex;

import java.util.*;

public class Solution {
    public static int minimumBuckets(String street) {
        

        char[] streetCharArr = street.toCharArray();
        int count = 0;
        for (int i = 0; i < streetCharArr.length - 1; i++) {
          if (streetCharArr[i + 1] == 'H'){
            count++;
          }
          else if (streetCharArr[i + 1] == '.') {
            i++;
          }
        }
        return count;
    }
}