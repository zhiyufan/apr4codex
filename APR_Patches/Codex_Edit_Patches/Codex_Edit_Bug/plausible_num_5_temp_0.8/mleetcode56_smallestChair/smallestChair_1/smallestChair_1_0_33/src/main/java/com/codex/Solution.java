package com.codex;

import java.util.*;

public class Solution {
import java.io.*;
import java.util.*;

//https://www.hackerrank.com/challenges/minimum-draws/problem
public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        while (t-- > 0) {
            int n = Integer.parseInt(br.readLine());
            System.out.println(socksPair(n));
        }
    }

    public static int socksPair(int n) {

        return (n + 1);
    }

}

//https://www.hackerrank.com/challenges/flatland-space-stations/problem
public class Solution {

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String[] nm = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        int n = Integer.parseInt(nm[0]);

        int m = Integer.parseInt(nm[1]);

        String[] cItems = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        List<Integer> c = new ArrayList<>();

        for (int i = 0; i < m; i++) {
            int cItem = Integer.parseInt(cItems[i]);
            c.add(cItem);
        }

        int result = flatlandSpaceStations(n, c);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }

    // Complete the flatlandSpaceStations function below.
    static int flatlandSpaceStations(int n, List<Integer> c) {

        int[] arr = new int[n + 1];
        for (Integer x : c) {
            int value = x;
            arr[value] = 1;
        }

        int pre = 0;
        int max = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 1 && pre == 0) {
                pre = i;
            } else if (arr[i] == 1) {
                max = Math.max(max, i - pre);
                pre = i;
            }
        }

        return max / 2;
    }
}








    public static int smallestChair(int[][] times, int targetFriend) {
        


        int[] arr = new int[times.length];
        for (int i = 0; i < times.length; i++) {
            int arrival = times[i][0];
            int leaving = times[i][1];
            arr[arrival]++;
            arr[leaving]--;
        }

        int cnt = 0;
        for (int i = 0; i < arr.length; i++) {
            cnt += arr[i];
            if (cnt - 1 == targetFriend)
                return i;
        }

        return 0;
    }   

}
}