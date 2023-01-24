package com.codex;
import java.util.*;
import org.junit.Test;
import static com.codex.Solution.*;
import static org.junit.Assert.*;

public class PublicSolutionTest {
    @Test(timeout=500)
    public void test1(){
        int arr[][] = {
            {1,3,2},
            {4,5,2},
            {2,4,3}
        };
        assertEquals(4, maxTwoEvents(arr));
    }

    @Test(timeout=500)
    public void test2(){
        int arr[][] = {
            {1,3,2},
            {4,5,2},
            {1,5,5}
        };
        assertEquals(5, maxTwoEvents(arr));
    }

    @Test(timeout=500)
    public void test3(){
        int arr[][] = {
            {1,5,3},
            {1,5,1},
            {6,6,5}
        };
        assertEquals(8, maxTwoEvents(arr));
    }
}