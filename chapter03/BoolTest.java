class BoolTest {
    public static void main(String args[]) {
        boolean b;

        b = false;
        System.out.println("b равно " + b);
        b = true;
        System.out.println("b равно " + b);

        //значение типа boolean может управлять оператором if
        if (b) System.out.println("Код выполняется.");
        b = false;
        if (b) System.out.println("Код не выполняется.");

        // результат сравнения - значение типа boolean
        System.out.println("10 > 9 равно " + (10 > 9));
    }
}