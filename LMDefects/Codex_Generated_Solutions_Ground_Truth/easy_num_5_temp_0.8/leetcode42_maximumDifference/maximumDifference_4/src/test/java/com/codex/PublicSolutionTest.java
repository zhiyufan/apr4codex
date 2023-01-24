package com.codex;
import java.util.*;
import org.junit.Test;
import static com.codex.Solution.*;
import static org.junit.Assert.*;

public class PublicSolutionTest {


    @Test(timeout=500)
    public void test1(){
        int arr[] = {7,1,5,4};
        assertEquals(4, maximumDifference(arr));
    }

    @Test(timeout=500)
    public void test2(){
        int arr[] = {9,4,3,2};
        assertEquals(-1, maximumDifference(arr));
    }

    @Test(timeout=500)
    public void test3(){
        int arr[] = {1,5,2,10};
        assertEquals(9, maximumDifference(arr));
    }

}