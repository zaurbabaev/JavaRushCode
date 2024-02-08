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

        int result =Operationable((a, b) -> 38 + 46);
        System.out.println(operationable1);

    }
}

interface Operationable {

    int calculate(int x, int y);
}
