package ru.job4j.oop;

public class Max {
    public  static int max(int first, int second) {
        return first >= second ? first : second;
    }

    public  static int max(int first, int second, int third) {
        int trm = max(first, second);
        return max(first, max(second, third));
    }

    public  static int max(int first, int second, int third, int fourth) {
        int trm = max(first, second, third);
        return max(fourth, max(first, max(second, third)));
    }
}
