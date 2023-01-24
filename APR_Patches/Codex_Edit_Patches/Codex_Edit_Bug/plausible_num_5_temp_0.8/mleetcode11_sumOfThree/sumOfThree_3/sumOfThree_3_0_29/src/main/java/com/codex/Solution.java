package com.codex;

import java.util.*;

public class Solution {
    public static long[] sumOfThree(long num) {
        
        if (num==0)
		return new long[]{-1,-1,-1};
		long[] result = new long[3];
		long sqrtNum = (long) Math.sqrt(num);
		for (long i = 1; i <= sqrtNum; i++) {
			long rest = num - i*i; 
			if (rest % i == 0 ){
				long j = rest/i;
				if (isPrime(i) && isPrime(j) && i!=j){
					result[0] = i;
					result[1] = j;
					result[2] = num - i - j;
				}
			}
		}
        return result;
    } 
	
	private static boolean isPrime(long num){
		if (num == 1) return false;
		for (int i = 2; i <= Math.sqrt(num); i++){
			if (num % i == 0){
				return false;
			}
		}
		return true;
    }
    
}