package az.babayev.javarush.javasyntax.task.task14.enumEx;

public class SolutionJavaRushQuest {
    public static void main(String[] args) {
        JavarushQuest[] values = JavarushQuest.values();
        for (JavarushQuest value : values) {
            System.out.println(value.ordinal());
        }


    }
}
