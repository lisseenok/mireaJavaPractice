package org.example.lesson3.task4;

public class Main {
    public static void main(String[] args) {
        Computer computer1 = new Computer("Test1", 200000);
        Computer computer2 = new Computer("Test2", 303403);
        Computer computer3 = new Computer("Test3", 4000);
        Computer computer4 = new Computer("Test4", 543);
        Computer computer5 = new Computer("Test5", 2006547000);

        Shop shop = new Shop();
        shop.addComputer(computer1);
        shop.addComputer(computer2);
        shop.addComputer(computer3);
        shop.addComputer(computer4);
        shop.addComputer(computer5);
        System.out.println(shop);
    }
}
