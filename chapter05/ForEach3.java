// Применение цикла for в стиле for each для обращения к двухмерному массиву
class ForEach3 {
    public static void main(String args[]) {
        int sum = 0;
        int nums[][] = new int[3][5];       //создаётся двумерный массив размером 3строки x 5столбцов

        //присовить значение элементам массива nums
        for (int i = 0; i < 3; i++)         // i проходит по строкам (0, 1, 2)
            for (int j = 0; j < 5; j++)     // j проходит по столбцам (0, 1, 2, 3, 4)
                nums[i][j] = (i+1) * (j+1); // заполняет массив произведениями индексов строки (i + 1) и столбца (j + 1), начиная с 1 (вместо 0)

        //использовать цикл for в стиле for each для вывода и суммирования значений
        for (int x[] : nums) {              // берёт каждую строку массива nums и присваивает её ссылке x (одномерный массив)
            for (int y : x) {               // Внутренний цикл проходит по всем элементам строки "x" (одномерного массива) "y" принимает значение каждого элемента строки.
                System.out.println("Значение равно: " + y);
                sum += y;
            }
        }
        System.out.println("Сумма: " + sum);
    }
}