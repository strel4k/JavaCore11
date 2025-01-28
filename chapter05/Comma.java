class Comma {
    public static void main(String args[]) {
        int a,b;

        for (a=1, b=4; a<b; a++, b--) {    //(инициализация, проверку условий и итерация)
            System.out.println("a = " + a);
            System.out.println("b = " + b);
        }
    }
}