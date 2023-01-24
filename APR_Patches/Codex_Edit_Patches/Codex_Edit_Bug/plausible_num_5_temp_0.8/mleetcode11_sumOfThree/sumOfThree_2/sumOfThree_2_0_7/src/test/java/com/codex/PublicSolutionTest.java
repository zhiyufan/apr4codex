package com.codex;
import java.util.*;
import org.junit.Test;
import static com.codex.Solution.*;
import static org.junit.Assert.*;

public class PublicSolutionTest {


    @Test(timeout=500)
    public void test1(){
        long arr[] = {10,11,12};
        assertArrayEquals(arr, sumOfThree(33));
    }

    @Test(timeout=500)
    public void test2(){
        long arr[] = {};
        assertArrayEquals(arr, sumOfThree(4));
    }

}