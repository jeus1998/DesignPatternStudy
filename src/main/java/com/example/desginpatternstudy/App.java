package com.example.desginpatternstudy;

import java.io.*;
import java.lang.reflect.Constructor;

public class App {
    public static void main(String[] args) throws Exception{
        Settings settings1 = Settings.getInstance();

        // 직렬화 (try-with-resources)
        try (ObjectOutput out = new ObjectOutputStream(new FileOutputStream("settings.obj"))){
             out.writeObject(settings1);
        }
        Settings settings2 = null;
        // 역직렬화
        try (ObjectInput in = new ObjectInputStream(new FileInputStream("settings.obj"))){
             settings2 = (Settings) in.readObject();
        }
        System.out.println(settings1 != settings2); // true
    }
}
/*
리플렉션 활용하기
Settings settings1 = Settings.getInstance();
Constructor<Settings> constructor = Settings.class.getDeclaredConstructor();
constructor.setAccessible(true);
Settings settings2 = constructor.newInstance();
System.out.println(settings1 != settings2); // -> true
 */