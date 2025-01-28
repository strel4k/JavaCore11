// теперь метод Volume() возвращает объем параллелепипеда
class Box {
    double width;
    double height;
    double depth;

    //вывести объем параллелепипеда
    double volume() {
        return width * height * depth;
    }
}

class BoxDemo4 {
    public static void main(String args[]) {
        Box mybox1 = new Box();
        Box mybox2 = new Box();
        double vol;

        //присвоить значение переменным экземпляра mybox1
        mybox1.width = 10;
        mybox1.height = 20;
        mybox1.depth = 15;

        //присвоить значение переменным экземпляра mybox2
        mybox2.width = 3;
        mybox2.height = 6;
        mybox2.depth = 9;

        //вывести объем первого параллелепипеда
        vol = mybox1.volume();
        System.out.println(" Oбъeм равен " + vol);
        //вывести объем второго параллелепипеда
        vol = mybox2.volume();
        System.out.println(" Oбъeм равен " + vol);

    }
}