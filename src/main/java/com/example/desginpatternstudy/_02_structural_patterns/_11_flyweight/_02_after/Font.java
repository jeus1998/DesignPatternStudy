package com.example.desginpatternstudy._02_structural_patterns._11_flyweight._02_after;

import lombok.Getter;
import lombok.RequiredArgsConstructor;


/**
 * 재사용하는 객체는 불변 객체여야 한다.
 * 만약 재사용하는 객체가 변경이 가능하면 해당 객체를 사용하는 모든곳에서 변경이 일어난다.
 * 그러니 final 키워드를 모든 필드에 붙여서 객체를 변경 불가능하게 만들자
 */
@RequiredArgsConstructor @Getter
public class Font {
    private final String family;
    private final int size;
}
