//Аргументы переменной длины и перегрузка
class VarArgs3 {
    static void vaTest(int ... v) {
        System.out.print("vaTest(int ...): " + "Количество аргументов: " + v.length + "Содержимое: ");
        for (int x : v)                 // Проход по каждому аргументу Используется цикл for-each для доступа к каждому элементу.
            System.out.print(x + " ");
        System.out.println();
    }

    static void vaTest(boolean ... v) {
        System.out.print("vaTest(boolean ...) " + "Количество аргументов: " + v.length + " Сожержимое: ");
        for (boolean x : v)                 // Проход по каждому аргументу Используется цикл for-each для доступа к каждому элементу.
            System.out.print(x + " ");
        System.out.println();
    }
    static void vaTest(String msg, int ... v) {
        System.out.print("vaTest(String, int ...): " + msg + v.length + " Сожержимое: ");
        for (int x : v)                 // Проход по каждому аргументу Используется цикл for-each для доступа к каждому элементу.
            System.out.print(x + " ");
        System.out.println();
    }
    public static void main(String args[]) {
        vaTest(1,2,3);
        vaTest("Проверка: ", 10, 20);
        vaTest(true, false, false);
    }
}