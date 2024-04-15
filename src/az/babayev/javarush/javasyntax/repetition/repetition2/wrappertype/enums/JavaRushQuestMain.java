package az.babayev.javarush.javasyntax.repetition.repetition2.wrappertype.enums;

public class JavaRushQuestMain {
    public static void main(String[] args) {
        for (JavaRushQuest value : JavaRushQuest.values()) {
            System.out.println(value.ordinal());
        }
    }
}
