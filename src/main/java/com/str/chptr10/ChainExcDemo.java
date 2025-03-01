package main.java.com.str.chptr10;
//демонстрация цепочки исключений
public class ChainExcDemo {
    static void demproc() {
        //создать исключение
        NullPointerException e = new NullPointerException("Верхний уровень");
        //добавить причину исключения
        e.initCause(new ArithmeticException("Причина"));
        throw e;
    }

    public static void main(String[] args) {
        try {
            demproc();
        } catch (NullPointerException e) {
            //вывести исключение верхнего уровня
            System.out.println("Перехвачено исключение: " + e);

            // вывести исключение, послужившее причиной для исключения певрого уровня
            System.out.println("Первопричина: " + e.getCause());
        }
    }
}
