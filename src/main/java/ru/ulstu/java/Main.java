package ru.ulstu.java;

public class Main {

    public static void main(String[] args) {
        final Friend f1 = new Friend("Иван");
        final Friend f2 = new Friend("Андрей");
        // лямбда выражение для сокращенной формы создания класса - потока
        new Thread(() -> {
            f1.bow(f2);
        }).start();
        // лямбда выражение для сокращенной формы создания класса - потока
        new Thread(() -> {
            f2.bow(f1);
        }).start();
    }
}
