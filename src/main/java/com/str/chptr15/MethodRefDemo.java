package main.java.com.str.chptr15;
//Продемонстрировать ссылку на статический метод

//Функциональный интерфейс для операций с символьными строками

interface  StringFunc1 {
    String func(String n);
}
//в этом интерфейсе определяется статический метод strReverse()
class MyStringOps {
    //статический сетод изменяющий порядок следования символом в строке
    static  String strReverse(String str) {
        String result = "";
        int i;
        for (i = str.length()-1; i>=0; i--)
            result += str.charAt(i);

        return result;
    }
}

public class MethodRefDemo {
    // в этом методе функциональный интерфейс указывается в качестве типа перого его параметра
    //Следовательно ему может быть передан любой экземпляр этого интерфейса включая и ссылку на метод
    static String stringOp(StringFunc1 sf, String s) {
      return sf.func(s);
    };

    public static void main(String[] args) {
        String inStr = "Лямбда выраженя повышают ээфективность Джава";
        String outStr;

        //Здесь ссылка на метод strReverse() передается методу stringOp()
        outStr = stringOp(MyStringOps::strReverse, inStr);

        System.out.println("Исходная строка " + inStr);
        System.out.println("Обращенная строка " + outStr);
    }
}
