package com.fizzbuzz.engine;

public class DivisibleByThreeFizzRule implements Rule {

    private Rule followingRule;

    DivisibleByThreeFizzRule(Rule followingRule) {
        this.followingRule = followingRule;
    }

    @Override
    public String apply(int value) {
        return value % 3 == 0 ? "Fizz" : followingRule.apply(value);
    }
}
