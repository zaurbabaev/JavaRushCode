package az.babayev.javarush.javasyntax.task.task6;

/*
Реализовать статический метод double getDistance(x1, y1, x2, y2).
Он должен вычислять расстояние между точками.
Используй метод double Math.sqrt(double a),
 который вычисляет квадратный корень переданного параметра.
Найдем разницу между координатами:
x2−x1=3−12=−9
y2-y1=4-2=2
Возведем результаты в квадрат и сложим:
(−9)*2 +(2)*2=81+4=85
Извлечем квадратный корень и получим ответ:
sqrt 85=9.2195444572929 (85-i kök altına alırıq)


 */
public class Task8_03 {

    public static double getDistance(int x1, int y1, int x2, int y2) {
        double pow = Math.pow((x2-x1), 2) + Math.pow((y2 - y1), 2);
        return Math.sqrt(pow);
    }

    public static void main(String[] args) {
        double distance = getDistance(12, 2, 3, 4);
        System.out.println(distance);
    }


}
