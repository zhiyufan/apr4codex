package com.codex;

import java.util.*;

public class Solution {
// DYNAMIC PROGRAMMING

public class Solution {
  
  public int smallestDifference(int[] arrayOne, int[] arrayTwo) {
    int difference = Integer.MAX_VALUE;
    HashMap<Integer, Boolean> map = new HashMap<>();
    
    for (int num: arrayOne){
      map.put(num, true);
    }
    
    for (int num: arrayTwo){
      if (map.containsKey(num)){
        difference = 0;
        return difference;
      } else {
        if (Math.abs(num-map.keySet().iterator().next()) < difference){
          difference = Math.abs(num-map.keySet().iterator().next());
        }
      }
    }
    return difference == Integer.MAX_VALUE? -1: difference;
  }
  
  public static int smallestDifference(int[] arrayOne, int[] arrayTwo) {
    int difference = Integer.MAX_VALUE;
    HashMap<Integer, Boolean> map = new HashMap<>();
    
    for (int num: arrayOne){
      map.put(num, true);
    }
    
    for (int num: arrayTwo){
      if (map.containsKey(num)){
        difference = 0;
        return difference;
      } else {
        if (Math.abs(num-map.keySet().iterator().next()) < difference){
          difference = Math.abs(num-map.keySet().iterator().next());
        }
      }
    }
    return difference == Integer.MAX_VALUE? -1: difference;
  }
}



// ARRAY MANIPULATION

public int arrayManipulation(int max, int[][] queries) {
    int[] arr = new int[max+1];
    int maxSum = 0;
    int sum = 0;
    int index = 0;

    while (index < queries.length){
        int start = queries[index][0] - 1;
        int end = queries[index][1];
        int value = queries[index][2];

        for (int i = start; i < end; i++){
            arr[i] += value;

            if (arr[i] > maxSum){
                maxSum = arr[i];
            }
        }
        index++;
    }
    return maxSum;
}



// UPGRADING SERVERS

    public static int numberOfBeams(String[] bank) {
        
        int numBeams = 0;

        for (int i = 0; i < bank.length; i++) {
            for (int j = 0; j < bank[i].length(); j++) {

                if (bank[i].charAt(j) == '1') {
                    for (int k = i + 1; k < bank.length; k++) {
                        boolean noDevices = true;
                        for (int l = 0; l < bank[k].length(); l++) {
                            if (bank[k].charAt(l) == '1') {
                                for (int m = i + 1; m < k; m++) {
                                    if (bank[m].charAt(l) == '1') {
                                        noDevices = false;
                                        break;
                                    }
                                }
                                if (noDevices) {
                                    numBeams++;
                                }
                            }
                        }
                    }
                }
            }

        }
        return numBeams;
    }




// QUEUES AT THE SCHOOL

public class Test {

	public static void main(String[] args) {
		
		int t = 2;
		int n = 4;
		String s = "GGLLGG";
		
		int time = 0;
		
		while (time < t){
			
			for (int i = 0; i < s.length()-1; i++){
				
				if (s.charAt(i) == 'B' && s.charAt(i+1) == 'G'){
					s = s.substring(0, i) + "GB" + s.substring(i+2);
					i++;
				}
				
			}
			time++;
			
		}
		
		System.out.println(s);

	}

}


}