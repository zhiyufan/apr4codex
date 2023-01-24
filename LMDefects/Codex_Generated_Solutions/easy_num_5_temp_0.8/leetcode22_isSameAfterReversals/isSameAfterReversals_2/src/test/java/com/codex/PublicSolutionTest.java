package com.codex;
import java.util.*;
import org.junit.Test;
import static com.codex.Solution.*;
import static org.junit.Assert.*;

public class PublicSolutionTest {


    @Test(timeout=500)
    public void test1(){
        assertTrue(isSameAfterReversals(526));
    }

    @Test(timeout=500)
    public void test2(){
        assertFalse(isSameAfterReversals(1800));
    }

    @Test(timeout=500)
    public void test3(){
        assertTrue(isSameAfterReversals(0));
    }

}