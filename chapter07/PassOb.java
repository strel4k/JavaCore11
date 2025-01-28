//Объекты допускается передавать методам в качестве параметров
class Test {
    int a,b;

    Test(int i, int j) {
        a = i;
        b = j;
    }

    //возвратить логическое значение true если в качесвте параметра о указан вызывающий объект
    boolean equals(Test o) {                    //equals() проверяет в классе Test на равенство два объектa и возвращает получаемый результат.
        if (o.a == a && o.b == b) return true;
        else return false;
    }
}

class PassOb {
    public static void main(String args[]) {
        Test ob1 = new Test(100, 22);
        Test ob2 = new Test(100,22);
        Test ob3 = new Test(-1,-1);

        System.out.println("ob1==ob2: " + ob1.equals(ob2));
        System.out.println("ob2==ob3: " + ob1.equals(ob3));
    }
}