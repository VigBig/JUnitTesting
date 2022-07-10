package com.bridgelabz.junittesting;

import junit.framework.TestCase;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class LoanMonthlyPaymentTest{

    @Test
    public void testPayment_100000Rs30Years8Rate() {
        double actual = LoanMonthlyPayment.payment(100000,30,8);
        assertEquals(666.57,actual,0.006);
    }

    @Test
    public void testPayment_6000Rs10Years2Rate() {
        double actual = LoanMonthlyPayment.payment(6000,10,2);
        assertEquals(9.18,actual,0.002);
    }

    @Test
    public void testPayment_50000Rs5Years5Rate() {
        double actual = LoanMonthlyPayment.payment(50000,5,5);
        assertEquals(207.55,actual,0.005);
    }
}