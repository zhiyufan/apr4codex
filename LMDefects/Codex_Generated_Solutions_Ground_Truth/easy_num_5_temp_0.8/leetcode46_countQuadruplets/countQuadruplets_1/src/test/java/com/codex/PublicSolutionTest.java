package com.codex;
import java.util.*;
import org.junit.Test;
import static com.codex.Solution.*;
import static org.junit.Assert.*;

public class PublicSolutionTest {


    @Test(timeout=500)
    public void test1(){
        int arr[] = {1,2,3,6};
        assertEquals(1, countQuadruplets(arr));
    }

    @Test(timeout=500)
    public void test2(){
        int arr[] = {3,3,6,4,5};
        assertEquals(0, countQuadruplets(arr));
    }

    @Test(timeout=500)
    public void test3(){
        int arr[] = {1,1,1,3,5};
        assertEquals(4, countQuadruplets(arr));
    }

}