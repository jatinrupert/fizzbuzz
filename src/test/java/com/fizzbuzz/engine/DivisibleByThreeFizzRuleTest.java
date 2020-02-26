package com.fizzbuzz.engine;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DivisibleByThreeFizzRuleTest {

    @Test
    public void assertPositiveCase() {
        assertEquals("Fizz", new DivisibleByThreeFizzRule(new DefaultValueRule()).apply(3));
    }

    @Test
    public void assertNegativeCase() {
        assertEquals("5", new DivisibleByThreeFizzRule(new DefaultValueRule()).apply(5));
    }

}
