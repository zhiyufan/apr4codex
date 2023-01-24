package com.codex;

import java.util.*;

public class Solution {
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
public class Solution {
	public static void main(String[] args) throws FileNotFoundException {
		Scanner input = new Scanner(new File("src/sample.txt"));
		int t = input.nextInt();
		for(int i = 0; i < t; i++) {
			int n = input.nextInt();
			int k = input.nextInt();
			System.out.println(k-1);
		}
	}
}


class Solution {

	public static void main(String[] args) throws Exception {
		Scanner input = new Scanner(new File("src/sample.txt"));
		int t = input.nextInt();
		for (int i = 0; i < t; i++) {
			int n = input.nextInt();
			int k = input.nextInt();
			System.out.println((k * k * k * k * k + k * k * k * k * k * k) - (k * k * k * k) - (k * k * k * k * k * k));
		}
	}
}


    class Solution{

    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(new File("src/sample.txt"));
        int t = input.nextInt();
        for(int i = 0; i < t; i++){
            int n = input.nextInt();
            int k = input.nextInt();
            System.out.println((int)(Math.pow(k, 5) + Math.pow(k, 6) - Math.pow(k, 4) - Math.pow(k, 6)));
        }
    }

}
}