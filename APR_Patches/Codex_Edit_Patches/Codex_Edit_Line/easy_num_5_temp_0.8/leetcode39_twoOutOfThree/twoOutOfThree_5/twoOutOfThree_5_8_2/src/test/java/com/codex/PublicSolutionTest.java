package com.codex;
import java.util.*;
import org.junit.Test;
import static com.codex.Solution.*;
import static org.junit.Assert.*;

public class PublicSolutionTest {


    @Test(timeout=500)
    public void test1(){
        int arr[] = {1,1,3,2};
        int arr2[] = {2,3};
        int arr3[] = {3};
        List<Integer> arr4 = new ArrayList<Integer>();
        arr4.add(3);
        arr4.add(2);
        assertEquals(arr4, twoOutOfThree(arr, arr2, arr3));
    }

    @Test(timeout=500)
    public void test2(){
        int arr[] = {3,1};
        int arr2[] = {2,3};
        int arr3[] = {1,2};
        List<Integer> arr4 = new ArrayList<Integer>();
        arr4.add(2);
        arr4.add(3);
        arr4.add(1);
        assertEquals(arr4, twoOutOfThree(arr, arr2, arr3));
    }

    @Test(timeout=500)
    public void test3(){
        int arr[] = {1,2,2};
        int arr2[] = {4,3,3};
        int arr3[] = {5};
        List<Integer> arr4 = new ArrayList<Integer>();
        assertEquals(arr4, twoOutOfThree(arr, arr2, arr3));
    }

}