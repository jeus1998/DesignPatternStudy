package com.example.desginpatternstudy;

public class SingleTon{
	private SingleTon () {}
    static class SingleTonHolder{
    	private static final SingleTon INSTANCE = new SingleTon();
    }
	public static SingleTon getInstance(){
    	return SingleTonHolder.INSTANCE;
    }
}