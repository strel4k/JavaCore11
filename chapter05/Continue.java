class Continue {
    public static void main(String args[]) {
        for (int i=0; i<10; i++) {
            System.out.print(i+ " ");
            if (i%2 == 0) continue;     //Проверяется, делится ли текущее значение i на 2 без остатка (i % 2 == 0) Если условие истинно (т.е. i чётное), оператор continue пропускает оставшуюся часть тела цикла и переходит к следующей итерации.
            System.out.println("");     //Эта строка выполняется только тогда, когда значение i нечётное, так как для чётных значений цикл прерывается continue до её выполнения.
        }
    }
}