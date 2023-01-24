package com.codex;

import java.util.*;

public class Solution {
class Solution {
    public boolean isHappy(int n) {
        Set<Integer> inLoop = new HashSet<Integer>();
        int squareSum,remain;
	    while (inLoop.add(n)) {
		    squareSum = 0;
		    while (n > 0) {
			    remain = n%10;
			    squareSum += remain*remain;
			    n /= 10;
		    }
		    if (squareSum == 1)
			    return true;
		    else
			    n = squareSum;
	    }
	    return false;
    } 
}
}