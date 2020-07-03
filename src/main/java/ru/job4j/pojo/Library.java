package ru.job4j.pojo;

public class Library {
    public static void main(String[] args) {
        Book avto = new Book("Avto", 200);
        Book moto = new Book("Moto", 300);
        Book gidro = new Book("Gidro", 250);
        Book cleanCode = new Book("Clean Code", 350);
        Book[] books = new Book[4];
        books[0] = avto;
        books[1] = moto;
        books[2] = gidro;
        books[3] = cleanCode;
        for (int i = 0; i < books.length; i++) {
            Book b = books[i];
            System.out.println(b.getName() + " - " + b.getPages());
        }
        books[0] = cleanCode;
        books[3] = avto;
        for (int i = 0; i < books.length; i++) {
            Book b = books[i];
            System.out.println(b.getName() + " - " + b.getPages());
        }
        for (int i = 0; i < books.length; i++) {
            Book b = books[i];
            if (b.getName() == "Clean Code") {
                System.out.println(b.getName() + " - " + b.getPages());
            }
        }
    }
}
