// В этом классе определяется целочисленный стек, в котором можно хранить до 10 целочисленных значений
class Stack {
    int stck[] = new int[10]; //Массив stck фиксированного размера 10 используется для хранения элементов стека.
    int tos;    //tos (вершина стека) указывает на текущую вершину стека.Изначально инициализируется значением -1, что означает, что стек пуст.

    //инициализация вершины сэка
    Stack() {   //Этот конструктор вызывается при создании объекта Stack и устанавливает начальное значение вершины стека (tos) в -1
        tos = -1;
    }

    //разместить элемент в стеке
    void push(int item) {   //метод добавляет (помещает) элемент в стек.
        if (tos==9)
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