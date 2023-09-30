package main.java.com.vlad_kostromin.basepatterns.behavioral.interpreter;

import java.util.Map;

public class FieldExpression implements Expression{
    private String fieldName;
    private int fieldValue;

    public FieldExpression(String fieldName, int fieldValue) {
        this.fieldName = fieldName;
        this.fieldValue = fieldValue;
    }

    @Override
    public boolean interpret(Map<String, Integer> context) {
        return context.containsKey(fieldName) && context.get(fieldName) == fieldValue;
    }
}
