package com.codex;
import java.util.*;
import org.junit.Test;
import static com.codex.Solution.*;
import static org.junit.Assert.*;

public class PublicSolutionTest {


    @Test(timeout=500)
    public void test1(){
        String arr[] = {"--X","X++","X++"};
        assertEquals(1, finalValueAfterOperations(arr));
    }

    @Test(timeout=500)
    public void test2(){
        String arr[] = {"++X","++X","X++"};
        assertEquals(3, finalValueAfterOperations(arr));
    }

    @Test(timeout=500)
    public void test3(){
        String arr[] = {"X++","++X","--X","X--"};
        assertEquals(0, finalValueAfterOperations(arr));
    }

}