package com.fizzbuzz.engine;

public class DivisibleByFiveBuzzRule implements Rule {

    private Rule followingRule;

    DivisibleByFiveBuzzRule(Rule followingRule) {
        this.followingRule = followingRule;
    }

    @Override
    public String apply(int value) {
        return value % 5 == 0 ? "Buzz" : followingRule.apply(value);
    }
}
