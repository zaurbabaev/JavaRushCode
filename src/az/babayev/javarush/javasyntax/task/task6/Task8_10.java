package az.babayev.javarush.javasyntax.task.task6;

/*
1. В классе Task8_10 создать public static класс Idea.
2. В классе Idea создать метод public String getDescription(), который будет возвращать любую строку.
3. В классе Solution создай статический метод public void printIdea(Idea idea),
который будет выводить на экран описание идеи - это то, что возвращает метод getDescription().
 */
public class Task8_10 {
    public static void printIdea(Idea idea) {
        String description = idea.getDescription();
        System.out.println(description);
    }

    public static void main(String[] args) {
        printIdea(new Idea());
    }

    public static class Idea {
        public String getDescription() {
            return "text";
        }


    }
}
