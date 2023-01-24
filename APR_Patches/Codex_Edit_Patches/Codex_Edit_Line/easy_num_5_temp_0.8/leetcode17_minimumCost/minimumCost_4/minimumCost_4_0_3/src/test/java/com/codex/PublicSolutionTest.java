package com.codex;
import java.util.*;
import org.junit.Test;
import static com.codex.Solution.*;
import static org.junit.Assert.*;

public class PublicSolutionTest {

    @Test(timeout=500)
    public void test1(){
        int arr[] = {1,2,3};
        assertEquals(minimumCost(arr), 5);
    }

    @Test(timeout=500)
    public void test2(){
        int arr[] = {6,5,7,9,2,2};
        assertEquals(minimumCost(arr), 23);
    }

    @Test(timeout=500)
    public void test3(){
        int arr[] = {5,5};
        assertEquals(minimumCost(arr), 10);
    }

}