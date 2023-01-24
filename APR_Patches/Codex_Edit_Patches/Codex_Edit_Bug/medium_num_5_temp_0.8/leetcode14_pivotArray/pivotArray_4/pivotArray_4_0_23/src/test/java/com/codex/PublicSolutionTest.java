package com.codex;
import java.util.*;
import org.junit.Test;
import static com.codex.Solution.*;
import static org.junit.Assert.*;

public class PublicSolutionTest {


    @Test(timeout=500)
    public void test1(){
        int arr[] = {9,12,5,10,14,3,10};
        int arr2[] = {9,5,3,10,10,12,14};
        assertArrayEquals(arr2, pivotArray(arr, 10));
    }

    @Test(timeout=500)
    public void test2(){
        int arr[] = {-3,4,3,2};
        int arr2[] = {-3,2,4,3};
        assertArrayEquals(arr2, pivotArray(arr, 2));
    }

}