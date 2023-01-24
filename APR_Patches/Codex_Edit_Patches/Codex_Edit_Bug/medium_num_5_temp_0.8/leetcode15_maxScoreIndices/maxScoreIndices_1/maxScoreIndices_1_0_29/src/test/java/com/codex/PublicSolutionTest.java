package com.codex;
import java.util.*;
import org.junit.Test;
import static com.codex.Solution.*;
import static org.junit.Assert.*;

public class PublicSolutionTest {


    @Test(timeout=500)
    public void test1(){
        int arr[] = {0,0,1,0};
        List l1 = Arrays.asList(2, 4);
        assertEquals(l1, maxScoreIndices(arr));
    }

    @Test(timeout=500)
    public void test2(){
        int arr[] = {0,0,0};
        List l1 = Arrays.asList(3);
        assertEquals(l1, maxScoreIndices(arr));
    }

    @Test(timeout=500)
    public void test3(){
        int arr[] = {1,1};
        List l1 = Arrays.asList(0);
        assertEquals(l1, maxScoreIndices(arr));
    }

}