package com.example.desginpatternstudy._02_structural_patterns._08_composite._02_after;

import java.util.ArrayList;
import java.util.List;

/*
항상 참조를 하더라도 Component 타입으로 한다.
 */
public class Bag implements Component{
    private List<Component> components = new ArrayList<>();
    public void add(Component component){
        components.add(component);
    }
    public List<Component> getComponents(){
        return this.components;
    }
    @Override
    public int getPrice() {
        return components.stream().mapToInt(Component::getPrice).sum();
    }
}
