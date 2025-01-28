// В этой версии класса Вох один объект допускается
// инициализировать другим объектом

class Box {
    double width;
    double height;
    double depth;

    // Обратите внимание на этот конструктор в качестве параметра в нем используется объект типа Вох
    Box(Box ob) {       // передать объект конструктору
        width = ob.width;                               //Создает новый объект, копируя размеры из другого объекта Box
        height = ob.height;
        depth = ob.depth;
    }

    //конструктор, используемый при указании всех размеров
    Box(double w, double h, double d) {                 //Устанавливает размеры, переданные в параметры.
        width = w;
        height = h;
        depth = d;
    }

    //конструктор, используемый, если ни один из размеров не указан
    Box() {
        width = -1;         // исполь зовать значение -1 для обозначения неинициализированного параллелепипеда
        height = -1;
        depth = -1;
    }

    //конструктор, используемый при создании куба
    Box(double len) {
        width = height = depth = len;
    }

    //рассчитать и возвратить объем параллелепипеда
    double volume() {
        return width * height * depth;
    }
}

class OverloadCons2 {
    public static void main(String args[]) {

        //создать параллелепипеды используя разные конструкторы
        Box mybox1 = new Box(10,20,15);
        Box mybox2 = new Box();
        Box mycube = new Box(7);
        Box myclone = new Box(mybox1);

        // создать копию объекта mybox1
        double vol;

        //получить объем первого параллелепипеда
        vol = mybox1.volume();
        System.out.println("Oбъeм mybox1 равен " + vol);

        // получить объем второго параллелепипеда
        vol = mybox2.volume();
        System.out.println("Oбъeм mybox2 равен " + vol);

        // получить объем куба
        vol = mycube.volume();
        System.out.println("Oбъeм куба равен " + vol);

        //получить объем клона
        vol = myclone.volume();
        System.out.println("Oбъeм клона равен " + vol);
    }
}