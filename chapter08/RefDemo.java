class Box {
    double width;
    double height;
    double depth;

    // сконструировать клон объекта
    Box(Box ob) { // передать объект конструктору
        width = ob.width;
        height = ob.height;
        depth = ob.depth;
    }

    // Конструктор применяемый при указании всех размеров
    Box(double w, double h, double d) {
        width = w;
        height = h;
        depth = d;
    }

    // конструктор применяеый в отсутствии размеров
    Box() {
        width = -1;     //Значение -1 для неинициализированного параллелепипеда
        height = -1;
        depth = -1;
    }

    // конструктор применяемый при создании куба
    Box(double len) {
        width = height = depth = len;
    }

    // рассчитать и возвратить объем
    double volume() {
        return width * height * depth;
    }
}
// расширить класс Box включив в него поле веса
class BoxWeight extends Box {
    double weight;      // вес параллелепипеда

    // конструктор BoxWeight()
    BoxWeight(double w, double h, double d, double m) {
        super(w, h, d); // вызвать конструктор суперкласса
        weight = m;
    }
}

class RefDemo {
    public static void main(String args[]) {
        BoxWeight weightbox = new BoxWeight(3, 5, 7, 8.37);
        Box plainbox = new Box();
        double vol;

        vol = weightbox.volume();
        System.out.println("Объем weightbox равен " + vol);
        System.out.println("Вес weightbox равен " + weightbox.weight);
        System.out.println("");
    }
}