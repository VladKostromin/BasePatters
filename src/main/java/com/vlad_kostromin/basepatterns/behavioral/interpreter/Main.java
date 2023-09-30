package main.java.com.vlad_kostromin.basepatterns.behavioral.interpreter;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Map<String, Integer> context = new HashMap<>();
        context.put("salary", 10000);
        context.put("iq", 180);

        Expression expression1 = new FieldExpression("salary", 10000);
        Expression expression2 = new FieldExpression("iq", 180);

        Expression andExpr = new AndExpression(expression1, expression2);

        Expression orExpr = new OrExpression(expression1, expression2);
        System.out.println("Query 'and' result: " + andExpr.interpret(context));
        System.out.println("Query 'or' result: " + orExpr.interpret(context));
    }
}
