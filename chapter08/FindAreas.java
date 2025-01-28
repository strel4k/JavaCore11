// Применение полиморфизма во время выполнения
class Figure {
    double dim1;
    double dim2;

    Figure(double a, double b) {
        dim1 = a;
        dim2 = b;
    }

    double area() {
        System.out.println("Площадь фигуры не определена.");
        return 0;
    }
}

class Rectangle extends Figure {
    Rectangle(double a, double b) {
        super(a, b);
    }
    // переопределить метод area() для четырехугольника
    double area() {
        System.out.println("В области четырехугольника.");
        return dim1 * dim2;
    }
}

class Triangle extends Figure {
    Triangle(double a, double b) {
        super(a, b);
    }
    //переопределить метод area() для прямого треугольника
    double area() {
        System.out.println("В области треугольника.");
        return dim1 * dim2 / 2;
    }
}

class FindAreas {
    public static void main(String args[]) {
        Figure f = new Figure(10, 10);
        Rectangle r = new Rectangle(9, 5);
        Triangle t = new Triangle(10, 8);
        Figure figref;

        figref = f;
        System.out.println("Площадь равна " + figref.area());

        figref = r;
        System.out.println("Площадь равна " + figref.area());

        figref = t;
        System.out.println("Площадь равна " + figref.area());
    }
}
//Полиморфизм Позволяет использовать одну ссылку базового типа для работы с объектами разных классов.
//Вызов метода определяется фактическим типом объекта во время выполнения.
//Можно легко добавить новые фигуры, просто унаследовав класс Figure и переопределив метод area()