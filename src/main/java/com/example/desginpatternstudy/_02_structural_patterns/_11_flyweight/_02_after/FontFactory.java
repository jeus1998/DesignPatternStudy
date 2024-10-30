package com.example.desginpatternstudy._02_structural_patterns._11_flyweight._02_after;

import java.util.*;
public class FontFactory {
    private Map<String, Font> cache = new HashMap<>();
    public Font getFont(String font){
        if(cache.containsKey(font)){
            return cache.get(font);
        }
        String [] split = font.split(":");
        Font newFont = new Font(split[0], Integer.parseInt(split[1]));
        cache.put(font, newFont);
        return newFont;
    }
}
