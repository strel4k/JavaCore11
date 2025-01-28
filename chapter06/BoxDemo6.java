// В данном примере программы для инициализации размеров параллелепипеда в классе Вох применяется конструктор
class Box {
    double width;
    double height;
    double depth;

    // Это конструктор класса Box
    Box() {
        System.out.println("КОнструирование объекта Box");
        width = 10;
        height = 10;
        depth = 10;
    }

    // Рассчитать и возвратить объем
    double volume() {
        return width * height * depth;
    }
}
class BoxDemo6 {
    public static void main(String args[]) {
        // объявить, выделить память и инициализировать объекты Box
        Box mybox1 = new Box();                             // Вызывает конструктор класса
        Box mybox2 = new Box();

        double vol;

        // получить обхем первого параллелепипеда
        vol = mybox1.volume();
        System.out.println("Объем первого параллелепипеда равен" + vol);

        // получить обхем второго параллелепипеда
        vol = mybox2.volume();
        System.out.println("Объем перового параллелепипеда равен" + vol);
    }
}