package com.codex;

import java.util.*;

public class Solution {
public class Solution {

    public static long numberOfWeeks(int[] filename) {
        
        Arrays.sort(filename);
        long ret = 0;
        for (int i = filename.length - 1; i >= 0; i--) {
            ret += filename[i] / (filename.length - i);
            if (filename[i] % (filename.length - i) != 0) ret++;
        }
        return ret;
    }

}
    
}