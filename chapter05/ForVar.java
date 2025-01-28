class ForVar {
    public static void main(String args[]) {
        int i;
        boolean done = false;

        i = 0;      // инициализатор
        for( ; !done; ) {
            System.out.println("i равно " + i);
            if (i == 10) done = true;           //выполнется пока i не станет 10 (0-10) итератор
            i++;
        }
    }
}