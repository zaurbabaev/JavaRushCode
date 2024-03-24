package az.babayev.javarush.javasyntax.repetition.collections;

import java.util.ArrayList;
import java.util.List;

public class ArrayListExample7 {
    public static List<String> initList() {
        String glassTop = "           🍷        ";
        String glassSecond = "       🍷🍷       ";
        String glassThird = "       🍷🍷🍷      ";
        String glassFourth = "     🍷🍷🍷🍷     ";
        String glassFifth = "     🍷🍷🍷🍷🍷   ";
        String glassSixth = "    🍷🍷🍷🍷🍷🍷  ";
        String glassSeventh = " 🍷🍷🍷🍷🍷🍷🍷 ";
        String glassEight = " 🍷🍷🍷🍷🍷🍷🍷🍷 ";

        List<String> list = new ArrayList<>() {
            {
                add(glassEight);
                add(glassSeventh);
                add(glassSixth);
                add(glassFifth);
                add(glassFourth);
                add(glassThird);
                add(glassSecond);
                add(glassTop);
            }
        };
        return list;
    }

    public static void removeGlassesReverse(List<String> glasses) {
        System.out.println("Начинаем разбирать пирамиду...");
        ArrayList<String> copy = new ArrayList<>(glasses);
        for (int i = 0; i < copy.size(); i++) {
            int index = copy.size() - 1 - i;
            glasses.remove(index);
        }
        if (glasses.isEmpty()) {
            System.out.println("Пирамида разобрана!");
        }
    }

    public static void print(List<String> glasses) {
        for (int i = glasses.size() - 1; i >= 0; i--) {
            System.out.println(glasses.get(i));
        }
    }

    public static void main(String[] args) {
        List<String> strings = initList();
        print(strings);
        removeGlassesReverse(strings);
        print(strings);
    }
}
