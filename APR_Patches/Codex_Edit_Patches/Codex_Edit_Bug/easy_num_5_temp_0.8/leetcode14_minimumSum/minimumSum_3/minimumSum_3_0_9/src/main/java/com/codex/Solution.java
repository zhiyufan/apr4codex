package com.codex;

import java.util.*;

public class Solution {
package com.exam;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        for (int i = 0; i < n; i++) {
            String s = sc.nextLine();
            String[] ss = s.split(" ");
            int[] arr = new int[ss.length];
            for(int j=0;j<ss.length;j++){
                arr[j] = Integer.parseInt(ss[j]);
            }
            System.out.println(arr[0] + arr[1] + arr[2]);
        }
    }

}
}