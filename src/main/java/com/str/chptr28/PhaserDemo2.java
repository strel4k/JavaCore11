package com.str.chptr28;
import java.util.concurrent.*;

//Расширить класс Phaser и переопределить метод onAdvance(), т.о. чтобы было выполнено определенное
//количество фаз
class MyPhaser extends Phaser {
    int numPhases;

    MyPhaser(int parties, int phaseCount) {
        super(parties);
        numPhases = phaseCount - 1;
    }
    //переопределить метод onAdvance() чтобы выполнить определенное количество фаз
    protected boolean onAdvance(int p, int regParties) {
        //следующий оператор println()требуется только для целей иллюстрации
        //Как правило, метод onAdvance() yt отображает выводимые данные
        System.out.println("Фаза " + p + " завершена.\n");

        //возвратить логическое значение true,
        //если все фазы завершены
        if (p == numPhases || regParties == 0) return true;

        // В противном случае возвратить логическое значение false
        return false;
    }
}
public class PhaserDemo2 {
    public static void main(String[] args) {
        MyPhaser phsr = new MyPhaser(1,4);
        System.out.println("Запуск потоков\n");

        new MyThread(phsr, "A");
        new MyThread(phsr, "B");
        new MyThread(phsr, "C");

        //ожидать завершени определенного количества фаз
        while (!phsr.isTerminated()) {
            phsr.arriveAndAwaitAdvance();
        }

        System.out.println("Синхронизатор фаз завершен");
    }
}

//поток исполнения исполяющий синхронизатор фаз типа Phaser
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
        while (!phsr.isTerminated()) {
            System.out.println("Поток " + name + " начинает фазу " + phsr.getPhase());
            phsr.arriveAndAwaitAdvance();

            // Небольшая пауза чтобы не нарушить порядок вывода
            // только для иллюстрации но необязательно для правильного
            //фунционирования синхронизатора фаз
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }
    }
}
