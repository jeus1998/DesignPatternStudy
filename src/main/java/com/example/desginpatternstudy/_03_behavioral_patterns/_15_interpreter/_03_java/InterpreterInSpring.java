package com.example.desginpatternstudy._03_behavioral_patterns._15_interpreter._03_java;

import lombok.Getter;
import lombok.Setter;
import org.springframework.expression.Expression;
import org.springframework.expression.spel.standard.SpelExpressionParser;

/**
 * SpEL (스프링 Expression Language)
 */
public class InterpreterInSpring {
    @Setter @Getter
    static class Book{
        private String title;
    }
    public static void main(String[] args) {
        Book book = new Book();
        book.setTitle("spring");

        SpelExpressionParser parser = new SpelExpressionParser();
        Expression expression = parser.parseExpression("title");
        System.out.println(expression.getValue(book));
    }
}
