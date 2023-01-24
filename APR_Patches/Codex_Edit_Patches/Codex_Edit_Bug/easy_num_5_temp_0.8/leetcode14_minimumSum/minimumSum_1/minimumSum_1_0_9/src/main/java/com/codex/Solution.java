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




	import java.util.*;

	public class Test {

	    public static void main(String[] args) {
	        Scanner in = new Scanner(System.in);
	        int n = in.nextInt();
	        int arr[] = new int[n];
	        for(int arr_i=0; arr_i < n; arr_i++){
	            arr[arr_i] = in.nextInt();
	        }
	        List<Integer> result = new ArrayList<>();
	        for(int i=1; i<n; i++){
	            result.add(getMinSum(arr[i-1], arr[i]));
	            
	        }
	        printResult(result);
	    }
	    
	    private static void printResult(List<Integer> result){
	        int res = 0;
	        for(int i=0; i<result.size(); i++){
	            res += result.get(i);
	        }
	        System.out.println(res);
	    }
	    
	    private static int getMinSum(int num1, int num2){
	        
	        List<Integer> digits = new ArrayList<>();
	        while (num1 > 0) {
	            digits.add(num1 % 10);
	            num1 /= 10;
	        }
	        Collections.sort(digits);
	        int first = 0, second = 0;
	        for (int i = digits.size() - 1; i >= 0; i--) {
	            first = first * 10 + digits.get(i);
	            if (i > 0)
	                second = second * 10 + digits.get(i - 1);
	            i--;
	        }
	        
	        
	        digits = new ArrayList<>();
	        while (num2 > 0) {
	            digits.add(num2 % 10);
	            num2 /= 10;
	        }
	        Collections.sort(digits);
	        int first2 = 0, second2 = 0;
	        for (int i = digits.size() - 1; i >= 0; i--) {
	            first2 = first2 * 10 + digits.get(i);
	            if (i > 0)
	                second2 = second2 * 10 + digits.get(i - 1);
	            i--;
	        }
	        
	        return Math.min(first + second2, second + first2);
	    }
	}



    
    }

    
}