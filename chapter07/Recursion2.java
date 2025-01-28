class RecTest {
    int values[];

    RecTest(int i) {
        values = new int[i];            // Принимает целое число i, создавая массив values длиной i
    }

    //вывести рекурсивно элементы массива
    void printArray(int i) {
        if(i==0) return;                // Базовый случай: если i равно 0, завершить рекурсию
        else printArray(i-1);         // Рекурсивный вызов для i-1
        System.out.println("[" + (i-1) + "] " + values[i-1]);   // Вывод текущего элемента
    }
}

class Recursion2 {
    public static void main(String args[]) {
        RecTest ob = new RecTest(10);       //Создается объект ob класса RecTest с массивом из 10 элементов.
        int i;

        for (i=0; i<10; i++) ob.values[i] = i;
        ob.printArray(10);                  //Метод вызывается с i = 10
    }
}