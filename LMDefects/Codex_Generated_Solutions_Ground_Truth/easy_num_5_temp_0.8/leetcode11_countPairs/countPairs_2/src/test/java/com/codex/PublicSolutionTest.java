package com.codex;
import java.util.*;
import org.junit.Test;
import static com.codex.Solution.*;
import static org.junit.Assert.*;

public class PublicSolutionTest {

    @Test(timeout=500)
    public void test1(){
        int arr[] = {3,1,2,2,2,1,3};
        assertEquals(countPairs(arr, 2), 4);
    }

    @Test(timeout=500)
    public void test2(){
        int arr[] = {1,2,3,4};
        assertEquals(countPairs(arr, 1), 0);
    }

}