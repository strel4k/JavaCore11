class DoWhile {
    public static void main(String args[]) {
        int n = 10;
//        do {
//            System.out.println("такт " + n);
//            n--;
//        } while (n > 0);

        do {
            System.out.println("такт " + n);
        } while (--n > 0);                      //код все равно выполняется по условие не станет истиной
    }
}