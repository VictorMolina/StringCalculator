package com.vmolina.learning.tdd.stringcalculator.operation;

public class NoOperation implements Operation {
    @Override
    public long execute(long param1, long param2) {
        return param2;
    }
}
