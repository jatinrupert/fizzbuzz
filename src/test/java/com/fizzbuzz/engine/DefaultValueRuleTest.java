package com.fizzbuzz.engine;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class DefaultValueRuleTest {

    @Test
    public void assertPositiveCase() {
        assertEquals("3", new DefaultValueRule().apply(3));
    }

}
