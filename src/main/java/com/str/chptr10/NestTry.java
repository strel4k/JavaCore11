package main.java.com.str.chptr10;

public class NestTry {
    public static void main(String[] args) {
        try {
            int a = args.length;
            //Если не указаны агрументы командной строки в след операторе будет сгенерировано
            //исключение в связи с делением на 0
            int b = 42 / a;
            System.out.println("a = " + a);

            try { //вложенный блок try
                //если указан один аргумент  командной строки то исклкючегие в связи с делением на 0
                //будет сгенерировано след коде
                if (a==1) a = a/ (a-a); // деление на 0
                //если указаны 2 аргумента командной строки то генерируется исключение
                //в связи с выходом за пределы массива

                if (a==2) {
                    int c[] = {1};
                    c[42] = 99; //здесь генерируется искключение в связи
                                //c с выходом за пределы массива
                }
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("Индекс за пределами массива: " + e);
            }
        } catch (ArithmeticException e) {
            System.out.println("Деление на 0: " + e);
        }
    }
}
