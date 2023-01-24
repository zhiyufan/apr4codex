package com.codex;

import java.util.*;

public class Solution {
    public static int minimumSum(int num) {
        

        List<Integer> digits = new ArrayList<>();
        while (num > 0) {
            digits.add(num % 10);
            num /= 10;
        }
        Collections.sort(digits);
        int first = 0, second = 0;
        for (int i = digits.size() - 1; i >= 0; i--) {
            first = first * 10 + digits.get(i);
            if (i > 0)
                second = second * 10 + digits.get(i - 1);
            i--;
        }
        return first + second;
<<<<<<< HEAD
=======
    import java.util.*;
    public class Main
    {
    	public static void main(String[] args) {
    	Scanner sc=new Scanner(System.in);
    	int n=sc.nextInt();
    	int arr[]=new int[n];
    	int zeroes=0;
    	for(int i=0;i<n;i++){
    	    arr[i]=sc.nextInt();
    	    if(arr[i]==0){
    	        zeroes++;
    	    }
    	}
    	int ones=n-zeroes;
    	if(ones>=zeroes){
    	    if(zeroes%2==0){
    	        System.out.println("YES");
    	    }
    	    else{
    	        System.out.println("NO");
    	    }
    	}
    	else{
    	    if(ones%2==0){
    	        System.out.println("YES");
    	    }
    	    else{
    	        System.out.println("NO");
    	    }
    	}
    		
    	}
    }
>>>>>>> cef6b9f7d0d9acf17da6acc38e6d2edbdd5639f0
    }

    
}