package com.codex;

import java.util.*;

public class Solution {

// Assume that, the cost is sorted in ascending order.

// Algorithm:
// Let's say the array cost = [8, 10, 15, 20].

// The possible pairs are: [8, 10], [10, 15], and [15, 20]. The pairs are taking a different element each time.

// We can see that the first time we took the mininum element and the second time we took the second minimum element.

// The third time we took the first minimum element and the fourth time we took the second minimum element. We can see that we are taking the minimum element alternatively if there are more than two elements.

// In this problem. We don't need to actually take the minimum element as long as we take the minimum element's cost.

// For example, let's say we need to construct a pole from the following costs: [20, 15, 8, 10]. The first minimum cost is 8 and the second minimum cost is 10. So, the result will be 8 + 10 = 18. As long as we sum the minimum elements alternatively, we can get the correct result.

// Algorithm:
// 1- Update the minimum and second minimum elements whenever we find an element that is smaller than the current minimum.

// 2- Iterate on the array and keep a running sum. If the current minimum is odd, add the second minimum to the running sum else add the current minimum to the running sum.

// 3- Return the running sum.

    public int minimumCost(int[] cost) {
        
        if (cost == null || cost.length == 0) {
            return 0;
        }

        int firstMin = 0;
        int secondMin = 0;
        int firstMinIndex = -1;

        int res = 0;

        for (int i = 0; i < cost.length; ++i) {
            if (firstMinIndex < 0 || cost[i] < cost[firstMinIndex]) {
                secondMin = firstMin;
                firstMin = cost[i];
                firstMinIndex = i;
            } else if (secondMin == 0 || cost[i] < cost[secondMin]) {
                secondMin = cost[i];
            }
        }

        for (int i = 0; i < cost.length; ++i) {
            res += i % 2 == firstMinIndex % 2 ? firstMin : secondMin;
        }

        return res;
    }

// Without sorting the array (naive solution):

// Algorithm:
// We can use the solution we talked about earlier. The idea is still the same. We need to take the minimum elements alternatively.

// 1- Iterate on the array and update the mininum and second minimum. Also, keep track of their indices.

// 2- Iterate on the array again and keep a running sum. If the index is even and it matches the current minimum index or if the index is odd and it matches the current second minimum index, then add the current minimum to the running sum else add the second minimum to the running sum.

// 3- Return the running sum.

    public static int minimumCost(int[] cost) {
        
        if (cost == null || cost.length == 0) {
            return 0;
        }

        int min = Integer.MAX_VALUE;
        int secondMin = Integer.MAX_VALUE;
        int minIndex = -1;
        int secondMinIndex = -1;

        for (int i = 0; i < cost.length; ++i) {
            if (cost[i] < min) {
                secondMin = min;
                min = cost[i];
                secondMinIndex = minIndex;
                minIndex = i;
            } else if (cost[i] < secondMin) {
                secondMin = cost[i];
                secondMinIndex = i;
            }
        }
        
        int res = 0;
        for (int i = 0; i < cost.length; ++i) {
            res += i % 2 == minIndex % 2 ? min : secondMin;
        }

        return res;
    }
}