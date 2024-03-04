package az.babayev.javarush.javacore.task.task6.task1615;

public class Solution {

    public static volatile Runway RUNWAY = new Runway();

    public static void main(String[] args) {
        Plane plane1 = new Plane("Самолет #1");
        Plane plane2 = new Plane("Самолет #2");
        Plane plane3 = new Plane("Самолет #3");
    }
    private static void waiting() {
        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {

        }
    }

    private static void takingOff() {
        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {

        }
    }

    public static class Plane extends Thread {
        public Plane(String name) {
            super(name);
            start();
        }


//        public void run() {
//            boolean isAlreadyTakenOff = false;
//            while (!isAlreadyTakenOff) {
//                if (RUNWAY.trySetTakingOffPlane(this)) {
//                    System.out.println(getName() + " взлетает");
//                    takingOff(); // взлетает
//                    System.out.println(getName() + " уже в небе");
//                    isAlreadyTakenOff = true;
//                    RUNWAY.setTakingOffPlane(null);
//                } else if (!this.equals(RUNWAY.getTakingOffPlane())) {
//                    System.out.println(getName() + " ожидает");
//                    waiting();
//                }
//            }
//        }

        public void run() {
            boolean isAlreadyTakenOff = false;  // Флаг, указывающий, взлетел ли уже текущий самолет
            while (!isAlreadyTakenOff) {  // Цикл будет выполняться, пока самолет не взлетит
                if (RUNWAY.trySetTakingOffPlane(this)) {  // Попытка занять взлетную полосу
                    System.out.println(getName() + " взлетает");
                    takingOff();  // Выполнение взлета (задержка потока)
                    System.out.println(getName() + " уже в небе");
                    isAlreadyTakenOff = true;  // Установка флага, что самолет уже взлетел
                    RUNWAY.setTakingOffPlane(null);  // Освобождение взлетной полосы для других самолетов
                } else if (!this.equals(RUNWAY.getTakingOffPlane())) {  // Если взлетная полоса занята другим самолетом (не текущим)
                    System.out.println(getName() + " ожидает");
                    waiting();  // Ожидание (задержка потока)
                }
            }
        }


    }

    public static class Runway {
        private Thread t;

        public Thread getTakingOffPlane() {
            return t;
        }

        public void setTakingOffPlane(Thread t) {
            synchronized (this) {
                this.t = t;
            }
        }

        public boolean trySetTakingOffPlane(Thread t) {
            synchronized (this) {
                if (this.t == null) {
                    this.t = t;
                    return true;
                }
                return false;
            }
        }
    }
}
