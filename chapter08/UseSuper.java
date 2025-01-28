// Использовать ключевое слово super с целью предотвратить сокрытие имен
class A {
    int i;
}

// Создать подкласс путем расширения класса А
class B extends A {
    int i;          //этот член i скрывает член i из класса А

    B(int a, int b) {
        super.i = a;    // член i из класса А
        i = b;          // член i из класса B
    }

    void show() {
        System.out.println("Член i в суперклассе: " + super.i);
        System.out.println("Член i в подклассе: " + i);
    }
}

class UseSuper {
    public static void main(String args[]) {
        B subOb = new B(1,2);

        subOb.show();
    }
}