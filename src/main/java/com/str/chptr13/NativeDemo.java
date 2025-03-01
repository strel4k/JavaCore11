package main.java.com.str.chptr13;

public class NativeDemo {
    int i;
    public static void main(String[] args) {
        NativeDemo ob = new NativeDemo();

        ob.i = 10;

        System.out.println("Содержимое переменной ob.i перед вызовом платфоременно-ориентированного метода" + ob.i);
        ob.test();      //вызвать платформенно0ориентированный метод
        System.out.println("Содержимое переменной ob.i после вызова платфоременно-ориентированного метода" + ob.i);
    }
    //объявить платформенно-ориентированный метод
    public native void test();

    //загрузить библиотеку DLL содержащую статический метод
    static {
        System.loadLibrary("Native Demo");
    }
}
