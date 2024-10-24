package com.example.desginpatternstudy._02_structural_patterns._08_composite._02_after;

import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * leaf
 */
@AllArgsConstructor
@Getter
public class Item implements Component{
    private String name;
    private int price;
    @Override
    public int getPrice() {
       return this.price;
    }
}
