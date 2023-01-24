package com.codex;

import java.util.*;

public class Solution {
public class largestPrimeFactor{
    public static void main(String[] args) {
        System.out.println(LargestPrimeFactor(600851475143L));
    public static long LargestPrimeFactor(long number){
        long largestPrimeFactor=0;
        long primeNumber=0;
        boolean isLargestPrimeFactor=false;
        while(!isLargestPrimeFactor){
            primeNumber=nextPrimeNumber(primeNumber);
            if(number%primeNumber==0)
                largestPrimeFactor=primeNumber;
            if(number/primeNumber==1)
                isLargestPrimeFactor=true;
        }
        return largestPrimeFactor;
    }
    
    public static long nextPrimeNumber(long number){
        long nextNumber=number+1;
        boolean isPrime=false;
        while(!isPrime){
            if(nextNumber%2==0){
                nextNumber+=1;
                continue;
            }
            if(nextNumber%3==0){
                nextNumber+=2;
                continue;
            }
            if(nextNumber%3==0){
                nextNumber+=2;
                continue;
            }
            if(nextNumber%5==0){
                nextNumber+=2;
                continue;
            }
            if(nextNumber%7==0){
                nextNumber+=4;
                continue;
            }
            isPrime=true;
        }
        return nextNumber;
    }
}
    }

    
}