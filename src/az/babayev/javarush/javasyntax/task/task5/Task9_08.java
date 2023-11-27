package az.babayev.javarush.javasyntax.task.task5;

/*
Разберись, что делает программа.
Найди и исправь одну ошибку в классе Circle. Метод main изменять нельзя.

Подсказка:
изучи конструктор по умолчанию.
 */
public class Task9_08 {
    public static class Circle {

        public Color color;

        public static void main(String[] args) {
            Circle circle = new Circle();

            circle.color.setDiscription("Red");
            System.out.println(circle.color.getDiscription());
        }

        public Circle() {
            color = new Color();
        }

        public class Color {
            String discription;

            public String getDiscription() {
                return discription;
            }

            public void setDiscription(String discription) {
                this.discription = discription;
            }
        }
    }
}