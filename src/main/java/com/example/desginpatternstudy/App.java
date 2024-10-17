package com.example.desginpatternstudy;

import java.io.*;
import java.lang.reflect.Constructor;
import java.util.Arrays;

public class App {
    public static void main(String[] args) throws Exception{
        Settings settings1 = Settings.INSTANCE;
        Settings settings2 = null;
        try (ObjectOutput out = new ObjectOutputStream(new FileOutputStream("settings.obj"))){
            out.writeObject(settings1);
        }
        try (ObjectInput in = new ObjectInputStream(new FileInputStream("settings.obj"))){
            settings2 = (Settings) in.readObject();
        }
        System.out.println(settings1 == settings2); // -> true
    }
}
/*
리플렉션에 안전 -> IllegalArgumentException: Cannot reflectively create enum objects
public class App {
    public static void main(String[] args) throws Exception{
        Settings settings1 = Settings.INSTANCE;
        Settings settings2 = null;
        Constructor<?>[] constructors = Settings.class.getDeclaredConstructors();
        for (Constructor<?> constructor : constructors) {
            constructor.setAccessible(true);
            settings2 = (Settings) constructor.newInstance("INSTANCE");
        }
    }
}
 */