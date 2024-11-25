package com.example.desginpatternstudy._03_behavioral_patterns._22_template._02_after;
public class Plus extends FileProcessor{
    public Plus(String path) {
        super(path);
    }
    @Override
    protected int getResult(int result, int value) {
        return result += value;
    }
}
