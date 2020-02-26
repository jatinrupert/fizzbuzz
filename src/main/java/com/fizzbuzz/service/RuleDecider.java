package com.fizzbuzz.service;

import com.fizzbuzz.engine.Rule;
import com.fizzbuzz.engine.ThreeFiveContainsAndDivisorRule;
import com.fizzbuzz.engine.ThreeFiveDivisorRule;

public enum RuleDecider {
    THREE_FIVE_DIVISOR(new ThreeFiveDivisorRule()), THREE_FIVE_CONTAINS_AND_DIVISOR(new ThreeFiveContainsAndDivisorRule());

    private Rule rule;

    RuleDecider(Rule rule) {
        this. rule = rule;
    }

    public Rule getRule() {
        return rule;
    }
}
