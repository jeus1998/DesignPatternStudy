package com.example.desginpatternstudy._02_structural_patterns._07_bridge._02_after;
public class DefaultChampion implements Champion{
    private Skin skin;
    private String name; // 챔피언 이름
    public DefaultChampion(Skin skin, String name) {
        this.skin = skin;
        this.name = name;
    }
    @Override
    public void move() {
        System.out.printf("%s %s move\n", skin.getName(), this.name);
    }
    @Override
    public void Q() {
        System.out.printf("%s %s Q\n", skin.getName(), this.name);
    }
    @Override
    public void W() {
        System.out.printf("%s %s W\n", skin.getName(), this.name);
    }
    @Override
    public void E() {
        System.out.printf("%s %s E\n", skin.getName(), this.name);
    }
    @Override
    public void R() {
        System.out.printf("%s %s R\n", skin.getName(), this.name);
    }
}
