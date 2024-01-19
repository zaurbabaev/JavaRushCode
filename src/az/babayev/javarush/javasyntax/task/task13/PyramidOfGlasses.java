package az.babayev.javarush.javasyntax.task.task13;

import java.util.ArrayList;

/*
Задача простая: нужно разобрать пирамиду из бокалов,
в чем нам поможет метод removeGlassesReverse.
Этот метод должен снимать каждый ряд, начиная сверху (с конца списка).
Тебе нужно реализовать этот метод.
В тестировании тебе поможет метод main.
Попробуй запустить программу и посмотреть на вывод.
 */
public class PyramidOfGlasses {
    private static ArrayList<String> initList() {
        String glassTop = "       🍷       ";
        String glassSecond = "      🍷🍷      ";
        String glassThird = "     🍷🍷🍷     ";
        String glassFourth = "    🍷🍷🍷🍷    ";
        String glassFifth = "   🍷🍷🍷🍷🍷   ";
        String glassSixth = "  🍷🍷🍷🍷🍷🍷  ";
        String glassSeventh = " 🍷🍷🍷🍷🍷🍷🍷 ";
        String glassEighth = "🍷🍷🍷🍷🍷🍷🍷🍷";
        ArrayList<String> list = new ArrayList<>();
        list.add(glassEighth);
        list.add(glassSeventh);
        list.add(glassSixth);
        list.add(glassFifth);
        list.add(glassFourth);
        list.add(glassThird);
        list.add(glassSecond);
        list.add(glassTop);
        return list;
    }

    public static void print(ArrayList<String> glasses) {
        for (int i = glasses.size() - 1; i >= 0; i--) {
            System.out.println(glasses.get(i));
        }
    }

    public static void removeGlassesReverse(ArrayList<String> glasses) {
        System.out.println("Начинаем разбирать пирамиду...");
        ArrayList<String> copy = new ArrayList<>(glasses);
        for (int i = 0; i < copy.size(); i++) {
            int index = copy.size() - i - 1;
            glasses.remove(index);
        }
        if (glasses.isEmpty()) {
            System.out.println("Пирамида разобрана!");
        }
    }

    public static void main(String[] args) {
        ArrayList<String> glasses = initList();
        print(glasses);

        removeGlassesReverse(glasses);
        print(glasses);
    }
}
