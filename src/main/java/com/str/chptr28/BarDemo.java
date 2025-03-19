package com.str.chptr28;
import org.jetbrains.skia.TextBlob;

import java.util.concurrent.*;

public class BarDemo {
    public static void main(String[] args) {
        CyclicBarrier cb = new CyclicBarrier(3, new BarAction());

        System.out.println("Запуск потоков");

        new MyThread(cb, "A");
        new MyThread(cb, "B");
        new MyThread(cb, "C");
    }
}

// Поток исполнения, использующий барьер типа CyclicBarrier

class MyThread implements Runnable {
    CyclicBarrier cbar;
    String name;

    MyThread(CyclicBarrier c, String n) {
        cbar = c;

        name = n;
        new Thread(this).start();
    }

    @Override
    public void run() {
        System.out.println(name);
        try {
            cbar.await();
        } catch (BrokenBarrierException exc) {
            System.out.println(exc);
        } catch (InterruptedException exc) {
            System.out.println(exc);
        }
    }
}
// объект этого класса вызывается по достижению
// барьера типа CyclicBarrier

class BarAction implements Runnable {

    @Override
    public void run() {
        System.out.println("Барьер достин");
    }
}