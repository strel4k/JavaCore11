class BreakLoop4 {
    public static void main(String args[]) {
        outer: for (int i=0; i<3; i++) {            //Внешний цикл управляет количеством "проходов". Переменная i принимает значения от 0 до 2.
            System.out.print("Проход " + i + ": ");
            for (int j=0; j<100; j++) {             //Внутренний цикл управляет выводом чисел от 0 до 99
                if (j == 10) break outer; // выход из обоих циклов, Оператор завершает выполнение не только внутреннего цикла, но и внешнего цикла, связанного с меткой outer
                System.out.print(j + " ");
            }
            System.out.println("Не выведется");
        }
        System.out.println("Циклы завершены");
    }
}