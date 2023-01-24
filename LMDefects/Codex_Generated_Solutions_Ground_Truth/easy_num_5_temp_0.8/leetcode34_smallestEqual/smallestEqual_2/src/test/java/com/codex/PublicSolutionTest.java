package com.codex;
import java.util.*;
import org.junit.Test;
import static com.codex.Solution.*;
import static org.junit.Assert.*;

public class PublicSolutionTest {


    @Test(timeout=500)
    public void test1(){
        int arr[] = {0,1,2};
        assertEquals(0, smallestEqual(arr));
    }

    @Test(timeout=500)
    public void test2(){
        int arr[] = {4,3,2,1};
        assertEquals(2, smallestEqual(arr));
    }

    @Test(timeout=500)
    public void test3(){
        int arr[] = {1,2,3,4,5,6,7,8,9,0};
        assertEquals(-1, smallestEqual(arr));
    }

}