package ru.job4j.oop;

public class Item {
    private String id;
    private String name;

    public Item() {
    }
    public Item(String id) {
        id = this.id;
    }

    public Item(String id, String name) {
        this.id = id;
        this.name = name;
    }
    public static void main(String[] args) {
        Item item = new Item();
    }
}
