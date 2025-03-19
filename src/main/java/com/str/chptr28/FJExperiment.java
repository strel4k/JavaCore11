package com.str.chptr28;
import java.util.concurrent.*;

//Класс ForkJoinTask преобразует(через класс RecursiveAction)
//элементы массива типа double

class Transform extends RecursiveAction {

    //порог последовательного выполнения устанавливаемый конструктором
    int seqTreshold;

    //обрабатываемый массив
    double[] data;

    //определеить часть обрабаываемых данных
    int start, end;

    Transform(double[] vals, int s, int e, int t) {
        data = vals;
        start = s;
        end = e;
        seqTreshold = t;
    }
    //Метод выполняет параллеьное вычисление
    @Override
    protected void compute() {
        //выполнить далее обработку последовательно если количество элементов ниже порогового значения
        if ((end - start) < seqTreshold) {
            //в следующем фрагменте кода жлементу по четному индексу присваивается квадратный корень
            // его пероначальнного значение а элементу по нечетному индеку - кубиеский корено его
            // первоначального значения.
            //Этот код преназначен только для потребления времени ЦП, чтобы сделать нагляднее эфект от параллеьного выполнения
            for (int i = start; i < end; i++) {
                if ((data[i] % 2) == 0)
                    data[i] = Math.sqrt(data[i]);
                else
                    data[i] = Math.cbrt(data[i]);
            }
        } else {
            //в противном случае продолжить раздедение данных на меньшие части

            //найти середину
            int middle = (start + end) / 2;

            //запустить новые подзалачи на выполнение используя разделенные на части данные
            invokeAll(new Transform(data, start, middle, seqTreshold),
                      new Transform(data, middle, end, seqTreshold));
        }
    }
}
//продемонстрировать параллеьное выполнение
public class FJExperiment {
    public static void main(String[] args) {
        int pLevel;
        int threshold;

        if (args.length != 2) {
            System.out.println("Использование: FJExperiment параллелизм порог ");
            return;
        }

        pLevel = Integer.parseInt(args[0]);
        threshold = Integer.parseInt(args[1]);

        //Эти переменные испольуются для изерения времени выполнения задачи
        long beginT, endT;

        //создать пул задач. обратите внимание на установку уровня параллелилизма
        ForkJoinPool fjp = new ForkJoinPool(pLevel);

        double[] nums = new double[1_000_000];

        for (int i = 0; i < nums.length; i++)
            nums[i] = (double) i;

        Transform task = new Transform(nums, 0, nums.length, threshold);

        //начать измерение времени выполнения задачи
        beginT = System.nanoTime();

        //запустить главную задачу типа ForkJoinTask
        fjp.invoke(task);

        //заверщить измерение времени выполнения задачи
        endT = System.nanoTime();

        System.out.println("Уровень параллелизма: " + pLevel);
        System.out.println("Порог последовательной обработки: " + threshold);
        System.out.println("Истекшее время: " + (endT - beginT) + " нс");
        System.out.println();

    }
}
