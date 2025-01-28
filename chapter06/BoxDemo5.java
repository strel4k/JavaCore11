class Box {
    double width;
    double height;
    double depth;

    //рассчитать и возвратить объем
    double volume() {
        return width * height * depth;
    }
    // установить размеры параллелепипеда
    void setDim(double w, double h, double d) {
        width = w;
        height = h;
        depth = d;
    }
}

class BoxDemo5 {
    public static void main(String args[]) {
        Box mybox1 = new Box();
        Box mybox2 = new Box();
        double vol;

        // инициализировать каждый экхемпляр класса Box
        mybox1.setDim(10,20,15);
        mybox2.setDim(3,6,9);

        // получить объем первого параллелепипеда
        vol = mybox1.volume();
        System.out.println("Объем равен " + vol);

        // получить объем первого параллелепипеда
        vol = mybox2.volume();
        System.out.println("Объем равен " + vol);
    }
}