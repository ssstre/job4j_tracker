package ru.job4j.pojo;

public class College {
    public static void main(String[] args) {
        Student student = new Student();
        student.setFullName("Lezhnev Andrey Alexsandrovich");
        student.setGroup("trainee");
        student.setDateOfReceipt("15.05.2020");
        System.out.println(student.getFullName() + System.lineSeparator() + student.getGroup() + System.lineSeparator() + student.getDateOfReceipt());
    }
}
