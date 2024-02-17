package az.babayev.javarush.javacore.task.task2.task1218;

/*
Есть public интерфейсы CanFly (летать), CanMove (передвигаться), CanEat (есть).
Добавь эти интерфейсы классам Dog (собака), Car (автомобиль), Duck (утка),
Airplane (самолет).
 */
public class Solution {
    public interface CanFly {
        void fly();
    }

    public interface CanMove {
        void move();
    }

    public interface CanEat {
        void eat();
    }

    public class Dog implements CanMove,CanEat {

        @Override
        public void eat() {

        }

        @Override
        public void move() {

        }
    }

    public class Duck implements CanMove, CanFly, CanEat {

        @Override
        public void fly() {

        }

        @Override
        public void move() {

        }

        @Override
        public void eat() {

        }
    }

    public class Car implements CanMove {

        @Override
        public void move() {

        }
    }

    public class Airplane implements CanMove, CanFly {

        @Override
        public void fly() {

        }

        @Override
        public void move() {

        }
    }
}
