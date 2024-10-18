package com.example.desginpatternstudy._01_creational_patterns._02_factory_method._01_before;

public class ShipFactory {
    public static Ship orderShip(String name, String email){
        // validate
        if(name == null || name.isBlank()){
            throw new IllegalArgumentException("배 이름을 지어주세요.");
        }
        if(email == null || email.isBlank()){
            throw new IllegalArgumentException("연락처를 남겨주세요.");
        }
        prepareFor(name);

        Ship ship = new Ship();
        ship.setName(name);
        coloring(ship, name);
        sendEmailTo(email, ship);
        return ship;
    }
    private static void sendEmailTo(String email, Ship ship) {
        System.out.println(email + " send message: " + ship.getName() + " 다 만들었습니다.");
    }
    private static void prepareFor(String name) {
        System.out.println(name + " 만들 준비 중");
    }
    private static void coloring(Ship ship, String name){
        if(name.equalsIgnoreCase("whiteShip")){
            ship.setColor("white");
        }
        else if(name.equalsIgnoreCase("blackShip")){
            ship.setColor("black");
        }
    }
}
