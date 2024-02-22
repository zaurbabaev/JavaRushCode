package az.babayev.javarush.javacore.task.task5.task1502;

public class Solution {

    public static void main(String[] args) {
        Goose goose=new Goose();
        System.out.println(goose.getSize());

        Dragon dragon=new Dragon();
        System.out.println(dragon.getSize());
    }
    public static class BigAnimal {
        protected String getSize() {
            return "как динозавр";
        }
    }

    public static class SmallAnimal {
        String getSize() {
            return "как кошка";
        }
    }

    public static class Goose extends SmallAnimal {

        @Override
        public String getSize() {
            return "Гусь маленький, " + super.getSize();
        }
    }

    public static class Dragon extends BigAnimal {

        @Override
        public String getSize() {
            return "Дракон большой, " + super.getSize();
        }
    }
}
