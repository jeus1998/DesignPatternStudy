package com.example.desginpatternstudy._02_structural_patterns._08_composite._01_before;
public class Client {
    public static void main(String[] args) {
        Item doranBlade = new Item("도란검", 450);
        Item healPotion = new Item("체력 물약", 50);

        Bag bag = new Bag();
        bag.add(doranBlade);
        bag.add(healPotion);

        Client client = new Client();
        client.printPrice(doranBlade);
        client.printPrice(bag);

    }
    private void printPrice(Item item) {
        System.out.println(item.getPrice());
    }
    private void printPrice(Bag bag){
        System.out.println(bag.getItems().stream().mapToInt(Item::getPrice).sum());
        /* 스트림 연습
        // 가방에 들어있는 아이템 출력하기
        bag.getItems().stream().forEach(i -> System.out.println(i.getPrice()));

        // 아이템 개수
        long count = bag.getItems().stream().count();
        System.out.println(count);

        // 아이템 합산
        int sum = bag.getItems().stream().mapToInt(Item::getPrice).sum();
        System.out.println(sum);

        // reduce 활용하기
        Optional<Integer> reduce = bag.getItems().stream().map(Item::getPrice).reduce(Integer::sum);
        System.out.println(reduce.get());
         */
    }
}
