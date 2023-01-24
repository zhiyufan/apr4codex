package com.codex;

import java.util.*;

public class Solution {
// git fetch
// git reset --hard origin/master
// git clean -fd
// git pull
// git push

// mvn clean test -Dtest=FileTest

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.*;
import java.util.stream.Collectors;

import org.junit.jupiter.api.Test;

public class FileTest {
    @Test
    public void testCase1() {
        assertEquals(File.twoOutOfThree(new int[] { 1, 2, 3 }, new int[] { 2, 3, 4 }, new int[] { 1, 2, 3, 4 }),
                Arrays.asList(2, 3));
    }

    @Test
    public void testCase2() {
        assertEquals(
                File.twoOutOfThree(new int[] { 1, 2, 3 }, new int[] { 2, 3, 4 }, new int[] { 1, 2, 3, 4, 5, 6, 7, 8, 9 }),
                Arrays.asList(2, 3));
    }

    @Test
    public void testCase3() {
        assertEquals(File.twoOutOfThree(new int[] { 1, 1, 2, 2, 3, 3, 4, 4 }, new int[] { 3, 3, 4, 4, 5, 5, 6, 6 },
                new int[] { 1, 1, 2, 2, 3, 3, 4, 4, 5, 5, 6, 6 }), Arrays.asList(3, 4));
    }

    @Test
    public void testCase4() {
        assertEquals(File.twoOutOfThree(new int[] { 1, 1, 2 }, new int[] { 1, 1, 2 }, new int[] { 1, 1, 2 }),
                Arrays.asList(1, 2));
    }

    @Test
    public void testCase5() {
        assertEquals(File.twoOutOfThree(new int[] { 1, 2, 3, 4 }, new int[] { 5, 6, 7, 8 }, new int[] { 9, 10, 11, 12 }),
                Arrays.asList());
    }

    public static class File {
        public static List<Integer> twoOutOfThree(int[] nums1, int[] nums2, int[] nums3) {
            Set<Integer> hm1 = new HashSet<>();
            List<Integer> list = new LinkedList<>();
            for (int n : nums1) {
                hm1.add(n);
            }

        Set<Integer> hm2 = new HashSet<>();
        for(int n : nums2){
            if(hm1.contains(n) && !list.contains(n)){
                list.add(n);
            }

            if(hm2.contains(n)){
                hm2.remove(n);
                list.add(n);
            } else {
                hm2.add(n);
            }
        }

        for(int n : nums3){
            if(hm1.contains(n) && !list.contains(n)){
                list.add(n);
            }
            if(hm2.contains(n) && !list.contains(n)){
                list.add(n);
            }
        }
        return list;
    }

    
}