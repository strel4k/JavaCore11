class TestStack {
    public static void main(String args[]) {
        Stack mystack1 = new Stack();
        Stack mystack2 = new Stack();

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
    }
}