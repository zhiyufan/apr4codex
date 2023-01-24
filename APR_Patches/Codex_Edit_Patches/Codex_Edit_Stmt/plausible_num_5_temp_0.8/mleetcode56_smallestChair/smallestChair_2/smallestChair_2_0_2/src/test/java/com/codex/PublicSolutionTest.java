package com.codex;
import java.util.*;
import org.junit.Test;
import static com.codex.Solution.*;
import static org.junit.Assert.*;

public class PublicSolutionTest {
    @Test(timeout=500)
    public void test1(){
        int arr[][] = {
            {1,4},
            {2,3},
            {4,6}
        };
        assertEquals(1, smallestChair(arr, 1));
    }

    @Test(timeout=500)
    public void test2(){
        int arr[][] = {
            {3,10},
            {1,5},
            {2,6}
        };
        assertEquals(2, smallestChair(arr, 0));
    }

}