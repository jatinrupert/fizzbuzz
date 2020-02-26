package com.fizzbuzz.engine;

public class DivisibleByThreeAndFiveFizzBuzzRule implements Rule {

    private Rule followingRule;

    DivisibleByThreeAndFiveFizzBuzzRule(Rule followingRule) {
        this.followingRule = followingRule;
    }

    @Override
    public String apply(int value) {
        return value % 3 == 0 &&  value % 5 == 0 ? "FizzBuzz" : followingRule.apply(value);
    }
}
