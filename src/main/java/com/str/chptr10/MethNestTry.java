package main.java.com.str.chptr10;

// операторы try могут быть неявно вложены в вызовы методов
public class MethNestTry {
    static void nesttry(int a) {
        try { //вложенный блок оператора try
            // если укказан один аргумент командой строки
            //то ислкючение  в связи с делением на 0 будет сгенерировано в след коде
            if (a==1) a = a/(a-a); //деление на 0
            // если указаны два аргуента ккомандой строки то генерируется исключение в
            // связи с выходом за пределы массива
            if (a==2) {
                int c[] = {1};
                c[42] = 99; // генерируютсяя исключение в связи с выходом за пределы массива
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Индеккс за пределами массива: " + e);
        }
    }

    public static void main(String[] args) {
        try {
            int a = args.length;
            //если не указаны аргументы то в след операторе будет сгенерировано
            // исключение в связи с делением на 0
            int b = 42 / 0;
            System.out.println("a = " + a);
            nesttry(a);
        } catch (ArithmeticException e) {
            System.out.println("Деление на 0: " + e);
        }
    }

}
