package com.example.desginpatternstudy._01_creational_patterns._02_factory_method._02_after;

public interface ShipFactory {
    default Ship orderShip(String name, String email){
        validate(name, email);
        prepareFor(name);
        Ship ship = createShip(name); // coloring & naming 특정 배를 만드는 공정
        sendEmailTo(email, ship);
        return ship;
    }
    Ship createShip(String name); // 하위 클래스에 생성을 위임
    private static void sendEmailTo(String email, Ship ship) {
        System.out.println(email + " send message: " + ship.getName() + " 다 만들었습니다.");
    }
    private void prepareFor(String name){
        System.out.println(name + " 만들 준비 중");
    }
    private void validate(String name, String email){
        if(name == null || name.isBlank()){
            throw new IllegalArgumentException("배 이름을 지어주세요.");
        }
        if(email == null || email.isBlank()){
            throw new IllegalArgumentException("연락처를 남겨주세요.");
        }
    }
}
