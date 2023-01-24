package com.codex;

import java.util.*;

public class Solution {
import java.util.*;
class Solution {
    public int[] sortArrayByParity(int[] A) {
        int size = A.length;
        int[] result = new int[size];
        int i = 0;
        int j = size - 1;
        for (int x : A) {
            if (x % 2 == 0) {
                result[i++] = x;
            } else {
                result[j--] = x;
            }
        }
        return result;
    }

}
}