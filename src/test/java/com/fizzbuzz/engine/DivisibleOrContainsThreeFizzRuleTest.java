package com.fizzbuzz.engine;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DivisibleOrContainsThreeFizzRuleTest {

    @Test
    public void assertPositiveDivisibleCase() {
        assertEquals("Fizz", new DivisibleOrContainsThreeFizzRule(new DefaultValueRule()).apply(3));
    }

    @Test
    public void assertPositiveContainsCase() {
        assertEquals("Fizz", new DivisibleOrContainsThreeFizzRule(new DefaultValueRule()).apply(13));
    }

    @Test
    public void assertNegativeCase() {
        assertEquals("5", new DivisibleOrContainsThreeFizzRule(new DefaultValueRule()).apply(5));
    }

}
