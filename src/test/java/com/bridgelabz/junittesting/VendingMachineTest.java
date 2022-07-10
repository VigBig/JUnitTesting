package com.bridgelabz.junittesting;

import junit.framework.TestCase;
import org.junit.Test;

public class VendingMachineTest extends TestCase {

    @Test
    public void testMinimumNumberOfNotes18() {
        int actual = VendingMachine.minimumNumberOfNotes(18);
        assertEquals(4,actual);
    }

    @Test
    public void testMinimumNumberOfNotes487() {
        int actual = VendingMachine.minimumNumberOfNotes(487);
        assertEquals(10,actual);
    }

    @Test
    public void testMinimumNumberOfNotes2952() {
        int actual = VendingMachine.minimumNumberOfNotes(2952);
        assertEquals(9,actual);
    }
}