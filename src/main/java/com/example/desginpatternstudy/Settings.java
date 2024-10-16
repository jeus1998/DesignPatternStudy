package com.example.desginpatternstudy;

public class Settings {
    private Settings () {}
    static class SettingsHolder{
        private static final Settings INSTANCE = new Settings();
    }
    public static Settings getInstance(){
        return SettingsHolder.INSTANCE;
    }
}
/*
static inner 클래스 활용
private Settings () {}
static class SettingsHolder {
    private static final Settings INSTANCE = new Settings();
}
public static Settings getInstance(){
    return SettingsHolder.INSTANCE;
}

double checked locking
private static volatile Settings instance;
private Settings () {}
public static Settings getInstance(){
    if(instance == null){
        synchronized (Settings.class){
            if(instance == null){
                instance = new Settings();
            }
        }
    }
    return instance;
}

synchronized 키워드 사용
public static synchronized Settings getInstance(){
    if(instance == null){
        instance = new Settings();
    }
    return instance;
}

eager initialization 사용
private static final Settings INSTANCE = new Settings();
public static Settings getInstance(){
    return INSTANCE;
}

 */