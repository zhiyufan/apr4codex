package com.codex;
import java.util.*;
import org.junit.Test;
import static com.codex.Solution.*;
import static org.junit.Assert.*;

public class PublicSolutionTest {


    @Test(timeout=500)
    public void test1(){
        int arr[] = {3,1,5};
        int arr2[] = {2,7,4};
        assertEquals(4, minMovesToSeat(arr, arr2));
    }

    @Test(timeout=500)
    public void test2(){
        int arr[] = {4,1,5,9};
        int arr2[] = {1,3,2,6};
        assertEquals(7, minMovesToSeat(arr, arr2));
    }

    @Test(timeout=500)
    public void test3(){
        int arr[] = {2,2,6,6};
        int arr2[] = {1,3,2,6};
        assertEquals(4, minMovesToSeat(arr, arr2));
    }

}