package az.babayev.javarush.javasyntax.task.task6;

/*
Реализуй метод main(String[]), который меняет знак элемента массива array на
противоположный, если значение этого элемента чётное.
 */
public class ArrayEx1 {
    public static int[] array = new int[]{-1, 2, 3, -4, -5};

    public static void main(String[] args) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) {
                array[i] = -(array[i]);
            }
        }
        for (int i : array) {
            System.out.println(i);
        }
    }
}