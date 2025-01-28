//В данном примере конструкторы определяются в классе Вох для инициализации размеров параллелепипеда тремя разными способам
class Box {
    double width;
    double height;
    double depth;

    //конструктор, используемый прои указании всех размеров
    Box(double w, double h, double d) {
        width = w;
        height = h;
        depth = d;
    }

    //конструктор используемый когжа ни один из размеров не указан
    Box() {
        width = -1;     //использовать значение -1 для обозначения неинициализированного параллелепипеда
        height = -1;
        depth = -1;
    }

    //Конструктор используемый при создании куба
    Box(double len) {
        width = height = depth = len;
    }

    //рассчитать и возвратить объем
    double volume() {
        return width * height * depth;
    }
}

class OverloadCons {
    public static void main(String args[]) {
        // создание параллелепипеда через разные конструкторы
        Box mybox1 = new Box(10, 20,15);
        Box mybox2 = new Box();
        Box mycube = new Box(7);

        double vol;

        //получить объем первого параллелепипеда
        vol = mybox1.volume();
        System.out.println("Объем mybox1 равен " + vol);

        //получить объем второго параллелепипеда
        vol = mybox2.volume();
        System.out.println("Объем mybox2 равен " + vol);

        //получить объем куба
        vol = mycube.volume();
        System.out.println("Объем mycube равен " + vol);
    }
}