// В этом классе определяется целочисленный стек, в котором можно хранить до 10 целочисленных значений
class Stack {
    // теперь переменные являются закрытыми Это означает что они не могут быть случайно или намеренно изменены, чтоб нарушить стэк
    private int stck[];  //Массив stck фиксированного размера 10 используется для хранения элементов стека.
    private int tos;    //tos (вершина стека) указывает на текущую вершину стека.Изначально инициализируется значением -1, что означает, что стек пуст.

    //инициализация вершины сэка
    Stack(int size) {   //Этот конструктор вызывается при создании объекта Stack и устанавливает начальное значение вершины стека (tos) в -1
        stck = new int[size];
        tos = -1;
    }

    //разместить элемент в стеке
    void push(int item) {   //метод добавляет (помещает) элемент в стек.
        if (tos==stck.length-1)
            System.out.println("Стек заполнен.");
        else
            stck[++tos] = item;
    }
    //извлечь элемент из стэка
    int pop() {     //Этот метод извлекает (удаляет) элемент с вершины стека.
        if(tos < 0) {
            System.out.println("Стэк не загружен");
            return 0;       //Если в стеке есть элементы, метод возвращает элемент на текущей вершине (stck[tos])
        }
        else
            return stck[tos--];     // а затем уменьшает значение tos (tos--), сдвигая вершину вниз
    }
}

class TestStack2 {
    public static void main(String args[]) {
        Stack mystack1 = new Stack(5);
        Stack mystack2 = new Stack(8);

        //разместить числа в стеке
        for (int i=0; i<10; i++) mystack1.push(i);      //в стек (mystack1) добавляются числа от 0 до 9
        for (int i=10; i<20; i++) mystack2.push(i);     //во второй добавляются числа от 10 до 19
        //Метод push добавляет элементы в массив стека, обновляя вершину (tos)
        //извлечь эти числа из стека
        System.out.println("Coдepжимoe стека mystack1: ");
        for (int i=0; i<10; i++)
            System.out.println(mystack1.pop());         //Элементы извлекаются с помощью метода pop
        System.out.println("Coдepжимoe стека mystack2: ");
        for(int i=0; i<10; i++)
            System.out.println(mystack2.pop());

        //эти операторы недопустимы
        // mystack1.tos = -2;
        // mystack2.stck[3] = 100;
    }
}