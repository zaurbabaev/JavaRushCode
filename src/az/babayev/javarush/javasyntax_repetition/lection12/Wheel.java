package az.babayev.javarush.javasyntax_repetition.lection12;

public class Wheel {
    int diameter;
    String position;

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("Whele{");
        sb.append("diameter=").append(diameter);
        sb.append(", position='").append(position).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
