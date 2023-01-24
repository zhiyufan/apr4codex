package com.codex;
import java.util.*;
import org.junit.Test;
import static com.codex.Solution.*;
import static org.junit.Assert.*;

public class PublicSolutionTest {


    @Test(timeout=500)
    public void test1(){
        int arr[] = {1,2,3,4};
        int arr2[][] = {
            {1,2},
            {3,4}
        };
        assertArrayEquals(arr2, construct2DArray(arr, 2, 2));
    }

    @Test(timeout=500)
    public void test2(){
        int arr[] = {1,2,3};
        int arr2[][] = {
            {1,2,3}
        };
        assertArrayEquals(arr2, construct2DArray(arr, 1, 3));
    }

    @Test(timeout=500)
    public void test3(){
        int arr[] = {1,2};
        int arr2[][] = new int[0][0];
        assertArrayEquals(arr2, construct2DArray(arr, 1, 1));
    }

}