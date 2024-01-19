package az.babayev.javarush.javasyntax.task.task13;

import java.util.ArrayList;

/*
В классе PrintAnything есть метод printAnything(ArrayList),
который должен принимать список и выводить его содержимое в консоли.
Сейчас на вход принимается только список строк.
Твоя задача исправить метод так, чтобы принимался
список с любыми типами данных (для этого нужно удалить соответствующий дженерик).
Метод main не участвует в проверке.
 */
public class PrintAnything {
    public static void printAnything(ArrayList arrayList) {
        for (int i = 0; i < arrayList.size(); i++) {
            System.out.println(arrayList.get(i));
        }
    }

    public static void main(String[] args) {
        var arrayList = new ArrayList<>() {
            {
                add(15);
                add("Hello");
                add(154);
                add("string");
            }
        };
        printAnything(arrayList);
    }

}
