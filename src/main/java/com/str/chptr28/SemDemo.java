package com.str.chptr28;
import java.util.concurrent.*;

public class SemDemo {
    public static void main(String[] args) {
        Semaphore sem = new Semaphore(1);

        new IncThread(sem, "A");
        new DecThread(sem, "B");
    }
}

    //Общий ресурс
    class Shared {
        static int count = 0;
    }

    //поток исполнения, увеличивающий значение счетчика на единицу
    class IncThread implements Runnable {
        String name;
        Semaphore sem;

        IncThread(Semaphore s, String n) {
            sem = s;
            name = n;
            new Thread(this).start();
        }

        @Override
        public void run() {
            System.out.println("Запуск потока " + name);
            try {
                //сначала получить разрешение
                System.out.println("Поток " + name + " ожидает разрешения.");
                sem.acquire();
                System.out.println("Поток " + name + " получает разрешения."); //а теперь получить доступ к общему ресурсу
                for (int i = 0; i < 5; i++) {
                    Shared.count++;
                    System.out.println(name + ": " + Shared.count);

                    //разрешить, если возможно переключение контекста
                    Thread.sleep(10);
                }
            } catch (InterruptedException exc) {
                System.out.println(exc);
            }

            //освободить разрешение
            System.out.println("Поток " + name + " освобождает разрешение");
            sem.release();
        }
    }

    //поток исполнения, уменьшающий значение счетчика на единицу
    class DecThread implements Runnable {
        String name;
        Semaphore sem;

        DecThread(Semaphore s, String n) {
            sem = s;
            name = n;
            new Thread(this).start();
        }

        @Override
        public void run() {
            System.out.println("Запуск потока " + name);
            try {
                // сначала получить разрешение
                System.out.println("Поток " + name + " ожидает разрешения");
                sem.acquire();
                System.out.println("Поток " + name + "получает разрешение");

                //а теперь получить доступ к общему ресурсу
                for (int i = 0; i < 5; i++) {
                    Shared.count--;
                    System.out.println(name + ": " + Shared.count);
                    //разрешить, если возможно, переключение контекста
                    Thread.sleep(10);

                }
            } catch (InterruptedException exc) {
                System.out.println(exc);
            }

            //освободить разрешение
            System.out.println("Поток" + name + " освобождает разрешение");
            sem.release();
        }
    }


