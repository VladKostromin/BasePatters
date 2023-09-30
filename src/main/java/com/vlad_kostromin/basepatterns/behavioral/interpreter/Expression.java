package main.java.com.vlad_kostromin.basepatterns.behavioral.interpreter;

import java.util.Map;

public interface Expression {
    boolean interpret(Map<String, Integer> context);
}
