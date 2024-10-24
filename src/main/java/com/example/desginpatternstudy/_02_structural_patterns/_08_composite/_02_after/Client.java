package com.example.desginpatternstudy._02_structural_patterns._08_composite._02_after;

public class Client {
    public static void main(String[] args) {
        Item doranBlade = new Item("도란검", 450);
        Item healPotion = new Item("체력 물약", 50);

        Bag bag = new Bag();
        bag.add(doranBlade);
        bag.add(healPotion);

        Client client = new Client();
        client.printPrice(bag);
        client.printPrice(healPotion);
    }
    /**
     * 이제 클라이언트는 printPrice(Component com) 1개의 메소드만 가지면 된다.
     * 또한 구체적인 정보 또한 몰라도 된다.
     * 여기서 말하는 구체적인 정보는 가격을 구하는 방법이다.
     * before client 코드와 비교해 보자.
     */
    public void printPrice(Component component){
        System.out.println(component.getPrice());
    }
}
