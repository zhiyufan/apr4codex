package com.codex;
import java.util.*;
import org.junit.Test;
import static com.codex.Solution.*;
import static org.junit.Assert.*;

public class PublicSolutionTest {
    @Test(timeout=500)
    public void test1(){
        int arr[] = {3,2,4,3};
        int arr2[] = {6,6};
        assertArrayEquals(arr2, missingRolls(arr, 4, 2));
    }

    @Test(timeout=500)
    public void test2(){
        int arr[] = {1,5,6};
        int arr2[] = {2,3,2,2};
        assertArrayEquals(arr2, missingRolls(arr, 3, 4));
    }

    @Test(timeout=500)
    public void test3(){
        int arr[] = {1,2,3,4};
        int arr2[] = {};
        assertArrayEquals(arr2, missingRolls(arr, 6, 4));
    }
}