package com.example.desginpatternstudy._03_behavioral_patterns._22_template._01_before;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class MultiplyFileProcessor {
    private String path;
    public MultiplyFileProcessor(String path) {
        this.path = path;
    }
    public int process(){
        try(BufferedReader br = new BufferedReader(new FileReader(path))) {
            int result = 1;
            String line = null;
            while ((line = br.readLine()) != null) {
                result *= Integer.parseInt(line);
            }
            return result;
        }
        catch (IOException e){
            throw new IllegalArgumentException(path + "에 해당하는 파일이 없습니다.", e);
        }
    }
}
