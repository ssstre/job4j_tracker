package ru.job4j.oop;

public class User {
        private String name;  // name - поле объекта
        private int age;  // age поле обьекта

        public boolean canDrive() {
            boolean can = false;  // can - локальная переменная т.к присваивается в методе
            if (age >= 18) {
                can = true;
            }
            return can;
        }
}
