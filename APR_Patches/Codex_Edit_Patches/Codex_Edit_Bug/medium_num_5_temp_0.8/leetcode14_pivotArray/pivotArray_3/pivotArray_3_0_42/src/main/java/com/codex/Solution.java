package com.codex;

import java.util.*;

public class Solution {
import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		// input
		System.out.println("Enter length of array :");
		int length = in.nextInt();
		// create array
		int[] array = new int[length];
		System.out.println("Enter " + length + " element :");
		for (int i = 0; i < length; i++) {
			array[i] = in.nextInt();
		}
		// print array
		System.out.println(Arrays.toString(array));
		// sort array
		int[] arraySort = sortArray(array);
		// print array sort
		System.out.println(Arrays.toString(arraySort));
		in.close();
	}

	public static int[] sortArray(int[] array) {
		for (int i = 0; i < array.length; i++) {
			for (int j = i; j < array.length; j++) {
				if (array[i] > array[j]) {
					int temp = array[i];
					array[i] = array[j];
					array[j] = temp;
				}
			}
		}
		return array;
	}
}
}