package com.example.desginpatternstudy._03_behavioral_patterns._22_template._02_after;

public class Multiply extends FileProcessor{
    public Multiply(String path) {
        super(path);
    }
    @Override
    protected int getResult(int result, int value) {
        return result *= value;
    }
}
