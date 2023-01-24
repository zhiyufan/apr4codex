package com.codex;

import java.util.*;

public class Solution {
public class Program {
    public static int twoOutOfThree(int A, int B, int C) {
    	if(A == B || A == C)
			return A;
		if(B == C)
			return B;
		return C;
    }
}
}