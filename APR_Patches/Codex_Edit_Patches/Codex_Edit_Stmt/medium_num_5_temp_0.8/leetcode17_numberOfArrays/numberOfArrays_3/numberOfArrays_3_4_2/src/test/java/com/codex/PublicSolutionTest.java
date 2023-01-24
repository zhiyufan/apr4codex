package com.codex;
import java.util.*;
import org.junit.Test;
import static com.codex.Solution.*;
import static org.junit.Assert.*;

public class PublicSolutionTest {
    @Test(timeout=500)
    public void test1(){
        int arr[] = {1,-3,4};
        assertEquals(2, numberOfArrays(arr,1,6));
    }

    @Test(timeout=500)
    public void test2(){
        int arr[] = {3,-4,5,1,-2};
        assertEquals(4, numberOfArrays(arr,-4,5));
    }

    @Test(timeout=500)
    public void test3(){
        int arr[] = {4,-7,2};
        assertEquals(0, numberOfArrays(arr,3,6));
    }
}