package com.codex;

import java.util.*;

public class Solution {
    public static int minimumMoves(String s) {
        
        if (s.length() < 3) {
            return 0;
        }
        int moves = 0;
        int consecutiveX = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 'X') {
                consecutiveX++;
            } else {
                consecutiveX = 0;
            }
            if (consecutiveX == 3) {
                moves++;
                consecutiveX = 1;
            }
        }
        return moves;
    }

    public class KFoldValidation {

	public static void main(String[] args) {
		double[] train_dataset = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15};
		int count = 0;
		for (int i = 0; i < 5; i++) {
			double[] testing_dataset = new double[3];
			double[] training_dataset = new double[train_dataset.length - testing_dataset.length];
			
			int index = 0;
			
			for (int j = i; j < i+3; j++) {
				testing_dataset[j-i] = train_dataset[j];
				index = j+1;
			}
			
			int k = 0;
			for (int j = 0; j < training_dataset.length; j++) {
				if (index >= train_dataset.length) {
					index = 0;
				}
				training_dataset[j] = train_dataset[index++];
			}
			
			System.out.println("Testing"+(i+1));
			System.out.println("Testing_dataset");
			for (int j = 0; j < testing_dataset.length; j++) {
				System.out.println(testing_dataset[j]);
			}
			System.out.println("Training_dataset");
			for (int j = 0; j < training_dataset.length; j++) {
				System.out.println(training_dataset[j]);
			}
		}
		

	}

}

    
}