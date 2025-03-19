package com.str.chptr11;

//создать несколько потоков исполнения
class NewThreades implements Runnable {
    String name;    //имя потока
    Thread t;

    NewThreades(String threadname) {
        name = threadname;
        t = new Thread(this, name);
        System.out.println("Новый поток: " + t);
        t.start();  //запустить поток исполнения
    }

    // точка входа во второй поток исполнения
    @Override
    public void run() {
        try {
            for (int i = 5; i > 0; i--) {
                System.out.println(name + ": " + i);
                Thread.sleep(1000);
            }
        } catch (InterruptedException e) {
            System.out.println(name + "прерван");
        }
        System.out.println(name + " завершен");
    }
}

class MultiThreadDemo {
    public static void main(String[] args) {
        new NewThreades("Один");    //Запустить потоки на исполнение
        new NewThreades("Два");
        new NewThreades("Три");
        try {
            //ожидать завершения других потоков исполнения
                Thread.sleep(10000);
        } catch (InterruptedException e) {
            System.out.println("Главный потокк преран");
        }
        System.out.println("Главный поток завершен");
    }


}

