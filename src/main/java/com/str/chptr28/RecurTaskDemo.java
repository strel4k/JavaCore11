package com.str.chptr28;
import java.util.concurrent.*;

//Класс RecursiveTask используемый для вычисленя суммы значений элементов в массиве типа double
class Sum extends RecursiveTask<Double> {
    //пороговое значение последовательноно выполнения
    final int seqThresHold = 500;

    //обрабатываемый массив
    double[] data;

    //определить чать обрабатываемых данных
    int start, end;

    Sum(double[] vals, int s, int e) {
        data = vals;
        start = s;
        end = e;
    }

    //определить сумму значений элементов в массиве типа double
    @Override
    protected Double compute() {
        double sum = 0;

        //Если количество элементов ниже порогового значения, то выполнить далле обработку последовательно
        if ((end - start) < seqThresHold) {
            //суммировать значения элементов в массиве типа double
            for (int i = start; i < end; i++) sum += data[i];
        } else {
            //в противном случае продолжить разделение данных на меньше части

            //найти середину
            int middle = (start + end) / 2;

            //запустить новые подзадачи на выполнение, используя разделенные на части данные
            Sum subTaskA = new Sum(data, start, middle);
            Sum subTaskB = new Sum(data, middle, end);

            //запустить каждую подзадачу путем разветвления
            subTaskA.fork();
            subTaskB.fork();

            //Ожидать завершения подзадач и накопить результаты
            sum = subTaskA.join() + subTaskB.join();
        }
        //возвратить конечную сумму
        return sum;
    }
}
//продемонстрировать параллельное выполнение

public class RecurTaskDemo {
    public static void main(String[] args) {
        //создать пул задач
        ForkJoinPool fjp = new ForkJoinPool();

        double[] nums = new double[5000];

        //инициализировать массив nums чередующимися положительными и отрицательными значениями
        for (int i = 0; i < nums.length; i++)
            nums[i] = (double) (((i % 2) == 0) ? i : -i);
        Sum task = new Sum(nums, 0, nums.length);

        //Запустить задачи типа ForkJoinTask. Обратите внимание на то, что в данном
        // случае метод Invoke() возвращает результат
        double summation = fjp.invoke(task);
        System.out.println("Суммирование " + summation);
    }
}
