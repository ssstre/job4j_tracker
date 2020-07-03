package ru.job4j.oop;

public class Config {
    private String name;
    private int position;
    private String[] properties;

    public Config(String name) {
        this.name = name;
    }

    void print() {
        this.position = position;
        System.out.println(position);
    }

   public String getProperty(String key) {
        return search(key);
    }

   private String search(String key) {
        return key;
    }
}
