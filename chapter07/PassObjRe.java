// Объекты передаются по ссылке на них
class Test {
    int a, b;

    Test(int i, int j) {
        a = i;
        b = j;
    }
    // передать обхект
    void meth(Test o) {         //Метод meth(Test o) принимает объект Test в качестве параметра
        o.a *= 2;               //o — это ссылка на объект, переданный методу. Через o можно изменить поля объекта.
        o.b /= 2;
    }
}

class PassObjRe {
    public static void main(String args[]) {
        Test ob = new Test(15,20);
        System.out.println("ob.a и оb.b до вызова: " + ob.a + " " + ob.b);

        ob.meth(ob);            //Параметр o в методе meth будет ссылкой на тот же объект, что и ob.

        System.out.println("ob.a и ob.b после вызова: " + ob.a + " " + ob.b);
    }
}