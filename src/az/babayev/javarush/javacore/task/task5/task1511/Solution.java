package az.babayev.javarush.javacore.task.task5.task1511;

import java.io.Serializable;

public class Solution {
    public static void main(String[] args) {
        JuniorJavDev me = new JuniorJavDev();
        System.out.println(me.askHubert("What do yo think about this task?"));
        System.out.println(me.askZapp("When will the next update happen?"));
    }

    public interface SpecificSerializable extends Serializable {

    }

    public static class JavaDev implements SpecificSerializable {
        String answerQuestion(String question) {
            return String.format("I'll be thinking of[%s]", question);
        }
    }

    public static class JuniorJavDev {

        JavaDev zapp = new JavaDev();
        JavaDev hubert = new JavaDev();

        String askZapp(String question) {
            return zapp.answerQuestion(question);
        }

        String askHubert(String question) {
            return hubert.answerQuestion(question);
        }
    }
}
