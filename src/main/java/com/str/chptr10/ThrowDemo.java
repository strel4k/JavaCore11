package main.java.com.str.chptr10;

public class ThrowDemo {
    static void demoproc() {
        try {
            throw new NullPointerException("Demonstration");
        } catch (NullPointerException e) {
            System.out.println("Исключение перехвачено в теле метода Demoproc()");
            throw e;
        }
    }

    public static void main(String[] args) {
        try {
            demoproc();
        } catch (NullPointerException e) {
            System.out.println("Повторный перехват: " + e);
        }
    }
}
