package com.fizzbuzz.engine;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DivisibleOrContainsFiveBuzzRuleTest {

    @Test
    public void assertPositiveDivisibleCase() {
        assertEquals("Buzz", new DivisibleOrContainsFiveBuzzRule(new DefaultValueRule()).apply(5));
    }

    @Test
    public void assertPositiveContainsCase() {
        assertEquals("Buzz", new DivisibleOrContainsFiveBuzzRule(new DefaultValueRule()).apply(52));
    }

    @Test
    public void assertNegativeCase() {
        assertEquals("3", new DivisibleOrContainsFiveBuzzRule(new DefaultValueRule()).apply(3));
    }

}
