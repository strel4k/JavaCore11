import java.util.Random;

interface SharedConstants {
    int NO = 0;
    int YES = 1;
    int MAYBE = 2;
    int LATER = 3;
    int SOON = 4;
    int NEVER = 5;
}

class Question implements SharedConstants {
    Random rand = new Random();
    int ask() {     //Метод ask() использует класс Random для генерации случайного числа и возвращает одно из значений, определенных в SharedConstants.
        int prob = (int) (100 * rand.nextDouble());
        if (prob < 30)
            return NO;
        else if (prob < 60)
            return YES;
        else if (prob < 75)
            return LATER;
        else if (prob < 98)
            return SOON;
        else
            return NEVER;
    }
}

class AskMe implements SharedConstants {
    static void answer(int result) {        //answer(int result), который принимает результат метода ask() из Question
        switch (result) {                   //и выводит текстовый ответ на основе значения result.
            case NO:
                System.out.println("Net");
                break;
            case YES:
                System.out.println("Da");
                break;
            case MAYBE:
                System.out.println("Vozmozhno");
                break;
            case LATER:
                System.out.println("Pozzhe");
                break;
            case SOON:
                System.out.println("Skoro");
                break;
            case NEVER:
                System.out.println("Nikogda");
                break;
        }
    }

    public static void main(String args[]) {
        Question q = new Question();
        answer(q.ask());
        answer(q.ask());
        answer(q.ask());
        answer(q.ask());
        answer(q.ask());

    }
}