// Применение абстрактных методов
abstract class Figure {
    double dim1;
    double dim2;
    Figure(double a, double b) {
        dim1 = a;
        dim2 = b;
    }

    // теперь метод  area() объявляется абстрактным
    abstract double area();     //объявлен абстрактный метод area(), который должен быть реализован в подклассах.
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

    double area() {
        System.out.println("В области четырехугольника.");
        return dim1 * dim2 / 2;
    }
}

class AbstractAreas {
    public static void main(String args[]) {
        // Figure f = new Figure(10, 10) // теперь недопустимо
        Rectangle r = new Rectangle(9,5);
        Triangle t = new Triangle(10, 8);
        Figure figref; //верно но объект не создается

        figref = r;         //Вызывается метод area() для каждого объекта через ссылку типа Figure, демонстрируя полиморфизм.
        System.out.println("Площадь равна " + figref.area());

        figref = t;
        System.out.println("Площадь равна " + figref.area());

    }
}