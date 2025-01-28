class BoolLogic {
    public static void main(String args[]) {
        boolean a = true;
        boolean b = false;
        boolean c = a | b;
        boolean d = a & b;
        boolean e = a ^ b;
        boolean f = (!a & b) | (a & !b);
        boolean g = !a;

        System.out.println("a = " + a);
        System.out.println("b = " + b);
        System.out.println("a | b = " + c);     // сложение (возвращает true если оно есть)
        System.out.println("a & b = " + d);     // умножение ( возвращает false если оно есть)
        System.out.println("a ^ b = " + e);     // обратное умножение
        System.out.println("(!a & b) | (a & !b) = " + f);
        System.out.println("!a = " + g);
    }
}