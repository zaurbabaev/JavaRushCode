package az.babayev.javarush.javasyntax.task.task08;

/*
Перед тобой 5 общеизвестных величин.
Перепиши их в более читаемый формат — экспоненциальный.
Мантиcса должна представлять собой дробное число от 1.0 до 10.
После изменения формата чисел реальное значение, хранимое в переменной, не должно измениться.

Пример:
109.1678 — обычная форма;
1.091678E+2 — экспонентная форма записи.
 */
public class ExpanentaExample {
    public static void main(String[] args) {
        double earthDiameter = 12742.0;
        double lightSpeed = 299792458.0;
        double uraniumAtomicMass = 238.0289;
        double averageBeeWeight = 0.085;
        double javaDeveloperSalary = 10000.0;

        double earthDiameterExponenta = 1.2742E+4;
        double lightSpeedExpanenta = 2.99792458E+8;
        double uraniumAtomicMassExpanenta = 2.380289E+2;
        double averageBeeWeightExpanenta = 8.5E-2;
        double javaDeveloperSalaryExpanenta = 1.0000E+4;
        System.out.println(earthDiameterExponenta);
        System.out.println(lightSpeedExpanenta);
        System.out.println(uraniumAtomicMassExpanenta);
        System.out.println(averageBeeWeightExpanenta);
        System.out.println(javaDeveloperSalaryExpanenta);

        double d=0.0034;
        double d1=3.4E-3;
        System.out.println(d1);


    }
}
