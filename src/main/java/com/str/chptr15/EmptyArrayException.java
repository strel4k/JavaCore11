package main.java.com.str.chptr15;
//Сгенерировать исключение из лямбда выражение
interface DoubleNumericArrayFunc {
    double func(double[] n) throws EmptyArrayException;
}

public class EmptyArrayException extends Exception {
    EmptyArrayException() {
        super("Массив пуст");
    }
}

class LambdaExceptionDemo {
    public static void main(String[] args) throws EmptyArrayException {
        double[] values = { 1.0, 2.0, 3.0, 4.0 };

        //В этом лямбда-выражении вычисляется среднее числовых
        //значений типа double

        DoubleNumericArrayFunc average = (n) -> {
            double sum = 0;

            if (n.length == 0)
                throw new EmptyArrayException();

            for (int i=0; i < n.length; i++)
                sum += n[i];

            return sum/ n.length;
        };

        System.out.println("Среднее равно " + average.func(values));

        // Эта строка кода приводит к генерированию исключения
        System.out.println("Среднее равно " + average.func(new double[0]));
    }
}
