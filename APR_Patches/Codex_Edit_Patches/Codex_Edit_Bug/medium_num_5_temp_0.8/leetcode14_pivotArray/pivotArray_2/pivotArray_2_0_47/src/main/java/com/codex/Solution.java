package com.codex;

import java.util.*;

public class Solution {
// 快速排序的基本思想：通过一趟排序将待排记录分隔成独立的两部分，其中一部分记录的关键字均比另一部分的关键字小，则可分别对这两部分记录继续进行排序，以达到整个序列有序。
// 在一趟快速排序过程中，需要划分出两个子序列，使得比基准小的记录在基准前面，比基准大的在后面。
// 递归地对这两个子序列进行快速排序，直至各区间只有一个记录为止。

public class QuickSort {

	public static int[] quickSort(int[] arr, int start, int end) {
		if (start < end) {
			int q = partition(arr, start, end);
			quickSort(arr, start, q - 1);
			quickSort(arr, q + 1, end);
		}

		return arr;
	}

	public static int partition(int[] arr, int start, int end) {
		int pivot = arr[end];
		int i = start - 1;

		for (int j = start; j <= end - 1; j++) {
			if (arr[j] <= pivot) {
				i++;
				int temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;
			}
        
    }


		i++;
		arr[end] = arr[i];
		arr[i] = pivot;

		return i;


	}

	public static void main(String[] args) {
		int[] arr = {24,2,45,20,56,75,2,56,99,53,12};
		int[] result = quickSort(arr, 0, arr.length - 1);
		for (int i = 0; i < result.length; i++) {
			System.out.println(result[i]);
		}
	}
}
}