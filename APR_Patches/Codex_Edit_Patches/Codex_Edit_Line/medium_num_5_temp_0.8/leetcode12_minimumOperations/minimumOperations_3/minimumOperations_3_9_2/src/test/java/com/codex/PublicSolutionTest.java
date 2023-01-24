package com.codex;
import java.util.*;
import org.junit.Test;
import static com.codex.Solution.*;
import static org.junit.Assert.*;

public class PublicSolutionTest {


    @Test(timeout=500)
    public void test1(){
        int arr[] = {3,1,3,2,4,3};
        assertEquals(3, minimumOperations(arr));
    }

    @Test(timeout=500)
    public void test2(){
        int arr[] = {1,2,2,2,2};
        assertEquals(2, minimumOperations(arr));
    }

}