class Box {
    double width;
    double height;
    double depth;
}

class BoxDemo2 {
    public static void main(String args[]) {
        Box mybox1 = new Box();
        Box mybox2 = new Box();
        double vol;

        // присвоить значения переменным экземпляра mybox1
        mybox1.width = 10;
        mybox1.height = 20;
        mybox1.depth = 15;

        // присвоить значения переменным экземпляра mybox2
        mybox2.depth = 9;
        mybox2.width = 3;
        mybox2.height = 6;

        //объем 1 параллелепипеда
        vol = mybox1.depth * mybox1.height * mybox1.width;
        System.out.println("Объем первого равен: " + vol);

        vol = mybox2.depth * mybox2.height * mybox2.width;
        System.out.println("Объем второго равен: " + vol);

    }
}