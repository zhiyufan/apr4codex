package com.codex;
import java.util.*;
import org.junit.Test;
import static com.codex.Solution.*;
import static org.junit.Assert.*;

public class PublicSolutionTest {


    @Test(timeout=500)
    public void test1(){
        int arr[] = {2,3,-1,8,4};
        assertEquals(3, findMiddleIndex(arr));
    }

    @Test(timeout=500)
    public void test2(){
        int arr[] = {1,-1,4};
        assertEquals(2, findMiddleIndex(arr));
    }

    @Test(timeout=500)
    public void test3(){
        int arr[] = {2,5};
        assertEquals(-1, findMiddleIndex(arr));
    }

}