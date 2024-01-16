package az.babayev.javarush.javasyntax.task.task12.lonely_cars;

/*
Двигатель — сложный механизм, для описания которого недостаточно обычной переменной.
В классе Car создай внутренний класс (inner class) Engine.
В классе Engine создай boolean поле isRunning, которое принимает значение true,
если двигатель запущен, и false в противном случае.
Также в этот класс добавь методы start и stop,
которые будут запускать/останавливать двигатель
(устанавливать соответствующее значение полю isRunning).
Чтобы использовать двигатель, создай поле engine типа Engine в классе Car.
 */
public class Car2 {
    private Engine engine;

    public static void main(String[] args) {
        Car2 car = new Car2();
        car.engine = car.new Engine();
        car.engine.start();
        car.engine.stop();

    }


    public class Engine {

        private boolean isRunning;

        public void start() {
            this.isRunning = true;
        }

        public void stop() {
            this.isRunning = false;
        }


    }
}

