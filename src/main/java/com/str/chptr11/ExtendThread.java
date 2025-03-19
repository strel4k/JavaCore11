package com.str.chptr11;

//создать второй поток исполнения
class NewThreads extends Thread {
    Thread t;

    NewThreads() {
        //создать новый, второй поток исполнения
        super("Демонстрационный поток");
        System.out.println("Дочерний поток создан: " + this);
        start();  //запустить поток исполнения
    }

    // точка входа во второй поток исполнения
    @Override
    public void run() {
        try {
            for (int i = 5; i > 0; i--) {
                System.out.println("Дочерний поток: " + i);
                Thread.sleep(500);
            }
        } catch (InterruptedException e) {
            System.out.println("Дочерний поток прерван");
        }
        System.out.println("Дочерний поток завершен");
    }
}

public class ExtendThread {
    public static void main(String[] args) {
        new NewThread();    //создать новый поток
        try {
            for (int i = 5; i > 0; i--) {
                System.out.println("Главный поток " + i);
                Thread.sleep(1000);
            }
        } catch (InterruptedException e) {
            System.out.println("Главный потокк преран");
        }
        System.out.println("Главный поток завершен");
    }
}

