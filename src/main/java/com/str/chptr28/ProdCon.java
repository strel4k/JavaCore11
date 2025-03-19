package com.str.chptr28;
import java.util.concurrent.Semaphore;

//реализация поствщика и потребителя, исползующая
//семафоры для управления синхронизацией

class Q {
    int n;

    //начать с недоступного семафора
    static Semaphore semCon = new Semaphore(0);
    static Semaphore semProd = new Semaphore(1);

    void get() {
        try {
            semCon.acquire();
        } catch (InterruptedException e) {
            System.out.println("Перехвачено исключение типа  InterruptedException");
        }
        System.out.println("Получено: " + n);
        semProd.release();
    }
    void put(int n) {
        try {
            semProd.acquire();
        } catch (InterruptedException e) {
            System.out.println("Перехвачено исключение типа InterruptedException");
        }
        this.n = n;
        System.out.println("Перехвачено исключение типа InterruptedException " + n);
        semCon.release();
    }
}

class Producer implements Runnable {
    Q q;
    Producer(Q q) {
        this.q = q;
        new Thread(this, "Producer").start();
    }

    @Override
    public void run() {
        for (int i = 0; i < 20; i++) q.put(i);
    }
}

class Consumer implements Runnable {
    Q q;
    Consumer(Q q) {
        this.q = q;
        new Thread(this, "Consumer").start();
    }
    @Override
    public void run() {
        for (int i = 0; i < 20; i++) q.get();
    }
}

public class ProdCon {
    public static void main(String[] args) {
        Q q = new Q();
        new Consumer(q);
        new Producer(q);
    }
}
