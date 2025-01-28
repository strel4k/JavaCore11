//Простой пример рекурсии
class Factorial {
    //это рекурсивный метод
    int fact(int n) {
        int result;

        if(n==1) return 1;      // Базовый случай: факториал 1 равен 1 (Определяет, когда остановить рекурсию)
        result = fact(n-1) * n;     // Рекурсивный вызов для n-1 и умножение на n
        return result;
    }
}

class Recursion {
    public static void main(String args[]) {
        Factorial f = new Factorial();          //Создается объект f класса Factorial

        System.out.println("Факториал 3 равен " + f.fact(3));
        System.out.println("Факториал 4 равен " + f.fact(4));
        System.out.println("Факториал 5 равен " + f.fact(5));
    }
}