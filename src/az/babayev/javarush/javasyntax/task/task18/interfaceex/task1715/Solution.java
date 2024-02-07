package az.babayev.javarush.javasyntax.task.task18.interfaceex.task1715;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/*
В деревне Вилларибо есть струнный оркестр, а в деревне Виллабаджо — клавишный.
Как-то раз повозки с музыкантами из двух деревень столкнулись на перекрестке,
и все смешалось в кучу.
Помоги артистам разобрать свои инструменты. И естественно, после этого оба
оркестра должны дать концерт.

Для этого:

в методе createKeyboardOrchestra() добавь в список orchestra один орган и
три пианино;
в методе createStringedOrchestra() добавь в список orchestra две скрипки и
одну гитару;
метод playOrchestra() должен вызывать метод play() у всех элементов списка
orchestra.
 */
public class Solution {
    public static void main(String[] args) {
        createKeyboardOrchestra();
        createStringedOrchestra();
        playOrchestra();
    }

    static List<MusicalInstrument> orchestra = new ArrayList<>();


    public static void createKeyboardOrchestra() {
        Collections.addAll(orchestra, new Organ(), new Piano(), new Piano(), new Piano());
    }

    public static void createStringedOrchestra() {
        Collections.addAll(orchestra, new Violin(), new Violin(), new Guitar());
    }

    public static void playOrchestra() {
        for (MusicalInstrument musicalInstrument : orchestra) {
            musicalInstrument.play();
        }
    }
}
