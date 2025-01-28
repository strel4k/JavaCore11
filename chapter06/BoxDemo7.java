/* В данном примере программы для инициализации размеров
параллелепипеда в классе Вох применяется параметризированный
конструктор
*/

class Box {
    double width;
    double height;
    double depth;

    // Это конструктор класса Box
    Box(double w, double h, double d) {
        width = w;
        height = h;
        depth = d;
    }

    // рассчитать и возвратить объем
    double volume() {
        return width * height * depth;
    }
}

class BoxDemo7 {
    public static void main(String args[]) {
        // объявить , выделить память и инициализировать объекты типа Вох
        Box mybox1 = new Box(10, 20, 15);
        Box mybox2 = new Box(3, 6, 9);

        double vol;

        // получить объем первого параллелепипеда
        vol = mybox1.volume();
        System.out.println ("Oбъeм равен " + vol);

        vol = mybox2.volume();
        System.out.println ("Oбъeм равен " + vol);
    }
}