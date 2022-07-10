package com.bridgelabz.junittesting;

import junit.framework.TestCase;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BinaryTest {

    @Test
    public void testToBinary106() {
        String actual = Binary.toBinary(106);
        assertEquals("1101010",actual);
    }

    @Test
    public void testToBinary10() {
        String actual = Binary.toBinary(10);
        assertEquals("1010",actual);
    }

    @Test
    public void testToBinary38() {
        String actual = Binary.toBinary(38);
        assertEquals("100110",actual);
    }

    @Test
    public void testSwapNibbles01101010() {
        String actual = Binary.swapNibbles("01101010");
        assertEquals("10100110",actual);
    }

    @Test
    public void testSwapNibbles01100100() {
        String actual = Binary.swapNibbles("01100100");
        assertEquals("01000110",actual);
    }

    @Test
    public void testSwapNibbles01000110() {
        String actual = Binary.swapNibbles("01000110");
        assertEquals("01100100",actual);
    }

    @Test
    public void testToDecimal1000110() {
        int actual = Binary.toDecimal(1000110);
        assertEquals(70,actual);
    }

    @Test
    public void testToDecimal10100110() {
        int actual = Binary.toDecimal(10100110);
        assertEquals(166,actual);
    }

    @Test
    public void testToDecimal1100010() {
        int actual = Binary.toDecimal(1100010);
        assertEquals(98,actual);
    }
}