package az.babayev.javarush.javacore.task.task4.task14161;

public class Solution {

    public static void main(String[] args) {
        CanSwim creature = new Orca();
        creature.swim();
        creature = new Whale();
        creature.swim();
        creature = new RiverOtter();
        creature.swim();


    }

    interface CanWalk {
        void walk();
    }

    interface CanSwim {
        void swim();
    }

    static abstract class SeaCreature implements CanSwim {
        @Override
        public void swim() {
            System.out.println(getCurrentCreature().getClass().getSimpleName() + " is swimming");


        }

        abstract CanSwim getCurrentCreature();
    }

    static class Orca extends SeaCreature implements CanSwim {

        @Override
        CanSwim getCurrentCreature() {
            return this;
        }
    }

    static class Whale extends SeaCreature implements CanSwim {

        @Override
        CanSwim getCurrentCreature() {
            return this;
        }
    }

    static class RiverOtter implements CanSwim, CanWalk {

        @Override
        public void walk() {

        }

        @Override
        public void swim() {
            System.out.println("River otter");
        }
    }


}
