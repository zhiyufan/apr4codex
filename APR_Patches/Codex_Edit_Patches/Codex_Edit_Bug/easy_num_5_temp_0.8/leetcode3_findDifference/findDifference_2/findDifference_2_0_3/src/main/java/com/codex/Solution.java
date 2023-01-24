package com.codex;

import java.util.*;

public class Solution {
{
    // write a program to store some student details like Name, Roll No and marks
    // of 2 subjects in an array.
    // The program should calculate the result of each student and store it in an
    // array.
    // The program should also make the pass or fail status and mark the
    // distinction students.
    // Use data structures wherever applicable.

}

public class Student {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter no. of students: ");
        int n = s.nextInt();
        int[][] students = input(n);
        int[] result = calculate(students, n);
        
        List<List<Integer>> res = new ArrayList<>();
        Set<Integer> set1 = new HashSet<>();
        Set<Integer> set2 = new HashSet<>();
        for (int i : nums1) set1.add(i);
        for (int i : nums2) set2.add(i);
        for (int i : nums1) if (!set2.contains(i)) set2.add(i);
        for (int i : nums2) if (!set1.contains(i)) set1.add(i);
        List<Integer> list1 = new ArrayList<>();
        List<Integer> list2 = new ArrayList<>();
        for (int i : set1) list1.add(i);
        for (int i : set2) list2.add(i);
        res.add(list1);
        res.add(list2);
        return res;
    }

    
}