package az.babayev.javarush.javasyntax.lection19;

public class Lambda {
    public static void main(String[] args) {
        Operationable operationable = new Operationable() {
            @Override
            public int calculate(int x, int y) {
                return x + y;
            }
        };
        int calculate = operationable.calculate(34, 4);
        System.out.println(calculate);

      
    }
}

interface Operationable {

    int calculate(int x, int y);
}
