package com.str.chptr28;
import java.util.concurrent.*;

public class PhaserDemo {
    public static void main(String[] args) {
        Phaser phsr = new Phaser(1);
        int curPhase;

        System.out.println("запуск потоков");

        new MyThread(phsr, "A");
        new MyThread(phsr, "B");
        new MyThread(phsr, "C");

        //ожидать заверщения всеи потоками исполнения первой фазы
        curPhase = phsr.getPhase();
        phsr.arriveAndAwaitAdvance();
        System.out.println("Фаза " + curPhase + " завершена");

        //ожидать завершения всеми потоками исполнения второй фазы
        curPhase = phsr.getPhase();
        phsr.arriveAndAwaitAdvance();
        System.out.println("Фаза " + curPhase + "завершена");

        curPhase = phsr.getPhase();
        phsr.arriveAndAwaitAdvance();
        System.out.println("Фаза " + curPhase + " завершена");

        //снять основной поток исполнения с регистрации
        phsr.arriveAndDeregister();

        if(phsr.isTerminated())
            System.out.println("Синхронизаттор фаз завершен");
    }
}

// поток исполнения, используюзий синхронизатор фаз типа Phaser
class MyThread implements Runnable {
    Phaser phsr;
    String name;

    MyThread(Phaser p, String n) {
        phsr = p;
        name = n;
        phsr.register();
        new Thread(this).start();
    }
    @Override
    public void run() {
        System.out.println("Поток " + name + " начинает первую фазу");
        phsr.arriveAndAwaitAdvance();   //известить о достижении фазы

        //Небольшая пауза чтобы не нарушить порядок ввода
        //Только для иллюстрации, но необязательно правильного
        //функционирования синхронизатора фаз

        try {
            Thread.sleep(10);
        } catch (InterruptedException e) {
            System.out.println(e);
        }
        System.out.println("поток " + name + "  начинает вторую фазу");
        phsr.arriveAndAwaitAdvance();       //изввестить о достижении фазы

        //небольшая пауза чтобы не нарушить порядок вывода
        //только для иллюстрации, но необязательно для правильного
        //функционирования синхронизатора фаз
        try {
            Thread.sleep(10);
        } catch (InterruptedException e) {
            System.out.println(e);
        }

        System.out.println("Поток " + name + " начинает тертю фазу");

        phsr.arriveAndDeregister();         //известить о достижении фазы снять потоки с регистрации
    }
}