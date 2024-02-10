package az.babayev.javarush.javasyntax.task.task19.task1803;

import java.util.Comparator;

public class NameComparator implements Comparator<JavaRushMentor> {
    @Override
    public int compare(JavaRushMentor o1, JavaRushMentor o2) {
        return o1.getName().length() - o2.getName().length();
    }
}
