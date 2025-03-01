package main.java.com.str.chptr15;
//продемонстрировать применение ссылка на метод экземпляра

//функциональный интерфейс для операций с символьными строками
interface StringFunc2 {
    String func(String n);
}

//теперь в этом классе определяется метож экземпляра strReverse()
class MyStringOps1 {
    String strReverse(String str) {
        String result = "";
        int i;
        for (i = str.length()-1; i >= 0; i--)
            result += str.charAt(i);
        return result;
    }
}
public class MethodRefDemo2 {
    // В этом методе функциональный интерфейс указывается в качестве типа первого его параметра.
    //следовательно ему может быть передан люой экземпляр этого интерефейса включая ссылку на метод
    static String stringOp(StringFunc2 sf, String s) {
        return sf.func(s);
    }

    public static void main(String[] args) {
        String inStr = "Лямбда выражения повышают эффективность Java";
        String outStr;

        //создать обхект типа MyStringOps
        MyStringOps1 strOps = new MyStringOps1();

        //А теперь ссылка на метод экземпляра strReverse()
        //передается методу stringOp()
        outStr = stringOp(strOps::strReverse, inStr);
        System.out.println("Исх строка" + inStr);
        System.out.println("Обращ строка " + outStr);
    }
}
