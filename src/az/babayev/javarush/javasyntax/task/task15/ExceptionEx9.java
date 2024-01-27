package az.babayev.javarush.javasyntax.task.task15;

import java.util.Arrays;

/*
В методе main перехвати исключение и выведи его стектрейс.
 */
public class ExceptionEx9 {
    public static void main(String[] args) {
        try {
            dangerousMethod();
        } catch (Exception exception) {
            exception.printStackTrace();
        }
    }

    public static void dangerousMethod() throws Exception {
        throw new Exception("Mu-ha-ha!");
    }
}
