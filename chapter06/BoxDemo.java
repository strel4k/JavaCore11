class Box {
    double width;
    double height;
    double depth;
}

//В этом классе объеявляется обхект типа Box
class BoxDemo {
    public static void main(String args[]) {
        Box mybox = new Box();
        double vol;
                // присвоить значение переменным экземпляра mybox
        mybox.width = 10;
        mybox.height = 20;
        mybox.depth = 15;

        // рассчитаем объем параллелепипеда
        vol = mybox.width * mybox.height * mybox.depth;
        System.out.println("Объем равен " + vol);
    }
}