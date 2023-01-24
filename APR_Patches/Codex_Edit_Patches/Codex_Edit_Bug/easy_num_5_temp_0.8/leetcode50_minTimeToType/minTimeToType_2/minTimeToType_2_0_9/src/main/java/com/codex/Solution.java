package com.codex;

import java.util.*;

public class Solution {


class Solution {
public int[][] kClosest(int[][] points, int K) {
        

		// Can also run a quick select instead of sorting
		// However planning to fix quick select in this file as a separate program
       int start = 0;
       int end = points.length - 1;
       quickSort(points, start, end);
       int[][] result = new int[K][2];
       for (int i = 0; i < K; i++) {
           result[i][0] = points[i][0];
           result[i][1] = points[i][1];
       }
       return result;
    }
    
    private void quickSort(int[][] points, int start, int end) {
        if (start >= end) {
            return;
        }
        
        // Randomly choose a pivot
        int pivot = (int) (Math.random() * (end - start + 1) + start);
        int[] temp = points[start];
        points[start] = points[pivot];
        points[pivot] = temp;
        
        int left = start;
        int right = end;
        int pivotValue = getDistance(points[start]);
        while (left <= right) {
            // If the current value from the left is larger than the pivot
            // element then get the next element from the left
            while (left <= right && getDistance(points[left]) < pivotValue) {
                left++;
            }
            
            // If the current value from the right is smaller than the pivot
            // element then get the next element from the right
            while (left <= right && getDistance(points[right]) > pivotValue) {
                right--;
            }
            
            // If we have found a value in the left which is larger than
            // the pivot element and if we have found a value in the right
            // which is smaller than the pivot element then we exchange the
            // values.
            // As we are done we can increase left and decrease right
            if (left <= right) {
                temp = points[left];
                points[left] = points[right];
                points[right] = temp;
                left++;
                right--;
            }
        }

        
        // Recursion
        if (start <= right) {
            quickSort(points, start, right);
        }
        if (left <= end) {
            quickSort(points, left, end);
        }
    }

    private int getDistance(int[] point) {
        int x = point[0];
        int y = point[1];
        return x * x + y * y;
    }
}
}