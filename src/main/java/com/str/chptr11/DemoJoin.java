package com.str.chptr11;

//Применить метод join() чтобы ожидать завершения потоков исполнения
class NewThreadess implements Runnable {
    String name;    //имя потока
    Thread t;

    NewThreadess(String threadname) {
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

class DemoJoin {
    public static void main(String[] args) {
        NewThreadess ob1 = new NewThreadess("Один");
        NewThreadess ob2 = new NewThreadess("Два");
        NewThreadess ob3 = new NewThreadess("Три");
        System.out.println("Поток Один запущен: " + ob1.t.isAlive());
        System.out.println("Поток Два запущен: " + ob2.t.isAlive());
        System.out.println("Поток Три запущен: " + ob3.t.isAlive());
        try {
            //ожидать завершения других потоков исполнения
            System.out.println("Ожидание завершения потоков.");
            ob1.t.join();
            ob2.t.join();
            ob3.t.join();
        } catch (InterruptedException e) {
            System.out.println("Главный потокк преран");
        }
        System.out.println("Поток Один запущен: " + ob1.t.isAlive());
        System.out.println("Поток Два запущен: " + ob2.t.isAlive());
        System.out.println("Поток Три запущен: " + ob3.t.isAlive());
        System.out.println("Главный поток завершен");
    }


}


