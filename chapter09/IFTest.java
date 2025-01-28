//Определеить интерфейс целочисленного стека
interface IntStack {
    void push(int item); //сохранить элемент в стеке
    int pop();          // извлечь элемент из стека
}

// реализация интерфейса IntStack для стека фиксированного размера
class FixedStack implements IntStack {
    private int stck[];     //Использует массив stck[] для хранения элементов стека.
    private int tos;        //Переменная tos (top of stack) хранит индекс текущего верхнего элемента стека.
    //выделить память
    FixedStack(int size) {      //Выделяет память для массива и инициализирует tos значением -1, что обозначает пустой стек.
        stck = new int[size];
        tos = -1;
    }

    //разместить элемент в стеке
    public void push(int item) {
        if(tos==stck.length-1) //Добавляет элемент в стек, проверяя предварительно, не заполнен ли он.
            System.out.println("Стек заполнен.");
        else
            stck[++tos] = item;
    }

    //извлечь элемент из стека
    public  int pop() {     //Извлекает элемент из стека, проверяя предварительно, не является ли он пустым
        if(tos < 0) {
            System.out.println("Стек не загружен");
            return 0;
        }
        else
            return stck[tos--];
    }
}

class IFTest {
    public static void main(String args[]) {
        FixedStack mystack1 = new FixedStack(5);
        FixedStack mystack2 = new FixedStack(8);

        //разместить числа в стеке
        for (int i=0; i<5; i++) mystack1.push(i);
        for (int i=0; i<8; i++) mystack2.push(i);

        //извлечь эти числа из стека
        System.out.println("Стек в mystack1:");
        for (int i=0; i<5; i++)
            System.out.println(mystack1.pop());
        for (int i=0; i<8; i++)
            System.out.println(mystack2.pop());

    }
}