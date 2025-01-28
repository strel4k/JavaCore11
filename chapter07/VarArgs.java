// Продемонстрировать применение аргументов переменной длины
class VarArgs {
    //теперь метод VaTest() обхявляется с аргументами переменной длины
    static void vaTest(int ... v) {
        System.out.print("Количество аргументов: " + v.length + " Сожержимое: ");

        for (int x : v)
            System.out.print(x + " ");

        System.out.println();
    }
    public static void main(String args[]) {
        vaTest(10); // 1 args
        vaTest(1, 2, 3); //3 args
        vaTest(); //no args
    }
}