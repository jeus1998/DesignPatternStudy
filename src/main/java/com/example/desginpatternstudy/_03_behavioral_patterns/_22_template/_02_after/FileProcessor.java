package com.example.desginpatternstudy._03_behavioral_patterns._22_template._02_after;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public abstract class FileProcessor {
    private String path;
    public FileProcessor(String path) {
        this.path = path;
    }
    public final int process(int init){
        try(BufferedReader br = new BufferedReader(new FileReader(path))) {
            int result = init;
            String line = null;
            while ((line = br.readLine()) != null){
                result = getResult(result, Integer.parseInt(line));
            }
            return result;
        }
        catch (IOException e){
            throw new IllegalArgumentException(path + "에 해당하는 파일이 없습니다.", e);
        }
    }
    protected abstract int getResult(int result, int value);
}
