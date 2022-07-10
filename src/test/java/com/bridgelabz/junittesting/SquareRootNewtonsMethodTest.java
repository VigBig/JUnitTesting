package com.bridgelabz.junittesting;

import junit.framework.TestCase;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SquareRootNewtonsMethodTest {

    @Test
    public void testSqrt1() {
        double actual = SquareRootNewtonsMethod.sqrt(1.0);
        assertEquals(1.0, actual, 0);
    }

    @Test
    public void testSqrt0() {
        double actual = SquareRootNewtonsMethod.sqrt(0.0);
        assertEquals(0.0, actual, 0);
    }

    @Test
    public void testSqrt4() {
        double actual = SquareRootNewtonsMethod.sqrt(4.0);
        assertEquals(2.0, actual, 0);
    }

    @Test
    public void testSqrt9() {
        double actual = SquareRootNewtonsMethod.sqrt(9.0);
        assertEquals(3.0, actual, 0);
    }

    @Test
    public void testSqrt16() {
        double actual = SquareRootNewtonsMethod.sqrt(16.0);
        assertEquals(4.0, actual, 0);
    }

    @Test
    public void testSqrt2() {
        double actual = SquareRootNewtonsMethod.sqrt(2.0);
        assertEquals(1.414, actual, 0.00022);
    }

    @Test
    public void testSqrt5() {
        double actual = SquareRootNewtonsMethod.sqrt(5.0);
        assertEquals(2.236, actual, 0.00007);
    }

    @Test
    public void testSqrt7() {
        double actual = SquareRootNewtonsMethod.sqrt(7.0);
        assertEquals(2.645, actual, 0.0008);
    }
}