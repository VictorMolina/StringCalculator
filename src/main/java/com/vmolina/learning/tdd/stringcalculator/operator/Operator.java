package com.vmolina.learning.tdd.stringcalculator.operator;

import com.vmolina.learning.tdd.stringcalculator.operation.*;

public enum Operator {
    ADD("+", new AddOperation()),
    SUBSTRACT("-", new SubstractOperation()),
    MULTIPLY("*", new MultiplyOperation()),
    NOOP("", new NoOperation());

    public static Operator get(String code) {
        for (Operator operator : Operator.values()) {
            if (operator.getCode().equals(code)) {
                return operator;
            }
        }
        return NOOP;
    }

    String code;
    Operation operation;

    Operator(String code, Operation operation) {
        this.code = code;
        this.operation = operation;
    }

    public String getCode() {
        return code;
    }

    public String getRegExpCode() {
        return "\\" + code;
    }

    public long apply(long param1, long param2) {
        return operation.execute(param1, param2);
    }
}
