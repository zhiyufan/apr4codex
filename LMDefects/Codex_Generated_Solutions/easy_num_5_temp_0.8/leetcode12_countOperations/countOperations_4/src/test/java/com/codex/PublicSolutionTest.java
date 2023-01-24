package com.codex;
import java.util.*;
import org.junit.Test;
import static com.codex.Solution.*;
import static org.junit.Assert.*;

public class PublicSolutionTest {

    @Test(timeout=500)
    public void test1(){
        assertEquals(countOperations(2, 3), 3);
    }

    @Test(timeout=500)
    public void test2(){
        assertEquals(countOperations(10, 10), 1);
    }

}