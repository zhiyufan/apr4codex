package com.codex;

import java.util.*;

public class Solution {
public int numSubarraysWithSum(int[] A, int S) {
        int psum=0, res=0, count[]=new int[A.length+1];
        count[0]=1;
        for(int i=0; i<A.length; i++)
        {
            psum += A[i];
            if(psum >= S)
                res+=count[psum - S];
            count[psum]++;
        }
        return res;
    }
   
/*
The idea is to use HashMap to save the sum-to-index mapping. Add a virtual index -1,
which enable us to handle edge case when the sum equals to S. For each index in the array,
we calculate the sum, and check if it exists in the HashMap.
If the sum exists, it means there are a subarray ending at the current index with sum equal to S.
We can use the saved index to calculate the size of the subarray.
If the sum doesn't exist, it means there is no subarray end at the current index with sum equal to S.
We add the sum and the current index to the HashMap.
To calculate the total number of subarrays with sum equal to S,
we need to traverse the array once,
and for each index, it takes constant time to check if the sum exists in the HashMap.
In total, the time complexity of this solution is O(n).
*/
 public int numSubarraysWithSum(int[] A, int S) {
        HashMap<Integer, Integer> map = new HashMap<>();
        // To handle the edge case when the sum == S,
        // we insert the value (-1, -1) to the map.
        map.put(0, -1);
        int sum = 0, res = 0;
        for(int i = 0; i < A.length; i++) {
            sum += A[i];
            if(map.containsKey(sum - S)) {
                res += map.get(sum - S);
                }
            }
            map.put(sum, map.getOrDefault(sum, 0) + 1);
        }

        return res;
    }


    
}