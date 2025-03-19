package com.str.chptr28;
//простой пример реализации стратегии "разделяй и властвуй"
//в данном примере применяется класс RecursiveAction

import java.util.concurrent.*;
import java.util.*;

//класс forkJoinTask преобразует(через класс RecursiveAction)
//значения элементов массива типа double  в их квадтратные корни

class SqrtTransform extends RecursiveAction {

    /*
    В данном примере пороговое значение произвольно устанавливается равным 1000.
    В реальном коде его оптимальное значение может быть определенно в результате
    профилирования испольняющей системы или эксперементально
     */
    final int seqTreshold = 1000;

    //обрабатываемый массив
    double[] data;

    //определить часть обрабатываемых данных
    int start, end;

    SqrtTransform(double[] vals, int s, int e) {
        data = vals;
        start = s;
        end = e;
    }

    //этот метод выполняет параллельное вычисление
    @Override
    protected void compute() {
        //Если количество элементов маньше порогового значения
        //выполнить дальнейшую обработку последовательно
        if((end - start) < seqTreshold) {
            //преобразовать значение каждого элемента массива в к его квадр корень
            for (int i = start; i < end; i++) {
                data[i] = Math.sqrt(data[i]);
            }
        }
        else {
            //в противном случаепродолэить разделение данных на меньшие части

            //найти середину
            int middle = (start + end ) / 2;

            //запустить новые подзадачити на выполнение используя разделенные на части данные
            invokeAll(new SqrtTransform(data, start, middle),
                      new SqrtTransform(data, middle, end));
        }
    }
}
//продемонстрирова параллеьное выполение
public class ForkJoinDemo {
    public static void main(String[] args) {
        //создать пул задач
        ForkJoinPool fjp = new ForkJoinPool();

        double[] nums = new double[100_000];

        //присвоить некоторые значения
        for (int i = 0; i < nums.length; i++)
            nums[i] = (double) i;

        System.out.println("Часть исходной последовательности: ");

        for (int i = 0; i < 10; i++)
            System.out.print(nums[i] + " ");
        System.out.println("\n");

        SqrtTransform task = new SqrtTransform(nums, 0, nums.length);

        //запустить главную задачу типа ForkJoinTask на выполнение
        fjp.invoke(task);

        System.out.println("Часть преобразованной последовательности " + "(с точностью до четырех знаков после десяьтичной точки: ");

        for (int i = 0; i < 10; i++)
            System.out.format("%.4f ", nums[i]);
        System.out.println();


    }
}
