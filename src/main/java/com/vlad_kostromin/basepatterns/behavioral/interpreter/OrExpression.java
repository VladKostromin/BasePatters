package main.java.com.vlad_kostromin.basepatterns.behavioral.interpreter;

import java.util.Map;

public class OrExpression implements Expression{
    private Expression expression1;
    private Expression expression2;

    public OrExpression(Expression expression1, Expression expression2) {
        this.expression1 = expression1;
        this.expression2 = expression2;
    }


    @Override
    public boolean interpret(Map<String, Integer> context) {
        return expression1.interpret(context) || expression2.interpret(context);
    }
}
