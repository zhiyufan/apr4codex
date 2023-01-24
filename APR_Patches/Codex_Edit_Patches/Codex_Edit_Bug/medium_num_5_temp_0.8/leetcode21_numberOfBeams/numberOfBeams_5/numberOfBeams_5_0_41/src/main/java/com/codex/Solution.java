package com.codex;

import java.util.*;

public class Solution {
import java.util.*;
public class file {
    


    public static void main(String[] args) {
        

        System.out.print("Enter a number ");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        System.out.print("Enter a number ");
        int b = sc.nextInt();

        int arr[] = {1, 2, 3, 7, 8, 10, 12, 15, 16};

        boolean check = BinarySearch(arr, a, b);
        if (check == true) {
            System.out.println("Present");
        } else {
            System.out.println("Not Present");
        }

        int res = 0;
        for (int i = 0; i < n; i++) {
            if (ones[i] > 1) {
                res += ones[i] * (ones[i] - 1) / 2;
            }

            for (int j = i + 1; j < n; j++) {
                if (ones[j] == 0) {
                    res += ones[i];
                }
            }
        }

        return res;
    }


    
}