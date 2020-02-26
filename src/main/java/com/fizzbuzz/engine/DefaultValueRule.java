package com.fizzbuzz.engine;

public class DefaultValueRule implements Rule {

    @Override
    public String apply(int value) {
        return String.valueOf(value);
    }
}
